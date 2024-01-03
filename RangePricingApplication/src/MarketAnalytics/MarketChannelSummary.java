/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarketAnalytics;

import TheBusiness.MarketModel.MarketChannelAssignment;

/**
 *
 * @author kal bugrara
 */
public class MarketChannelSummary {
    MarketChannelAssignment marketchannelassignment;
    int revenues;
    public MarketChannelSummary(MarketChannelAssignment mc){
        
        marketchannelassignment = mc;        
        revenues = mc.getRevenues();        
    }
    public int getRevenues(){
        return revenues;
    }

}
