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
    
    /**
     *
     * @param AccountManager
     */
    
    /**
     *
     * @param password
     * @param givenName
     * @param surname
     * @param address
     * @param age
     * @param gender
     * @param accountManager
     */
    public  Patient(String password, String givenName, String surname, String address, int age, String gender, AccountManagement accountManager)
    {
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.accountManager = accountManager;
        RequestAccount();
    }
    
    /**
     *
     */
    public void RequestAccount()
    {
        accountManager.requestAccount(this); 
    }
    /**
     *
     * @param doctor
     * @param rating
     */
    public void RateDoctor(Doctor doctor, String rating)
    {
        doctor.setRating(rating);
    }
    
    /**
     *
     * @param doctor
     * @return
     */
    public List<String> SeeDoctorRatings(Doctor doctor)
    {
        return doctor.getRatings();
    }
    
    /**
     *
     * @param preferedDoctor
     * @param date
     */
    public void RequestAppointment(Doctor preferedDoctor, String date)
    {
        Appointment newAppointment = new Appointment(this, preferedDoctor, this, date);
        accountManager.requestAppointment(newAppointment);
    }
    
    /**
     *
     * @param appointment
     */
    public void setUpComingAppointment(Appointment appointment)
    {
        upComingAppointment = appointment;
    }
    
    /**
     *
     * @return
     */
    public Perscription GetPerscription()
    {
        return currentPerscription;
    }
    
    /**
     *
     * @return
     */
    public Appointment GetAppointment()
    {
        return upComingAppointment;
    }
    
    /**
     *
     * @return
     */
    public int GetDOB()
    {
        return age;
    }
    
    /**
     *
     * @return
     */
    public String GetGender()
    {
        return gender;
    }
    
    /**
     *
     * @return
     */
    public List<Appointment> getHistory()
    {
        return history;
    }
    
    /**
     *
     */
    public void RequestTermination()
    {
        accountManager.requestAccountTermination(this);
    }
    
    /**
     *
     * @param perscription
     */
    public void setPerscription(Perscription perscription)
    {
        this.currentPerscription = perscription;
    }
    
    /**
     *
     * @param appointment
     */
    public void addAppointmentToHistory(Appointment appointment)
    {
        history.add(appointment);
    }
    
    /**
     *
     * @param notificationMessage
     */
    @Override
    public void update(String notificationMessage)
    {
        this.notifications.add(notificationMessage);
    }
}
