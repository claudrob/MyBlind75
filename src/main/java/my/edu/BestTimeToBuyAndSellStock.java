package my.edu;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int [] prices = {2,4,1};

        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        System.out.println(test.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int buyIndex = 0;

        int sell = 0;
        int sellIndex = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
                buyIndex = i;

                sell = 0;
                sellIndex = i;
            }
            if(prices[i] > sell){
                sell = prices[i];
                sellIndex = i;
            }

            if((sellIndex > buyIndex) && (sell - buy) > profit){
                profit = sell - buy;
            }

        }


        return profit;

    }

    /*
     int profit = 0;
        int bestBuy = prices[0];
        int buyIndex = 0;

        int bestSell = 0;
        int sellIndex = 0;
        for(int i = 1; i < prices.length; i++){
            // better price to buy
            if(prices[i] < bestBuy){
                bestBuy = prices[i];
                buyIndex = i;
                bestSell = 0;
                sellIndex = 1;
            }

            //  better price to sell
            if(prices[i] > bestSell){
                bestSell = prices[i];
                sellIndex = i;
            }

            // profit
            if((bestSell - bestBuy) > profit && sellIndex > buyIndex){
                profit = bestSell - bestBuy;
            }
        }


        return profit;
     */



}
