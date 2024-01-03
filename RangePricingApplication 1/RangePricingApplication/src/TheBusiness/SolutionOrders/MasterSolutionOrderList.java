/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SolutionOrders;

import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MasterSolutionOrderList {
        ArrayList<SolutionOrder> solutionorderlist;

    public MasterSolutionOrderList() {
        solutionorderlist = new ArrayList();
    }

    public SolutionOrder newSolutionOrder(SolutionOffer soloffer,  MarketChannelAssignment mca) {

        SolutionOrder so = new SolutionOrder(soloffer,   mca);
        solutionorderlist.add(so);
        soloffer.addSolutionOrder(so);
        return so;

    }

    public int getRevenueByMarket(Market m) {
        int sum = 0;
        for(SolutionOrder so: solutionorderlist){
         
         MarketChannelAssignment mcc =   so.getMarketChannelCombo();
         if(mcc.getMarket()==m) sum = sum +so.getSolutionPrice();
           
        }

        return sum;

    }
    public int getRevenueByChannel(Channel c) {
        int sum = 0;
        for(SolutionOrder so: solutionorderlist){
         
         MarketChannelAssignment mcc =   so.getMarketChannelCombo();
         if(mcc.getChannel()==c) sum = sum +so.getSolutionPrice();
           
        }

        return sum;

    }
    public int getRevenueByMarketChannelCombo(MarketChannelAssignment mca) {
        int sum = 0;
        for(SolutionOrder so: solutionorderlist){
         
         MarketChannelAssignment mcc =   so.getMarketChannelCombo();
         if(mcc==mca) sum = sum +so.getSolutionPrice(); 
           
        }
        return sum;

    }

    public ArrayList<SolutionOrder> getSolutionorderlist() {
        return solutionorderlist;
    }
    
    

}
