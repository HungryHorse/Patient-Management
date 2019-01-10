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
    private Appointment[] history;
    private Appointment upComingAppointment;
    private Perscription currentPerscription;
    private String dateOfBirth;
    private String gender;
    private Boolean approved;
    
    public void RequestAccount(String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
                
    }
    
    public void RateDoctor(Doctor doctor)
    {
                
    }
    
    public void SeeDoctorRatings(Doctor doctor)
    {
                
    }
}
