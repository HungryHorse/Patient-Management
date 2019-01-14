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
    private Doctor doctor;
    private Patient patient;
    private String notes;
    private String date;
    
    
    public Appointment(Doctor attendingDoctor, Patient patient, String date)
    {
        this.doctor = attendingDoctor;
        this.patient = patient;
        this.date = date;
    }
    
    public void makeNote(String notes)
    {
        this.notes += notes + "\n";
    }
}
