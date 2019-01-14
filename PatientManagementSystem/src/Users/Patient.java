/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import PatientManagementModel.*;

/**
 *
 * @author jjbrewer
 */
public class Patient extends User
{
    private AccountManagement AccountManager;
    private Appointment[] history;
    private Appointment upComingAppointment;
    private Perscription currentPerscription;
    private String dateOfBirth;
    private String gender;
    private Boolean approved;
    
    public Patient(AccountManagement AccountManager)
    {
        this.AccountManager = AccountManager;
    }
    
    public void RequestAccount(String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        AccountManager.requestAccount(this); 
    }
    
    public void RateDoctor(Doctor doctor)
    {
                
    }
    
    public void SeeDoctorRatings(Doctor doctor)
    {
                
    }
    
    public void RequestAppointment(String date)
    {
        
    }
    
    public void RequestAppointment(Doctor preferedDoctor, String date)
    {
        
    }
    
    public Perscription GetPerscription()
    {
        return currentPerscription;
    }
    
    public Appointment GetAppointment()
    {
        return upComingAppointment;
    }
    
    public String GetDOB()
    {
        return dateOfBirth;
    }
    
    public String GetGender()
    {
        return gender;
    }
    
    public void RequestTermination()
    {
        AccountManager.requestAccountTermination(this);
    }
}
