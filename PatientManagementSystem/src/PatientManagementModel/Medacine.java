/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;
import Users.*;
/**
 *
 * @author jbrew
 */
public class Medacine 
{
    private int stock;
    private String name;

    /**
     *
     * @param name
     */
    public Medacine(String name)
    {
       stock = 0;
       this.name = name;
    }
    
    /**
     *
     * @return
     */
    public int getStock() 
    {
        return stock;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     *
     * @param stock
     */
    public void setStock(int stock) 
    {
        this.stock = stock;
    }  
    
    /**
     *
     * @param stockToBuy
     */
    public void restockMedacine(int stockToBuy)
    {
        stock += stockToBuy;
    }
}
