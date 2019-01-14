/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.AccountManagement;

/**
 *
 * @author jjbrewer
 */
public class Secretary extends User 
{
    public Secretary(AccountManagement accountManager, String password, String givenName, String surname, String adress, String dateOfBirth, String gender)
    {
        this.accountManager = accountManager;
        this.givenName = givenName;
        this.surname = surname;
        this.password = password;
        this.address = adress;
    }
}
