/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author jjbrewer
 */
public abstract class User 
{
    private String uniqueID;
    private String password;
    private String givenName;
    private String surname;
    private String address;
    private String[] notifications;
        

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

    public String[] getNotifications() 
    {
        return notifications;
    }
            
}
