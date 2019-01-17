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
public class AccountNotification extends Notification
{

    /**
     *
     */
    public AccountNotification()
    {
        super();
    }
    
    /**
     *
     */
    public void newPatient()
    {
        this.notificationMessage = "New Patient Request";
        notifyObservers();
    }
    
    /**
     *
     */
    public void removePatient()
    {
        this.notificationMessage = "New Patient Removal Request";
        notifyObservers();
    }
}
