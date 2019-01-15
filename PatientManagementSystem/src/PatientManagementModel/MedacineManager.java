/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;
import java.util.*;
/**
 *
 * @author jjbrewer
 */
public class MedacineManager 
{
    private List<Medacine> medacineList = new ArrayList<Medacine>();
    private List<Medacine> medacineToRestock = new ArrayList<Medacine>();

    public List<Medacine> getMedacineList() {
        return medacineList;
    }
    
    public void addMedacine(Medacine medacine)
    {
        medacineList.add(medacine);
    }
    
    public void addMedacineToRestock(Medacine medacine)
    {
        medacineToRestock.add(medacine);
    }
    
    public Medacine findMedacine(String name)
    {
        for(int i = 0; i < medacineList.size(); i++)
        {
            if(name.equals(medacineList.get(i).getName()))
            {
                return medacineList.get(i);
            }
        }
        return null;
    }
}
