/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

/**
 *
 * @author jjbrewer
 */
public class MedacineNotification extends Notification
{
    public MedacineNotification()
    {
        super();
    }
    
    public void medacineUpdate()
    {
        this.notificationMessage = "Medacine Update";
        notifyObservers();
    }
}
