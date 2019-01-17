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

    /**
     *
     * @param accountManager
     * @param medacineManager
     */
    public Controller(AccountManagement accountManager, MedacineManager medacineManager) 
    {
        this.accountManager = accountManager;
        this.medacineManager = medacineManager;
        loginPanel.setVisible(true);
    }
    
    /**
     *
     * @return
     */
    public User populateWelcomePage()
    {
        return currentlyLogedInOnPC;
    }
 
    /**
     *
     * @param ID
     * @param Password
     */
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
                        adminPanel.setWelcomePage();
                        break;
                    case 'S':
                        loginPanel.setVisible(false);
                        secretaryPanel.setVisible(true);
                        adminPanel.setWelcomePage();
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
    
    /**
     *
     */
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
    
    /**
     *
     * @param name
     * @param surname
     * @param age
     * @param address
     * @param gender
     * @param password
     */
    public void registerBtnPressed(String name, String surname, int age, String address, String gender, String password)
    {
        Patient newPatient = new Patient(password, name, surname, address, age, gender, accountManager);
        accountManager.requestAccount(newPatient);
        loginPanel.showGeneratedIDUser(newPatient.getUniqueID());
    }
    
    /**
     *
     * @param name
     * @param surname
     * @param address
     * @param password
     * @param adminPass
     */
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
    
    /**
     *
     * @return
     */
    public List<User> getDoctors()
    {
        List<User> doctors = new ArrayList<User>();
        if(accountManager != null)
        {
            doctors = accountManager.getDoctors(); 
        }
        return doctors;
   }
    
    /**
     *
     * @return
     */
    public List<User> getSecretaries()
    {
        List<User> secreteries = new ArrayList<User>();
        if(accountManager != null)
        {
            secreteries = accountManager.getSecretaries();
        }
        return secreteries;
    }
    
    /**
     *
     * @return
     */
    public List<Patient> getPatients()
    {
        return accountManager.getPatients();
    }
    
    /**
     *
     * @return
     */
    public List<Patient> getRequestingAccount()
    {
        List<Patient> awaitingApproval = new ArrayList<Patient>();
        if(accountManager != null)
        {
            awaitingApproval = accountManager.getRequestedAccountCreation();
        }
        return awaitingApproval;
    }
    
    /**
     *
     * @return
     */
    public List<Patient> getRequestingTermination()
    {
        List<Patient> requestedAccountTermination = new ArrayList<Patient>();
        if(accountManager != null)
        {
            requestedAccountTermination = accountManager.getRequestedAccountTermination();
        }
        return requestedAccountTermination;
    }
    
    /**
     *
     * @param ID
     */
    public void approvePatient(String ID)
    {
        Patient patient = accountManager.findPatientByID(ID);
        accountManager.approveAccout(patient);
    }
    
    /**
     *
     * @return
     */
    public List<Appointment> getRequestedAppointments()
    {
        return accountManager.getRequestedAppointments();
    }
    
    /**
     *
     * @param DoctorID
     * @param PatientID
     * @param date
     */
    public void CreateAppointment(String DoctorID, String PatientID, String date)
    {
        Doctor attendingDoctor = accountManager.findDoctorByID(DoctorID);
        Patient attendingPatient = accountManager.findPatientByID(PatientID);
        Appointment appointment = accountManager.createAppointment(attendingDoctor, attendingPatient, date);
        accountManager.addAppointment(attendingDoctor, attendingPatient, appointment);
    }
    
    /**
     *
     * @param ID
     */
    public void removeUserByID(String ID)
    {
       User user = accountManager.findByID(ID);
       accountManager.removeAccount(user);
    }
    
    /**
     *
     * @param ID
     */
    public void terminateUserByID(String ID)
    {
        Patient patient = accountManager.findPatientByID(ID);
        accountManager.approveTermination(patient);
    }
    
    /**
     *
     * @param ID
     * @return
     */
    public User getUserByID(String ID)
    {
       User user = accountManager.findByID(ID);
       return user;
    }
    
    /**
     *
     * @param ID
     * @return
     */
    public Patient getPatientByID(String ID)
    {
       Patient patient = accountManager.findPatientByID(ID);
       return patient;
    }
    
    /**
     *
     * @param ID
     * @return
     */
    public Doctor getDoctorByID(String ID)
    {
       Doctor doctor = accountManager.findDoctorByID(ID);
       return doctor;
    }
    
    /**
     *
     * @param doctor
     * @return
     */
    public List<String> getDoctorRatings(Doctor doctor)
    {
        return doctor.getRatings();
    }
    
    /**
     *
     * @param name
     * @param surname
     * @param address
     * @param password
     */
    public void CreateDoctor(String name, String surname, String address, String password)
    {
        Doctor doctor = new Doctor(accountManager, medacineManager ,name, surname, address, password);
        accountManager.createDoctor(doctor);
        adminPanel.showGeneratedDoctorID(doctor.getUniqueID());
    }
    
    /**
     *
     * @param name
     * @param surname
     * @param address
     * @param password
     */
    public void CreateSecretary(String name, String surname, String address, String password)
    {
        Secretary secretary = new Secretary(accountManager, medacineManager ,name, surname, address, password);
        accountManager.createSecretary(secretary);
        adminPanel.showGeneratedSecretaryID(secretary.getUniqueID());
    }
    
    /**
     *
     * @param feedback
     * @param doctor
     */
    public void submitFeedback(String feedback, Doctor doctor)
    {
        doctor.addFeedback(feedback);
    }
    
    /**
     *
     * @param medacineName
     * @param quantity
     */
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
    
    /**
     *
     * @param medacineName
     * @param quantity
     */
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
    
    /**
     *
     * @return
     */
    public List<Medacine> getMedacineToRestockList()
    {
        return medacineManager.getMedacineToRestock();
    }
    
    /**
     *
     * @param user
     * @param DoctorID
     * @param PatientID
     * @param date
     */
    public void proposeAppointment(User user, String DoctorID, String PatientID, String date)
    {
        Doctor attendingDoctor = accountManager.findDoctorByID(DoctorID);
        Patient attendingPatient = accountManager.findPatientByID(PatientID);
        Appointment appointment = new Appointment(user, attendingDoctor, attendingPatient, date);
        accountManager.requestAppointment(appointment);
    }
    
    /**
     *
     * @param name
     */
    public void createMedacine(String name)
    {
        Medacine newMedacine = new Medacine(name);
        medacineManager.addMedacine(newMedacine);
        medacineManager.addMedacineToRestock(newMedacine);
    }
}
