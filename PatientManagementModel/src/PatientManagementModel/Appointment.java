/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;
import Users.*;
/**
 *
 * @author jjbrewer
 */
public class Appointment 
{
    private User proposedBy;
    private Doctor doctor;
    private Patient patient;
    private String notes;
    private String date;
    private Perscription perscription;

    
    /**
     *
     * @param attendingDoctor
     * @param patient
     * @param date
     */
    public Appointment(Doctor attendingDoctor, Patient patient, String date)
    {
        this.doctor = attendingDoctor;
        this.patient = patient;
        this.date = date;
    }
    
    /**
     *
     * @param proposedBy
     * @param attendingDoctor
     * @param patient
     * @param date
     */
    public Appointment(User proposedBy, Doctor attendingDoctor, Patient patient, String date)
    {
        this.doctor = attendingDoctor;
        this.patient = patient;
        this.date = date;
        this.proposedBy = proposedBy;
    }

    /**
     *
     * @return
     */
    public String getNotes() {
        return notes;
    }    
    
    /**
     *
     * @return
     */
    public User getProposedBy() {
        return proposedBy;
    }

    /**
     *
     * @return
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     *
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     *
     * @return
     */
    public String getDate() {
        return date;
    }
    
    /**
     *
     * @param perscription
     */
    public void addPerscription(Perscription perscription)
    {
        this.perscription = perscription;
    }
    
    /**
     *
     * @param notes
     */
    public void makeNote(String notes)
    {
        this.notes += notes + "\n";
    }

    /**
     *
     * @return
     */
    public Perscription getPerscription() 
    {
        return perscription;
    }
    
    
}
