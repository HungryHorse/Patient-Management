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
    private MedacineNotification medacineNotification;
    private List<Medacine> medacineList = new ArrayList<Medacine>();
    private List<Medacine> medacineToRestock = new ArrayList<Medacine>();

    /**
     *
     * @param medacineNotification
     */
    public MedacineManager(MedacineNotification medacineNotification) {
        this.medacineNotification = medacineNotification;
    }
    /**
     *
     * @return
     */
    public List<Medacine> getMedacineList() {
        return medacineList;
    }
    
    /**
     *
     * @return
     */
    public List<Medacine> getMedacineToRestock()
    {
        return medacineToRestock;
    }
    
    /**
     *
     * @param medacine
     * @param Quantity
     */
    public void givePatientMedacine(Medacine medacine, int Quantity)
    {
        medacine.setStock(medacine.getStock() - Quantity);
    }
    
    /**
     *
     * @param medacine
     */
    public void addMedacine(Medacine medacine)
    {
        medacineList.add(medacine);
    }
    
    /**
     *
     * @param medacine
     */
    public void addMedacineToRestock(Medacine medacine)
    {
        medacineToRestock.add(medacine);
        medacineNotification.medacineUpdate();
    }
    
    /**
     *
     * @param name
     * @return
     */
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
    
    /**
     *
     * @param medacine
     * @param Quantity
     */
    public void orderMedacine(Medacine medacine, int Quantity)
    {
        medacine.setStock(medacine.getStock() + Quantity);
    }
}
