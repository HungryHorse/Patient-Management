/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import PatientManagementModel.*;
import java.util.*;

/**
 *
 * @author jjbrewer
 */
public class Admin extends User
{

    /**
     *
     * @param accountManager
     * @param medacineManager
     * @param password
     * @param givenName
     * @param surname
     */
    public Admin(AccountManagement accountManager,MedacineManager medacineManager, String password, String givenName, String surname, String address)
    {
        this.accountManager = accountManager;
        this.medacineManager = medacineManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = address;
    }
    
    /**
     *
     * @param accountManager
     * @param medacineManager
     * @param password
     * @param givenName
     * @param surname
     * @param adress
     * @param dateOfBirth
     * @param gender
     */
    public void addDoctor(AccountManagement accountManager, MedacineManager medacineManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        Doctor newDoctor = new Doctor(accountManager, medacineManager, password, givenName, surname, adress);
        accountManager.createDoctor(newDoctor);
    }
    
    /**
     *
     * @param doctor
     */
    public void removeDoctor(Doctor doctor)
    {
        accountManager.removeDoctor(doctor);
    }
    
    /**
     *
     * @param accountManager
     * @param medacineManager
     * @param password
     * @param givenName
     * @param surname
     * @param adress
     * @param dateOfBirth
     * @param gender
     */
    public void addSecretary(AccountManagement accountManager, MedacineManager medacineManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        Secretary newSecretary = new Secretary(accountManager, medacineManager, password, givenName, surname, adress);
        accountManager.createSecretary(newSecretary);
    }
    
    /**
     *
     * @param secretary
     */
    public void removeSecretary(Secretary secretary)
    {
        accountManager.removeSecretary(secretary);
    }
    
    /**
     *
     * @param doctor
     * @return
     */
    public List<String> veiwDoctorRatings(Doctor doctor)
    {
        return doctor.getRatings();
    }
    
    /**
     *
     * @param doctor
     * @param feedback
     */
    public void giveFeedback(Doctor doctor, String feedback)
    {
        doctor.addFeedback(feedback);
    }
    
    /**
     *
     */
    @Override
    public void update(String notificationMessage)
    {
        
    }
}
