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
public class Doctor extends User
{
    private List<Appointment> appointments = new ArrayList<Appointment>();
    private List<String> ratings = new ArrayList<String>();
    private List<String> feedback = new ArrayList<String>();
    
    /**
     *
     * @param accountManager
     * @param medacineManager
     * @param password
     * @param givenName
     * @param surname
     * @param address
     */
    public Doctor(AccountManagement accountManager,MedacineManager medacineManager, String password, String givenName, String surname, String address)
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
     * @param appointment
     * @param note
     */
    public void makeNote(Appointment appointment, String note)
    {
        appointment.makeNote(note);
    }
    
    /**
     *
     * @param appointment
     */
    public void attendAppointment(Appointment appointment)
    {
        appointments.remove(appointment);
    }
    
    /**
     *
     * @param appointment
     * @param perscription
     */
    public void addPerscription(Appointment appointment, Perscription perscription)
    {
        appointment.addPerscription(perscription);
    }

    /**
     *
     * @return
     */
    public List<Appointment> getAppointments()
    {
        return appointments;
    }
    
    /**
     *
     * @param patient
     * @return
     */
    public List<Appointment> veiwPatientHistory(Patient patient)
    {
        return patient.getHistory();
    }
    
    /**
     *
     * @param patient
     * @param date
     */
    public void proposeAppointment(Patient patient, String date)
    {
        Appointment newAppointment = new Appointment(this, this, patient, date);
        accountManager.requestAppointment(newAppointment);
    }
    
    /**
     *
     * @param patient
     * @param date
     */
    public void createAppointment(Patient patient, String date)
    {
        Appointment newAppointment = new Appointment(this, this, patient, date);
        accountManager.addAppointment(this, patient, newAppointment);
    }
    
    /**
     *
     * @param patient
     * @param medacine
     * @param quantity
     * @param dosage
     */
    public void prescripeMedacine(Patient patient, Medacine medacine, int quantity, String dosage)
    {
        Perscription perscription = new Perscription(medacine, this, patient, quantity, dosage);
    }
    
    /**
     *
     * @param appointment
     */
    public void addAppointment(Appointment appointment)
    {
        appointments.add(appointment);
    }
    
    /**
     *
     * @param name
     * @param amountToStock
     */
    public void createNewMedacine(String name, int amountToStock)
    {
        Medacine newMedacine = new Medacine(name);
        medacineManager.addMedacine(newMedacine);
        medacineManager.addMedacineToRestock(newMedacine);
    }
    
    /**
     *
     * @param medacineName
     */
    public void requestOrdering(String medacineName)
    {
        Medacine medacineToRestock = medacineManager.findMedacine(medacineName);
        medacineManager.addMedacineToRestock(medacineToRestock);
    }

    /**
     *
     * @return
     */
    public List<String> getRatings()
    {
        return ratings;
    }

    /**
     *
     * @param rating
     */
    public void setRating(String rating) 
    {
        ratings.add(rating);
    }

    /**
     *
     * @return
     */
    public List<String> getFeedback() 
    {
        return feedback;
    }

    /**
     *
     * @param feedback
     */
    public void addFeedback(String feedback) 
    {
        this.feedback.add(feedback);
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
