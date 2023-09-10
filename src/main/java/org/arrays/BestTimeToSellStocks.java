package org.arrays;

public class BestTimeToSellStocks {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int minSoFar=prices[0];
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<minSoFar){
                minSoFar=prices[i];
            }
            if((prices[i]-minSoFar)>maxProfit){
                maxProfit=prices[i]-minSoFar;
            }
        }
        return maxProfit;
    }
}
