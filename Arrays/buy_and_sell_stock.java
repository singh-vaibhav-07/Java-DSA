// Time Complexity = O(n) 
// -> proportional to length of days of prices
// -> if days is 10, loop will run 10 times

public class buy_and_sell_stock {
    public static int buyAndSell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);// to check the max profit from today & update accordingly
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSell(prices));
    }
}
