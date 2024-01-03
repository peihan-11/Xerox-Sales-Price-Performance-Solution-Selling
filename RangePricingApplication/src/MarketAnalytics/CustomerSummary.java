/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarketAnalytics;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.MasterOrderReport;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderSummary;
import java.util.ArrayList;

/**
 *
 * @author JANFAN
 */
public class CustomerSummary {
    Business business;
    
    public CustomerSummary(Business business){
        this.business=business;

    }
    //print 3 best customer
    //1.get masterorderlist has all orders and a masterorderReport
    //2.get masterOrderReport and get a ordersummary list
    //3. for loop and update ordersummary by generateOrderReport()
    //4. get a list of order and get top 3 customer

    
    public void calCustomer(){
        MasterOrderList masterorderlist = business.getMasterOrderList();
        MasterOrderReport report =masterorderlist.generateMasterOrderReport();
        report.generateOrderReport(masterorderlist.getOrders());
        ArrayList<OrderSummary> ordersummarylist= report.getOrdersummarylist();
        
        ordersummarylist.sort((i2,i1)->Integer.compare(i1.getOrderProfit(),i2.getOrderProfit()));
        System.out.println("\ntop 3 best Customer in ");
        
        for(int i=0;i<3;i++){
            OrderSummary os=ordersummarylist.get(i);
            Order o=os.getSubjectOrder();
            int totalprice=o.getOrderPricePerformance();
            CustomerProfile Customer = o.getCustomer();
            
            System.out.println((i+1)+". id: "+Customer.getCustomerId()+" price:"+totalprice);
            
        }

        
    }
    
}
