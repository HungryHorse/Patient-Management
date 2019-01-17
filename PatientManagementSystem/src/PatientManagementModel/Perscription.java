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
public class Perscription 
{
    private Medacine medacinePrescribed;
    private Doctor doctor;
    private Patient patient;
    private int quantity;
    private String dosage;

    /**
     *
     * @param medacinePrescribed
     * @param doctor
     * @param patient
     * @param quantity
     * @param dosage
     */
    public Perscription(Medacine medacinePrescribed, Doctor doctor, Patient patient, int quantity, String dosage) 
    {
        this.medacinePrescribed = medacinePrescribed;
        this.doctor = doctor;
        this.patient = patient;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    public Medacine getMedacinePrescribed() {
        return medacinePrescribed;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDosage() {
        return dosage;
    }
    
    
}
