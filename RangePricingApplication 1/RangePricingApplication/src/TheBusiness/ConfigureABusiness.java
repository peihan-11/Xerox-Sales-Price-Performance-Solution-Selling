/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;

import MarketAnalytics.ChannelSummary;
import MarketingManagement.MarketingPersonDirectory;
import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.MarketModel.ChannelCatalog;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.MarketModel.SolutionOfferCatalog;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.SolutionOrders.SolutionOrder;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Xerox");

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales1");
        Person xeroxsalesperson002 = persondirectory.newPerson("Xerox sales2");
        Person xeroxsalesperson003 = persondirectory.newPerson("Xerox sales3");
        Person xeroxsalesperson004 = persondirectory.newPerson("Xerox sales4 ");
        Person xeroxsalesperson005 = persondirectory.newPerson("Xerox sale5");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");

// Create person objects to represent customer organizations. 
        Person person005 = persondirectory.newPerson("Dell");
        Person person006 = persondirectory.newPerson("Microsoft");
        Person person007 = persondirectory.newPerson("Google");
        Person person008 = persondirectory.newPerson("JP Morgan");
        Person person009 = persondirectory.newPerson("State street"); //we use this as customer
        Person person010 = persondirectory.newPerson("Walmart"); 
        Person person011 = persondirectory.newPerson("Unitedhealth Group"); 
        Person person012 = persondirectory.newPerson("Exxon Mobil"); 
        Person person013 = persondirectory.newPerson("Toyota Motor"); 
        Person person014 = persondirectory.newPerson("Berkshire Hathaway"); 

// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005);
        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006);
        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007);
        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008);
        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009);
        CustomerProfile customerprofile6 = customedirectory.newCustomerProfile(person010);
        CustomerProfile customerprofile7 = customedirectory.newCustomerProfile(person011);
        CustomerProfile customerprofile8 = customedirectory.newCustomerProfile(person012);
        CustomerProfile customerprofile9 = customedirectory.newCustomerProfile(person013);
        CustomerProfile customerprofile10 = customedirectory.newCustomerProfile(person014);
        
// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);
        SalesPersonProfile salespersonprofile2 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson002);
        SalesPersonProfile salespersonprofile3 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson003);
        SalesPersonProfile salespersonprofile4 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson004);   
        SalesPersonProfile salespersonprofile5 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson005);
        
// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

// Create Admins to manage the business
//        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
//        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000);
        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);
        Product products1p9 = productcatalog.newProduct("Color Printer 246", 10080, 23400, 23350);
        Product products1p10 = productcatalog.newProduct("Toner Scanner  525", 7680, 10550, 9300);
        
        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        Supplier supplier2 = suplierdirectory.newSupplier("Epson");
        productcatalog = supplier2.getProductCatalog();
        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 1200, 2600, 1850);
        Product products2p2 = productcatalog.newProduct("Scanner 14", 9000, 16500, 12500);
        Product products2p3 = productcatalog.newProduct("Color Printer 112", 42200, 54000, 49500);
        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 43000, 89000, 55000);
        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 19500, 50010, 365102);
        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 9000, 1250, 16500);
        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 32200, 47000, 73650);
        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 35000, 58000, 78000);
        Product products2p9 = productcatalog.newProduct("High Laser 999", 3090, 4260, 7350);
        Product products2p10 = productcatalog.newProduct("Black and White Printer  100", 7500, 8900, 8000);
        
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales1", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX"); /// order products for one of the customers and performed by a sales person
//        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

