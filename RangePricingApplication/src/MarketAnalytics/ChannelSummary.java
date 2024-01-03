/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarketAnalytics;
import TheBusiness.MarketModel.ChannelCatalog;
import TheBusiness.MarketModel.Channel;
import java.util.ArrayList;
/**
 *
 * @author kal bugrara
 */
public class ChannelSummary {
    Channel channel;
    String channeltype;
    ArrayList<Channel> channellist;
    public ChannelSummary(Channel channel, ChannelCatalog c){
        channel = this.channel;
        channellist = c.getChannellist();
    }
    public String getType(){
        return channeltype;
    }
    public void printOutSummary(){
        for(Channel c : channellist){
            System.out.println(c.getChannelType());
        }
    }
    
}
