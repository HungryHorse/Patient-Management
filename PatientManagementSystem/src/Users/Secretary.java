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
    
    /**
     *
     * @param accountManager
     * @param medacineManager
     * @param password
     * @param givenName
     * @param surname
     */
    public Secretary(AccountManagement accountManager, MedacineManager medacineManager, String password, String givenName, String surname, String address)
    {
        this.accountManager = accountManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = address;
    }
        
    /**
     *
     * @param patient
     */
    public void approveAccount(Patient patient)
    {
        accountManager.approveAccout(patient);
    }
    
    /**
     *
     * @param patient
     */
    public void removePatient(Patient patient)
    {
        accountManager.removeAccount(patient);
    }
    
    /**
     *
     * @param patient
     */
    public void approveTermination(Patient patient)
    {
        accountManager.approveTermination(patient);
    }
    
    /**
     *
     * @return
     */
    public List<User> getRequestedAccounts()
    {
        return accountManager.getRequestedAccountCreation();
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
     * @return
     */
    public List<User> getRequestedTermination()
    {
        return accountManager.getRequestedAccountTermination();
    }
    
    /**
     *
     * @param medacine
     * @param stockToBuy
     */
    public void restockMedacine(Medacine medacine, int stockToBuy)
    {
        medacine.restockMedacine(stockToBuy);
    }
    
    /**
     *
     * @param patient
     * @param doctor
     * @param date
     */
    public void createAppointment(Patient patient, Doctor doctor, String date)
    {
        Appointment newAppointment = new Appointment(doctor, patient, date);
        accountManager.addAppointment(doctor, patient, newAppointment);
    }
    
    /**
     *
     * @param patient
     * @param appointment
     */
    public void giveMedacine(Patient patient, Appointment appointment)
    {
        patient.setPerscription(appointment.getPerscription());
    }
    
    /**
     *
     */
    @Override
    public void update(String notificationMessage)
    {
        
    }
}
