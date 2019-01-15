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
    
    public Doctor(AccountManagement accountManager,MedacineManager medacineManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        this.accountManager = accountManager;
        this.medacineManager = medacineManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
    }
    
    public void makeNote(Appointment appointment, String note)
    {
        appointment.makeNote(note);
    }
    
    public void addPerscription(Appointment appointment, Perscription perscription)
    {
        appointment.addPerscription(perscription);
    }
    
    public List<Appointment> veiwPatientHistory(Patient patient)
    {
        return patient.getHistory();
    }
    
    public void proposeAppointment(Patient patient, String date)
    {
        Appointment newAppointment = new Appointment(this, this, patient, date);
        accountManager.requestAppointment(newAppointment);
    }
    
    public void prescripeMedacine(Patient patient, Medacine medacine, int quantity, String dosage)
    {
        Perscription perscription = new Perscription(medacine, this, patient, quantity, dosage);
    }
    
    public void addAppointment(Appointment appointment)
    {
        appointments.add(appointment);
    }
    
    public void createNewMedacine(String name, int amountToStock)
    {
        Medacine newMedacine = new Medacine(name);
        medacineManager.addMedacine(newMedacine);
        medacineManager.addMedacineToRestock(newMedacine);
    }
    
    public void requestOrdering(String medacineName)
    {
        Medacine medacineToRestock = medacineManager.findMedacine(medacineName);
        medacineManager.addMedacineToRestock(medacineToRestock);
    }

    public List<String> getRatings()
    {
        return ratings;
    }

    public void setRating(String rating) 
    {
        ratings.add(rating);
    }

    public List<String> getFeedback() 
    {
        return feedback;
    }

    public void addFeedback(String feedback) 
    {
        this.feedback.add(feedback);
    }
    
}
