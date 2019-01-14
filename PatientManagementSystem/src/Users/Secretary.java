/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.*;
import PatientManagementModel.*;

/**
 *
 * @author jjbrewer
 */
public class Secretary extends User 
{
    
    private List<Appointment> requestedAppointments = new ArrayList<Appointment>();
    private List<User> requestedAccounts = new ArrayList<User>();
    
    public Secretary(AccountManagement accountManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        this.accountManager = accountManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
    }
    
    public void addRequest(User userRequestingAccount)
    {
        requestedAccounts.add(userRequestingAccount);
    }
    
    public void addAppointmentRequest(Appointment requestedAppointment)
    {
        requestedAppointments.add(requestedAppointment);
    }
    
    public void approveAccount(Patient patient)
    {
        accountManager.approveAccout(patient);
    }
    
    public void removePatient(Patient patient)
    {
        accountManager.removeAccount(patient);
    }
    
    public void approveTermination(Patient patient)
    {
        accountManager.approveTermination(patient);
    }
    
    public void createAppointment(Patient patient, Doctor doctor)
    {
        
    }
    
    public void giveMedacine(Patient patient)
    {
        
    }
}
