/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import GUI.*;
import PatientManagementModel.*;
import Users.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjbrewer
 */
public class Controller 
{
    private User currentlyLogedInOnPC;
    private LoginRegister loginPanel = new LoginRegister(this);
    private PatientForm patientPanel;
    private DoctorForm doctorPanel;
    private SecretaryForm secretaryPanel;
    private AdminForm adminPanel = new AdminForm(this);
    private AccountManagement accountManager;
    private MedacineManager medacineManager;

    public Controller(AccountManagement accountManager, MedacineManager medacineManager) 
    {
        this.accountManager = accountManager;
        this.medacineManager = medacineManager;
        loginPanel.setVisible(true);
    }
    
    public User populateWelcomePage()
    {
        return currentlyLogedInOnPC;
    }
 
    public void LoginBtnPressed(String ID, String Password)
    {
        Boolean loginSuccess = false;
        User user = null;
        
        user = accountManager.findByID(ID);
        
        if(user != null)
        {
            if(user.getPassword().equals(Password))
            {
                loginSuccess = true;
            }
            
            
            if(loginSuccess)
            {
                currentlyLogedInOnPC = user;
                switch (accountManager.findIDType(user))
                {
                    case 'P':
                        loginPanel.setVisible(false);
                        patientPanel.setVisible(true);
                        patientPanel.setWelcomePage();
                        break;
                    case 'D':
                        loginPanel.setVisible(false);
                        doctorPanel.setVisible(true);
                        break;
                    case 'S':
                        loginPanel.setVisible(false);
                        secretaryPanel.setVisible(true);
                        break;
                    case 'A':
                        loginPanel.setVisible(false);
                        adminPanel.setVisible(true);
                        adminPanel.setWelcomePage();
                        break;
                }
            }
            else
            {
                loginPanel.MessagePopUp("Incorrect password");
            }
        }
        else
        {
            loginPanel.MessagePopUp("Account does not yet exist");            
        }
    }
    
    public void logOut()
    {
        switch (accountManager.findIDType(currentlyLogedInOnPC))
        {
            case 'P':
                loginPanel.setVisible(true);
                patientPanel.setVisible(false);
                break;
            case 'D':
                loginPanel.setVisible(true);
                doctorPanel.setVisible(false);
                break;
            case 'S':
                loginPanel.setVisible(true);
                secretaryPanel.setVisible(false);
                break;
            case 'A':
                loginPanel.setVisible(true);
                adminPanel.setVisible(false);
                break;
        }
        
    }
    
    public void registerBtnPressed(String name, String surname, int age, String address, String gender, String password)
    {
        Patient newPatient = new Patient(password, name, surname, address, age, gender, accountManager);
        accountManager.requestAccount(newPatient);
        loginPanel.showGeneratedIDUser(newPatient.getUniqueID());
    }
    
    public void registerAdminBtnPressed(String name, String surname, String address, String password, String adminPass)
    {
        if(adminPass.equals(accountManager.getAdminPass()))
        {
            Admin newAdmin = new Admin(accountManager, medacineManager, password, name, surname, address);
            accountManager.createAdmin(newAdmin);
            loginPanel.showGeneratedIDAdmin(newAdmin.getUniqueID());
        }
        else
        {
            loginPanel.MessagePopUp("Invalid admin pass");
        }
    }
    
    public List<User> getDoctors()
    {
        List<User> doctors = new ArrayList<User>();
        if(accountManager != null)
        {
            doctors = accountManager.getDoctors(); 
        }
        return doctors;
   }
    
    public List<User> getSecretaries()
    {
        List<User> secreteries = new ArrayList<User>();
        if(accountManager != null)
        {
            secreteries = accountManager.getSecretaries();
        }
        return secreteries;
    }
    
    public List<Patient> getRequestingAccount()
    {
        List<Patient> awaitingApproval = new ArrayList<Patient>();
        if(accountManager != null)
        {
            awaitingApproval = accountManager.getRequestedAccountCreation();
        }
        return awaitingApproval;
    }
    
    public void approvePatient(String ID)
    {
        Patient patient = accountManager.findPatientByID(ID);
        accountManager.approveAccout(patient);
    }
    
    public List<Appointment> getRequestedAppointments()
    {
        return accountManager.getRequestedAppointments();
    }
    
    public void CreateAppointment(String DoctorID, String PatientID, String date)
    {
        Doctor attendingDoctor = accountManager.findDoctorByID(DoctorID);
        Patient attendingPatient = accountManager.findPatientByID(PatientID);
        Appointment appointment = accountManager.createAppointment(attendingDoctor, attendingPatient, date);
        accountManager.addAppointment(attendingDoctor, attendingPatient, appointment);
    }
    
    public void removeUserByID(String ID)
    {
       User user = accountManager.findByID(ID);
       accountManager.removeAccount(user);
    }
    
    public User getUserByID(String ID)
    {
       User user = accountManager.findByID(ID);
       return user;
    }
    
    public Doctor getDoctorByID(String ID)
    {
       Doctor doctor = accountManager.findDoctorByID(ID);
       return doctor;
    }
    
    public List<String> getDoctorRatings(Doctor doctor)
    {
        return doctor.getRatings();
    }
    
    public void CreateDoctor(String name, String surname, String address, String password)
    {
        Doctor doctor = new Doctor(accountManager, medacineManager ,name, surname, address, password);
        accountManager.createDoctor(doctor);
        adminPanel.showGeneratedDoctorID(doctor.getUniqueID());
    }
    
    public void CreateSecretary(String name, String surname, String address, String password)
    {
        Secretary secretary = new Secretary(accountManager, medacineManager ,name, surname, address, password);
        accountManager.createSecretary(secretary);
        adminPanel.showGeneratedSecretaryID(secretary.getUniqueID());
    }
    
    public void submitFeedback(String feedback, Doctor doctor)
    {
        doctor.addFeedback(feedback);
    }
    
    public void giveMedacine(String medacineName, int quantity)
    {
        Medacine medacine = medacineManager.findMedacine(medacineName);
        if(medacine != null)
        {
            if(medacine.getStock() > quantity)
            {
                medacineManager.givePatientMedacine(medacine, quantity);
            }
            else
            {
                secretaryPanel.MessagePopUp("Not enough medacine in stock");
            }
        }
        else
        {
            secretaryPanel.MessagePopUp("No medacine with that name exists");
        }
    }
    
    public void orderMedacine(String medacineName, int quantity)
    {
        Medacine medacine = medacineManager.findMedacine(medacineName);
        if(medacine != null)
        {
            medacineManager.orderMedacine(medacine, quantity);
        }
        else
        {
            secretaryPanel.MessagePopUp("No medacine with that name exists");
        }
    }
}