// Process Orders on behalf of sales person and customer
        MasterOrderList masterorderlist = business.getMasterOrderList();
    // customerprofile4
        Order order1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi11_1 = order1.newOrderItem(products1p1, 18000, 1);
        OrderItem oi11_2 = order1.newOrderItem(products1p2, 19500, 4);
        OrderItem oi11_3 = order1.newOrderItem(products1p3, 36500, 10);
        OrderItem oi11_4 = order1.newOrderItem(products1p4, 50000, 1);
        OrderItem oi11_5 = order1.newOrderItem(products1p5, 25000, 3);
        OrderItem oi11_6 = order1.newOrderItem(products1p6, 105000, 2);
        OrderItem oi11_7 = order1.newOrderItem(products1p7, 36500, 3);
        OrderItem oi11_8 = order1.newOrderItem(products1p8, 50000, 2);
        OrderItem oi11_9 = order1.newOrderItem(products1p9, 23550, 12);
        OrderItem oi11_10 = order1.newOrderItem(products1p10, 9980, 4);
        OrderItem oi12_1 = order1.newOrderItem(products2p1, 27000, 2);
        OrderItem oi12_2 = order1.newOrderItem(products2p2, 1688700, 2);
        OrderItem oi12_3 = order1.newOrderItem(products2p3, 420000, 9);
        OrderItem oi12_4 = order1.newOrderItem(products2p4, 800000, 3);
        OrderItem oi12_5 = order1.newOrderItem(products2p5, 500000, 7);
        OrderItem oi12_6 = order1.newOrderItem(products2p6, 129000, 4);
        OrderItem oi12_7 = order1.newOrderItem(products2p7, 480000, 5);
        OrderItem oi12_8 = order1.newOrderItem(products2p8, 578000, 12);
        OrderItem oi12_9 = order1.newOrderItem(products2p9, 5000, 2);
        OrderItem oi12_10 = order1.newOrderItem(products2p10, 8500, 3);
        
           // customerprofile5  
        Order order2 = masterorderlist.newOrder(customerprofile5, salespersonprofile2);
        OrderItem oi21_1 = order2.newOrderItem(products1p1, 19000, 5);
        OrderItem oi21_2 = order2.newOrderItem(products1p2, 20000, 2);
        OrderItem oi21_3 = order2.newOrderItem(products1p3, 34500, 6);
        OrderItem oi21_4 = order2.newOrderItem(products1p4, 52000, 1);
        OrderItem oi21_5 = order2.newOrderItem(products1p5, 27500, 9);
        OrderItem oi21_6 = order2.newOrderItem(products1p6, 185000, 10);
        OrderItem oi21_7 = order2.newOrderItem(products1p7, 34500, 2);
        OrderItem oi21_8 = order2.newOrderItem(products1p8, 87000, 7);
        OrderItem oi21_9 = order2.newOrderItem(products1p9, 21500, 1);
        OrderItem oi21_10 = order2.newOrderItem(products1p10, 12000, 2); 
        OrderItem oi22_1 = order2.newOrderItem(products2p1, 29000, 2);
        OrderItem oi22_2 = order2.newOrderItem(products2p2, 156000, 1);
        OrderItem oi22_3 = order2.newOrderItem(products2p3, 405000, 3);
        OrderItem oi22_4 = order2.newOrderItem(products2p4, 750000, 3);
        OrderItem oi22_5 = order2.newOrderItem(products2p5, 530000, 6);
        OrderItem oi22_6 = order2.newOrderItem(products2p6, 145000, 3);
        OrderItem oi22_7 = order2.newOrderItem(products2p7, 495000, 10);
        OrderItem oi22_8 = order2.newOrderItem(products2p8, 556000, 7);
        OrderItem oi22_9 = order2.newOrderItem(products2p9, 4600, 7);
        OrderItem oi22_10 = order2.newOrderItem(products2p10, 9200, 4);
        
        // customerprofile6
        Order order3 = masterorderlist.newOrder(customerprofile6, salespersonprofile3);
        OrderItem oi31_1 = order3.newOrderItem(products1p1, 25600, 1);
        OrderItem oi31_2 = order3.newOrderItem(products1p2, 33000, 2);
        OrderItem oi31_3 = order3.newOrderItem(products1p3, 24300, 5);
        OrderItem oi31_4 = order3.newOrderItem(products1p4, 50000, 2);
        OrderItem oi31_5 = order3.newOrderItem(products1p5, 42000, 3);
        OrderItem oi31_6 = order3.newOrderItem(products1p6, 166900, 10);
        OrderItem oi31_7 = order3.newOrderItem(products1p7, 35000, 3);
        OrderItem oi31_8 = order3.newOrderItem(products1p8, 79500, 3);
        OrderItem oi31_9 = order3.newOrderItem(products1p9, 24000, 8);
        OrderItem oi31_10 = order3.newOrderItem(products1p10, 14000, 5);  
        OrderItem oi32_1 = order3.newOrderItem(products2p1, 29000, 3);
        OrderItem oi32_2 = order3.newOrderItem(products2p2, 124000, 12);
        OrderItem oi32_3 = order3.newOrderItem(products2p3, 378000, 1);
        OrderItem oi32_4 = order3.newOrderItem(products2p4, 890000, 2);
        OrderItem oi32_5 = order3.newOrderItem(products2p5, 470000, 6);
        OrderItem oi32_6 = order3.newOrderItem(products2p6, 146000, 3);
        OrderItem oi32_7 = order3.newOrderItem(products2p7, 478000, 2);
        OrderItem oi32_8 = order3.newOrderItem(products2p8, 608000, 9);
        OrderItem oi32_9 = order3.newOrderItem(products2p9, 5900, 3);
        OrderItem oi32_10 = order3.newOrderItem(products2p10, 9340, 10);

        //customerprofile7
        Order order4 = masterorderlist.newOrder(customerprofile7, salespersonprofile4);
        OrderItem oi41_1 = order4.newOrderItem(products1p1, 20000, 3);
        OrderItem oi41_2 = order4.newOrderItem(products1p2, 26000, 12);
        OrderItem oi41_3 = order4.newOrderItem(products1p3, 43500, 3);
        OrderItem oi41_4 = order4.newOrderItem(products1p4, 50000, 6);
        OrderItem oi41_5 = order4.newOrderItem(products1p5, 25200, 2);
        OrderItem oi41_6 = order4.newOrderItem(products1p6, 192000, 13);
        OrderItem oi41_7 = order4.newOrderItem(products1p7, 32300, 9);
        OrderItem oi41_8 = order4.newOrderItem(products1p8, 67000, 3);
        OrderItem oi41_9 = order4.newOrderItem(products1p9, 20200, 5);
        OrderItem oi41_10 = order4.newOrderItem(products1p10, 12890, 10);       
         OrderItem oi42_1 = order4.newOrderItem(products2p1, 27000, 2);
        OrderItem oi42_2 = order4.newOrderItem(products2p2, 168000, 2);
        OrderItem oi42_3 = order4.newOrderItem(products2p3, 420000, 9);
        OrderItem oi42_4 = order4.newOrderItem(products2p4, 800000, 3);
        OrderItem oi42_5 = order4.newOrderItem(products2p5, 500000, 7);
        OrderItem oi42_6 = order4.newOrderItem(products2p6, 128000, 4);
        OrderItem oi42_7 = order4.newOrderItem(products2p7, 480000, 5);
        OrderItem oi42_8 = order4.newOrderItem(products2p8, 578000, 12);
        OrderItem oi42_9 = order4.newOrderItem(products2p9, 5000, 2);
        OrderItem oi42_10 = order4.newOrderItem(products2p10, 8500, 3);       
        
        //customerprofile8
        Order order5 = masterorderlist.newOrder(customerprofile8, salespersonprofile5);
        OrderItem oi51_1 = order5.newOrderItem(products1p1, 18500, 4);
        OrderItem oi51_2 = order5.newOrderItem(products1p2, 23200, 2);
        OrderItem oi51_3 = order5.newOrderItem(products1p3, 40100, 6);
        OrderItem oi51_4 = order5.newOrderItem(products1p4, 33500, 8);
        OrderItem oi51_5 = order5.newOrderItem(products1p5, 30500, 3);
        OrderItem oi51_6 = order5.newOrderItem(products1p6, 200000, 12);
        OrderItem oi51_7 = order5.newOrderItem(products1p7, 35000, 4);
        OrderItem oi51_8 = order5.newOrderItem(products1p8, 55000, 10);
        OrderItem oi51_9 = order5.newOrderItem(products1p9, 20780, 8);
        OrderItem oi51_10 = order5.newOrderItem(products1p10, 14900, 5);    
        OrderItem oi52_1 = order5.newOrderItem(products2p1, 30000, 4);
        OrderItem oi52_2 = order5.newOrderItem(products2p2, 169500, 6);
        OrderItem oi52_3 = order5.newOrderItem(products2p3, 404000, 10);
        OrderItem oi52_4 = order5.newOrderItem(products2p4, 790000, 2);
        OrderItem oi52_5 = order5.newOrderItem(products2p5, 409000, 3);
        OrderItem oi52_6 = order5.newOrderItem(products2p6, 140000, 4);
        OrderItem oi52_7 = order5.newOrderItem(products2p7, 456000, 4);
        OrderItem oi52_8 = order5.newOrderItem(products2p8, 605000, 22);
        OrderItem oi52_9 = order5.newOrderItem(products2p9, 5200, 1);
        OrderItem oi52_10 = order5.newOrderItem(products2p10, 9000, 10);       
        
        //customerprofile9
        Order order6 = masterorderlist.newOrder(customerprofile9, salespersonprofile2);
        OrderItem oi61_1 = order6.newOrderItem(products1p1, 20000, 10);
        OrderItem oi61_2 = order6.newOrderItem(products1p2, 26500, 3);
        OrderItem oi61_3 = order6.newOrderItem(products1p3, 43000, 6);
        OrderItem oi61_4 = order6.newOrderItem(products1p4, 28000, 4);
        OrderItem oi61_5 = order6.newOrderItem(products1p5, 32400, 3);
        OrderItem oi61_6 = order6.newOrderItem(products1p6, 135000, 7);
        OrderItem oi61_7 = order6.newOrderItem(products1p7, 58000, 2);
        OrderItem oi61_8 = order6.newOrderItem(products1p8, 72000, 3);
        OrderItem oi61_9 = order6.newOrderItem(products1p7, 32400, 10);
        OrderItem oi61_10 = order6.newOrderItem(products1p8, 10350, 4);
        //customerprofile10
        Order order7 = masterorderlist.newOrder(customerprofile10, salespersonprofile3);
        OrderItem oi62_1 = order6.newOrderItem(products2p1, 28000, 5);
        OrderItem oi62_2 = order6.newOrderItem(products2p2, 200500, 2);
        OrderItem oi62_3 = order6.newOrderItem(products2p3, 354000, 4);
        OrderItem oi62_4 = order6.newOrderItem(products2p4, 890000, 8);
        OrderItem oi62_5 = order6.newOrderItem(products2p5, 369000, 2);
        OrderItem oi62_6 = order6.newOrderItem(products2p6, 165000, 13);
        OrderItem oi62_7 = order6.newOrderItem(products2p7, 428000, 5);
        OrderItem oi62_8 = order6.newOrderItem(products2p8, 509000, 3);
        OrderItem oi62_9 = order6.newOrderItem(products2p9, 4070, 7);
        OrderItem oi62_10 = order6.newOrderItem(products2p10, 8900, 5);       


        ProductSummary ps = new ProductSummary(products1p8);

        System.out.println("Stats==========================");
        System.out.println("Sales Volume:  " + ps.getSalesRevenues());
        System.out.println("Profit Margin:  " + ps.getProductPricePerformance());
        System.out.println("Frequency above target:  " + ps.getNumberAboveTarget());
        System.out.println("Frequency Below:  " + ps.getNumberBelowTarget());
