/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjbrewer
 */
public class AppointmentNotification extends Notification
{
    
    /**
     *
     */
    public AppointmentNotification()
    {
        super();
    }
    
    /**
     *
     */
    public void requestedAppointment()
    {
        this.notificationMessage = "New Appointment Requested";
        notifyObservers();
    }
    
    
    /**
     *
     * @param patient
     * @param doctor
     */
    public void addAppointment(Patient patient, Doctor doctor)
    {
        this.notificationMessage = "New Appointment";
        patient.update(this.notificationMessage);
        doctor.update(this.notificationMessage);
    }
}
