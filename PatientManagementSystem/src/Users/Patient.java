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
public class Patient extends User
{
    private List<Appointment> history = new ArrayList<Appointment>();
    private Appointment upComingAppointment;
    private Perscription currentPerscription;
    private int age;
    private String gender;
    private Boolean approved;
    
    public Patient(AccountManagement AccountManager)
    {
        this.accountManager = AccountManager;
    }
    
    public void RequestAccount(String password, String givenName, String surname, String adress, int age, String gender)
    {
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
        this.gender = gender;
        this.age = age;
        accountManager.requestAccount(this); 
    }
    
    public void RateDoctor(Doctor doctor, String rating)
    {
        doctor.setRating(rating);
    }
    
    public List<String> SeeDoctorRatings(Doctor doctor)
    {
        return doctor.getRatings();
    }
    
    public void RequestAppointment(Doctor preferedDoctor, String date)
    {
        Appointment newAppointment = new Appointment(this, preferedDoctor, this, date);
        accountManager.requestAppointment(newAppointment);
    }
    
    public void setUpComingAppointment(Appointment appointment)
    {
        upComingAppointment = appointment;
    }
    
    public Perscription GetPerscription()
    {
        return currentPerscription;
    }
    
    public Appointment GetAppointment()
    {
        return upComingAppointment;
    }
    
    public int GetDOB()
    {
        return age;
    }
    
    public String GetGender()
    {
        return gender;
    }
    
    public List<Appointment> getHistory()
    {
        return history;
    }
    
    public void RequestTermination()
    {
        accountManager.requestAccountTermination(this);
    }
    
    public void setPerscription(Perscription perscription)
    {
        this.currentPerscription = perscription;
    }
}
