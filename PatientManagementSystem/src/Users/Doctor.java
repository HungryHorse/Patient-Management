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
    public List<Appointment> appointments = new ArrayList<Appointment>();
    
    public Doctor(AccountManagement accountManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        this.accountManager = accountManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
    }
    
    public void makeNote(Appointment appointment, String note)
    {
        appointment.makeNote(note);
    }
    
    public List<Appointment> veiwPatientHistory(Patient patient)
    {
        return patient.getHistory();
    }
    
    public void proposeApointment()
    {
        
    }
}
