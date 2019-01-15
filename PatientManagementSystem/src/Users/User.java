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
public abstract class User 
{
    protected AccountManagement accountManager;
    protected MedacineManager medacineManager;
    protected String uniqueID;
    protected String password;
    protected String givenName;
    protected String surname;
    protected String address;
    protected List<String> notifications = new ArrayList<String>();
        
    public void setUniqueID(String ID)
    {
        this.uniqueID = ID;
    }
    
    public String getUniqueID() 
    {
        return uniqueID;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getGivenName() 
    {
        return givenName;
    }

    public String getSurname() 
    {
        return surname;
    }

    public String getAddress() 
    {
        return address;
    }

    public List<String> getNotifications() 
    {
        return notifications;
    }
            
}
