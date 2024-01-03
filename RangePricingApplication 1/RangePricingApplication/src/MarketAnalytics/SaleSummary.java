/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarketAnalytics;

import TheBusiness.Business.Business;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import java.util.ArrayList;

/**
 *
 * @author JANFAN
 */
public class SaleSummary {
    
    Business business;
    public SaleSummary(Business business){
        this.business=business;
    }
    public void calSale(){
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        ArrayList<SalesPersonProfile> salespersonlist=salespersondirectory.getSalespersonlist();
        
        salespersonlist.sort((i2,i1)->Integer.compare(i1.getTotal(),i2.getTotal()));
        
        System.out.println("\ntop 3 best sale person");
        
        try{
        for (int i=0; i<3;i++){
            System.out.println(salespersonlist.get(i).getPerson().toString()+ " revenue:"+salespersonlist.get(i).getTotal());
        }
        }catch(Exception e){
            System.out.println("solution not enough");
        }
        
    }
}
