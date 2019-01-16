/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import java.util.List;
import PatientManagementModel.*;
import java.util.ArrayList;
import utilities.*;
/**
 *
 * @author jjbrewer
 */
public abstract class User implements Observer
{

    /**
     *
     */
    protected AccountManagement accountManager;

    /**
     *
     */
    protected MedacineManager medacineManager;

    /**
     *
     */
    protected String uniqueID;

    /**
     *
     */
    protected String password;

    /**
     *
     */
    protected String givenName;

    /**
     *
     */
    protected String surname;

    /**
     *
     */
    protected String address;

    /**
     *
     */
    protected List<String> notifications = new ArrayList<String>();
        
    /**
     *
     * @param ID
     */
    public void setUniqueID(String ID)
    {
        this.uniqueID = ID;
    }
    
    /**
     *
     * @return
     */
    public String getUniqueID() 
    {
        return uniqueID;
    }

    /**
     *
     * @return
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getGivenName() 
    {
        return givenName;
    }

    /**
     *
     * @return
     */
    public String getSurname() 
    {
        return surname;
    }

    /**
     *
     * @return
     */
    public String getAddress() 
    {
        return address;
    }

    /**
     *
     * @return
     */
    public List<String> getNotifications() 
    {
        return notifications;
    }
}
