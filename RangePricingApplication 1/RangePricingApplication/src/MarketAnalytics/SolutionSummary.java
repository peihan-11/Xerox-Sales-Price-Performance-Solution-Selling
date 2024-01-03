/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarketAnalytics;

import TheBusiness.Business.Business;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.SolutionOrders.SolutionOrder;
import java.util.ArrayList;

/**
 *
 * @author JANFAN
 */
public class SolutionSummary {
    Market market;
    Business business;
    ArrayList<SolutionOffer> solutionList;
    
    public SolutionSummary(Market m, Business b){
        
        this.market=m;
        this.business=b;
        solutionList=new ArrayList<>();
    }
    
    //method to find all solution match this market
    //1. find all solutionOrder in business by business.getMasterSolutionOrderList
    //1.5 get solution offer and marketSolutionAssi
    //2. get marketSolutionAssi in each solutionOffer
    //3. check if this marketSolutionAssi match this market
    //if yes, add this solutionOffer into solutionList
    //4. sort solutionList by price
    //print first 3 solutionOffer
    
    public void calSolutions(){
        ArrayList<SolutionOrder>tempList=business.getMasterSolutionOrderList().getSolutionorderlist();
        for(SolutionOrder sor:tempList){
            MarketChannelAssignment mca=sor.getMarketChannelCombo();//get mca
            if(mca.isMarketMatch(market)){
                solutionList.add(sor.getSelectedsolutionoffer());// add solution offer which match same market
            }
        }
        solutionList.sort((i2,i1)->Integer.compare(i1.getRevenues(),i2.getRevenues()));
        System.out.println("\ntop 3 best negotiated solutions in "+market.toString());
        
        try{
        for (int i=0; i<3;i++){
            System.out.println(solutionList.get(i)+ " price:"+solutionList.get(i).getRevenues());
        }
        }catch(Exception e){
            System.out.println("solution not enough");
        }
    }
    
    public void solutionsAdjust(){
        ArrayList<SolutionOrder>tempList=business.getMasterSolutionOrderList().getSolutionorderlist();
        for(SolutionOrder sor:tempList){
            MarketChannelAssignment mca=sor.getMarketChannelCombo();//get mca
            if(mca.isMarketMatch(market)){
                solutionList.add(sor.getSelectedsolutionoffer());// add solution offer which match same market
            }
        }
        for(SolutionOffer s:solutionList){
            int entropy = s.getSolutionPrice() - s.getAltPrice();
            System.out.println(s+" Revenue: "+entropy);
            if(entropy < 0){
            System.out.println("Lower the Target Price");
            }
            else{
            System.out.println("Higher the Target Price");
            }
        }
    }
}
