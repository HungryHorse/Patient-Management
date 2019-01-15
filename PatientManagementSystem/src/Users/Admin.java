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
    public Admin(AccountManagement accountManager,MedacineManager medacineManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        this.accountManager = accountManager;
        this.medacineManager = medacineManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
        this.accountManager.createAdmin(this);
    }
    
    public void addDoctor(AccountManagement accountManager, MedacineManager medacineManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        Doctor newDoctor = new Doctor(accountManager, medacineManager, password, givenName, surname, adress, dateOfBirth, gender);
        accountManager.createDoctor(newDoctor);
    }
    
    public void removeDoctor(Doctor doctor)
    {
        accountManager.removeDoctor(doctor);
    }
    
    public void addSecretary(AccountManagement accountManager, MedacineManager medacineManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        Secretary newSecretary = new Secretary(accountManager, medacineManager, password, givenName, surname, adress, dateOfBirth, gender);
        accountManager.createSecretary(newSecretary);
    }
    
    public void removeSecretary(Secretary secretary)
    {
        accountManager.removeSecretary(secretary);
    }
    
    public List<String> veiwDoctorRatings(Doctor doctor)
    {
        return doctor.getRatings();
    }
    
    public void giveFeedback(Doctor doctor, String feedback)
    {
        doctor.addFeedback(feedback);
    }
}
