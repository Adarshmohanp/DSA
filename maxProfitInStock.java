/*Problem: Given an array prices[] of length n,
representing the prices of the stocks on different days.
The task is to find the maximum profit possible by buying and 
selling the stocks on different days when at most one transaction is allowed.
Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit
then return 0.

Note: Stock must be bought before being sold. */

import java.util.*;

public class maxProfitInStock {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int result=maxProfit(prices);
        System.out.println("maximum profit:"+result);
    }

    public static int maxProfit(int prices[]){
        int n=prices.length;
        int min=999;
        int max=-999;

        for(int i=0;i<n;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            if(max<prices[i]){
                max=prices[i];
            }
        }
        return max-min;
    }
}
