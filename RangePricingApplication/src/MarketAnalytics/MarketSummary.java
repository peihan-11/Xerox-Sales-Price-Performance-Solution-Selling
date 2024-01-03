/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarketAnalytics;

import TheBusiness.Business.Business;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.SolutionOrders.SolutionOrder;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MarketSummary {

    Business business;
    int revenue;

    public MarketSummary(Business business){
        this.business=business;       
    }
    //find marginal revenue
    //1.find market list by business;
    //2.find solution order list
    //3.search market from back to front in solution order list 
    //4.if match, print out
    
    public void calMarket(){
        MarketCatalog mc = business.getMarketCatalog();
        ArrayList<Market> markets=mc.getMarkets();
        MasterSolutionOrderList msol = business.getMasterSolutionOrderList();
        ArrayList<SolutionOrder> sol=msol.getSolutionorderlist();
        System.out.println("\nMarginal Revernue for Each Market");
        for(Market m:markets){
            for(int i=sol.size()-1;i>=0;i--){
                if(sol.get(i).getMarketChannelCombo().isMarketMatch(m)){
                    System.out.println("Market:"+m.toString()+" Marginal Revernue:"+sol.get(i).getSelectedsolutionoffer().getRevenues());
                    break;
                }
            }
        }

        
    }
    
                
    }
    
