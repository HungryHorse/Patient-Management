/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;
import java.util.*;
import Users.*;

/**
 *
 * @author jbrew
 */
public class AccountManagement 
{
    private List<Appointment> requestedAppointments = new ArrayList<Appointment>();
    private List<User> requestedAccountCreation = new ArrayList<User>();
    private List<User> requestedAccountTermination = new ArrayList<User>();
    private List<User> accounts = new ArrayList<User>();
    private int noOfDoctors = 0;
    private int noOfPatients = 0;
    private int noOfSecretaries = 0;
    private int noOfAdmins = 0;
    private Boolean instantiated;

    public AccountManagement() 
    {
        instantiated = true; 
    }
    
    public void requestAccount(Patient newPatient)
    {
        requestedAccountCreation.add(newPatient);
        newPatient.setUniqueID(createID("patient"));
    }    
    
    public void requestAppointment(Appointment appointment)
    {
        requestedAppointments.add(appointment);
    }
    
    public void approveAccout(Patient approvedPatient)
    {
        requestedAccountCreation.remove(approvedPatient);
        accounts.add(approvedPatient);
    }
    
    public void createDoctor(Doctor doctor)
    {
        accounts.add(doctor);
    }
    
    public void removeDoctor(Doctor doctor)
    {
        accounts.remove(doctor);
    }
    
    public void createSecretary(Secretary secretary)
    {
        accounts.add(secretary);
    }
    
    public void removeSecretary(Secretary secretary)
    {
        accounts.remove(secretary);
    }
    
    public void createAdmin(Admin admin)
    {
        accounts.add(admin);
    }
    
    public void requestAccountTermination(Patient patientToRemove)
    {
        requestedAccountTermination.add(patientToRemove);
    }
    
    public void removeAccount(Patient patientToRemove)
    {
        accounts.remove(patientToRemove);
    }
    
    public void approveTermination(Patient patientToRemove)
    {
        requestedAccountTermination.remove(patientToRemove);
        accounts.remove(patientToRemove);
    }
    
    public void denyAccount(Patient deniedPatient)
    {
        requestedAccountCreation.remove(deniedPatient);
    }
    
    public String createID(String type)
    {
        String ID = "";
        switch(type)
        {
            case "doctor":
                ID = String.format("D%04d", noOfDoctors);
                noOfDoctors++;
                break;
            case "patient":
                ID = String.format("P%04d", noOfPatients);
                noOfPatients++;
                break;
            case "secretary":
                ID = String.format("S%04d", noOfSecretaries);
                noOfSecretaries++;
                break;
            case "admin":
                ID = String.format("A%04d", noOfAdmins);
                noOfAdmins++;
                break;
        }
        return ID;
    }
    
    public User findByID(String IDToFind)
    {
        User userFound = null;
        
        for(int i = 0; i < accounts.size(); i++)
        {
            if(accounts.get(i).getUniqueID().equals(IDToFind))
            {
                userFound = accounts.get(i);
            }
        }
        
        return userFound;
    }
    
    public List<Appointment> getRequestedAppointments()
    {
        return requestedAppointments;
    }

    public List<User> getRequestedAccountCreation() {
        return requestedAccountCreation;
    }

    public List<User> getRequestedAccountTermination() {
        return requestedAccountTermination;
    }
    
    public void addAppointment(Doctor attendingDoctor, Patient attendingPatient, Appointment appointment)
    {
        attendingDoctor.addAppointment(appointment);
        attendingPatient.setUpComingAppointment(appointment);
    }
}
