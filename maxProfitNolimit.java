/*The cost of stock on each day is given in an array price[]. 
Each day you may decide to either buy or sell the stock i at price[i], 
you can even buy and sell the stock on the same day. Find the maximum profit
 that you can get.

Note: A stock can only be sold if it has been bought previously and multiple 
stocks cannot be held on any given day. */
import java.util.*;

public class maxProfitNolimit {
    public static void main(String args[]){
        int prices[]={100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(int prices[]){
        int profit=0;
        int n=prices.length;

        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                profit+=(prices[i+1]-prices[i]);
            }
        }
        return profit;
    }
    
}
