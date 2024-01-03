/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;

import MarketAnalytics.CustomerSummary;
import MarketAnalytics.MarketSummary;
import MarketAnalytics.SaleSummary;
import MarketAnalytics.SolutionSummary;
import TheBusiness.Business.Business;

import TheBusiness.MarketModel.Market;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Business business = ConfigureABusiness.initializeMarkets();
       SolutionSummary ss;
       
       
       for(Market m :business.getMarketCatalog().getMarkets()){
           ss=new SolutionSummary(m,business);
           ss.calSolutions();

       }
       
       Business business2=ConfigureABusiness.initialize();
       CustomerSummary cs=new CustomerSummary(business2);
       cs.calCustomer();
       
       SaleSummary sales=new SaleSummary(business2);
       
       sales.calSale();
       
       MarketSummary ms=new MarketSummary(business);
       
       ms.calMarket();
       System.out.println("\n");
       for(Market m :business.getMarketCatalog().getMarkets()){
           ss=new SolutionSummary(m,business);
           ss.solutionsAdjust();
       }
       
    }

}

