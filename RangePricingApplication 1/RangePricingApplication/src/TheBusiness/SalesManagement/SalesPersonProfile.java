/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SalesManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;

/**
 *
 * @author kal bugrara
 */
public class SalesPersonProfile extends Profile {
    ArrayList<Order> salesorders;


    public SalesPersonProfile(Person p) {

        super(p); 
        salesorders = new ArrayList();

    }
    public void addSalesOrder(Order o){
        salesorders.add(o);
    }
    public int getTotal(){
        int sum=0;
        for(Order o:salesorders){
            sum+=o.getOrderPricePerformance();
        }
        return sum;
    }
    @Override
    public String getRole(){
        return  "Sales";
    }

}
