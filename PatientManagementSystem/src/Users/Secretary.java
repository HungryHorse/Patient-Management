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
    
    public Secretary(AccountManagement accountManager, MedacineManager medacineManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        this.accountManager = accountManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
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
    
    public List<User> getRequestedAccounts()
    {
        return accountManager.getRequestedAccountCreation();
    }
    
    public List<Appointment> getRequestedAppointments()
    {
        return accountManager.getRequestedAppointments();
    }
    
    public List<User> getRequestedTermination()
    {
        return accountManager.getRequestedAccountTermination();
    }
    
    public void restockMedacine(Medacine medacine, int stockToBuy)
    {
        medacine.restockMedacine(stockToBuy);
    }
    
    public void createAppointment(Patient patient, Doctor doctor, String date)
    {
        Appointment newAppointment = new Appointment(doctor, patient, date);
        accountManager.addAppointment(doctor, patient, newAppointment);
    }
    
    public void giveMedacine(Patient patient, Appointment appointment)
    {
        patient.setPerscription(appointment.getPerscription());
    }
}