//===============================

        MarketCatalog mc = business.getMarketCatalog();
        ChannelCatalog cc = business.getChannelCatalog();
        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();

        return business;

    }

    static Business initializeMarkets() {
        Business business = new Business("Xerox");

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");

// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1
                = customedirectory.newCustomerProfile(xeroxsalesperson001);

// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);

        // Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000);
        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);
        Product products1p9 = productcatalog.newProduct("Printer Super 3", 22000, 60000, 36500);
        Product products1p10 = productcatalog.newProduct("Printer 1", 23000, 70400, 53000);

        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        Supplier supplier2 = suplierdirectory.newSupplier("Epson");
        productcatalog = supplier2.getProductCatalog();
        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 10000, 32000, 18500);
        Product products2p2 = productcatalog.newProduct("Scanner 14", 90000, 168000, 125000);
        Product products2p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);
        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);
        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);
        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);
        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);
        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);
         Product products2p9 = productcatalog.newProduct("Black Printer 200", 312000, 420000, 436500);
        Product products2p10 = productcatalog.newProduct("Color Photocopier 500", 340000, 595000, 796000);
        
//=============== Define markets and channels...

        MarketCatalog mc = business.getMarketCatalog();
        Market teenmarket = mc.newMarket("Teenagers");
        Market teenmarket2 = mc.newMarket("College Grads");
        Market middleAgemarket= mc.newMarket("Middle-aged");

        ChannelCatalog channelCatalog = business.getChannelCatalog();

        Channel tvchannel = channelCatalog.newChannel("tv");
        Channel webchannel = channelCatalog.newChannel("web");
        Channel radiochannel= channelCatalog.newChannel("radio");
        
        ChannelSummary cs = new ChannelSummary(tvchannel, channelCatalog);
        System.out.println("Channel Summary==========================");
        System.out.println("Channel Type:  ");
        cs.printOutSummary();
        

        teenmarket.addValidChannel(webchannel);
        teenmarket.addValidChannel(tvchannel);
        teenmarket.addValidChannel(radiochannel);

        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();

        MarketChannelAssignment tvchannelteenmarket = mccc.newMarketChannelCombo(teenmarket, tvchannel);
        MarketChannelAssignment webchannelteenmarket = mccc.newMarketChannelCombo(teenmarket, webchannel);
        
        //zihao add marker channel
        MarketChannelAssignment tvchannelteenmarket2=mccc.newMarketChannelCombo(teenmarket2, tvchannel);
        MarketChannelAssignment webchannelteenmarket2=mccc.newMarketChannelCombo(teenmarket2, webchannel);
        MarketChannelAssignment radiochannelteenmarket=mccc.newMarketChannelCombo(teenmarket, radiochannel);
        MarketChannelAssignment radiochannelteenmarket2=mccc.newMarketChannelCombo(teenmarket2, radiochannel);
        MarketChannelAssignment tvchannelmiddleAgemarket=mccc.newMarketChannelCombo(middleAgemarket, tvchannel);
        MarketChannelAssignment radiochannelmiddleAgemarket=mccc.newMarketChannelCombo(middleAgemarket, radiochannel);


        SolutionOfferCatalog solutionoffercatalog = business.getSolutionOfferCatalog();

        SolutionOffer solutiontvteen = solutionoffercatalog.newSolutionOffer(tvchannelteenmarket);
        solutiontvteen.addProduct(products2p2);
        solutiontvteen.addProduct(products2p1);
        solutiontvteen.setTotalPrice(150000);

        SolutionOffer solutionwebteen = solutionoffercatalog.newSolutionOffer(webchannelteenmarket);
        solutionwebteen.addProduct(products2p2);
        solutionwebteen.addProduct(products2p1);
        solutionwebteen.setTotalPrice(175000);
        
        //Zihao add solutions
        SolutionOffer solutiontvteen2=solutionoffercatalog.newSolutionOffer(tvchannelteenmarket2);
        solutiontvteen2.addProduct(products1p2);
        solutiontvteen2.addProduct(products1p1);
        solutiontvteen2.setTotalPrice(155000);
        
        SolutionOffer solutionwebteen2=solutionoffercatalog.newSolutionOffer(webchannelteenmarket2);
        solutionwebteen2.addProduct(products1p2);
        solutionwebteen2.addProduct(products1p1);
        solutionwebteen2.setTotalPrice(39500);
        
        SolutionOffer solutionradioteen=solutionoffercatalog.newSolutionOffer(radiochannelteenmarket);
        solutionradioteen.addProduct(products1p2);
        solutionradioteen.addProduct(products1p1);
        solutionradioteen.setTotalPrice(40000);
        
        SolutionOffer solutionradioteen2=solutionoffercatalog.newSolutionOffer(radiochannelteenmarket2);
        solutionradioteen2.addProduct(products1p2);
        solutionradioteen2.addProduct(products1p1);
        solutionradioteen2.setTotalPrice(40250);
        
        SolutionOffer solutiontvmiddleAge=solutionoffercatalog.newSolutionOffer(tvchannelmiddleAgemarket);
        solutiontvmiddleAge.addProduct(products1p2);
        solutiontvmiddleAge.addProduct(products1p1);
        solutiontvmiddleAge.setTotalPrice(39500);
        
        SolutionOffer solutionradiomiddleAge=solutionoffercatalog.newSolutionOffer(radiochannelmiddleAgemarket);
        solutionradiomiddleAge.addProduct(products1p2);
        solutionradiomiddleAge.addProduct(products1p1);
        solutionradiomiddleAge.setTotalPrice(38700);
        

        MasterSolutionOrderList msol = business.getMasterSolutionOrderList();

        SolutionOrder so = msol.newSolutionOrder(solutiontvteen, tvchannelteenmarket);
        
        SolutionOrder so2 = msol.newSolutionOrder(solutionwebteen, webchannelteenmarket);
        
        //zihao added so
        
        SolutionOrder so3 = msol.newSolutionOrder(solutiontvteen2, tvchannelteenmarket2);
        
        SolutionOrder so4 = msol.newSolutionOrder(solutionwebteen2, webchannelteenmarket2);
        
        SolutionOrder so5 = msol.newSolutionOrder(solutionradioteen, radiochannelteenmarket);
        
        SolutionOrder so6 = msol.newSolutionOrder(solutionradioteen2, radiochannelteenmarket2);
        
        SolutionOrder so7 = msol.newSolutionOrder(solutiontvmiddleAge, tvchannelmiddleAgemarket);
        
        SolutionOrder so8 = msol.newSolutionOrder(solutionradiomiddleAge, radiochannelmiddleAgemarket);
        
        
        msol.getRevenueByMarketChannelCombo(tvchannelteenmarket);
        msol.getRevenueByChannel(tvchannel);

        
        
        return business;

    }

}
