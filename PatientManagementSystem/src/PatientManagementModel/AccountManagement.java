/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;
import java.util.*;
import Users.*;

/**
 *
 * @author jbrew
 */
public class AccountManagement 
{
    private List<User> requestedAccountCreation = new ArrayList<User>();
    private List<User> requestedAccountTermination = new ArrayList<User>();
    private List<User> accounts = new ArrayList<User>();
    private int noOfDoctors = 0;
    private int noOfPatients = 0;
    private int noOfSecretaries = 0;
    private int noOfAdmins = 0;
    private Boolean instantiated;

    public AccountManagement() 
    {
        instantiated = true; 
    }
    
    
    public void requestAccount(Patient newPatient)
    {
        requestedAccountCreation.add(newPatient);
    }
    
    public void approveAccout(Patient approvedPatient)
    {
        requestedAccountCreation.remove(approvedPatient);
        accounts.add(approvedPatient);
        approvedPatient.setUniqueID(createID("patient"));
    }
    
    public void createDoctor(Doctor doctor)
    {
        
    }
    
    public void createSecretary(Secretary secretary)
    {
        
    }
    
    public void requestAccountTermination(Patient patientToRemove)
    {
        requestedAccountTermination.add(patientToRemove);
    }
    
    public void removeAccount(Patient patientToRemove)
    {
        requestedAccountTermination.remove(patientToRemove);
        accounts.remove(patientToRemove);
    }
    
    public void denyAccount(Patient deniedPatient)
    {
        requestedAccountCreation.remove(deniedPatient);
    }
    
    public String createID(String type)
    {
        String ID = "";
        switch(type)
        {
            case "doctor":
                ID = "D" + noOfDoctors;
                noOfDoctors++;
                break;
            case "patient":
                ID = "P" + noOfPatients;
                noOfPatients++;
                break;
            case "secretary":
                ID = "S" + noOfSecretaries;
                noOfSecretaries++;
                break;
            case "admin":
                ID = "A" + noOfAdmins;
                noOfAdmins++;
                break;
        }
        return ID;
    }
}
