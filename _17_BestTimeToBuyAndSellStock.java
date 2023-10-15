package TopInterviewQuestions;

public class _17_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(bestTimeForBuy(arr));
    }

    private static int bestTimeForBuy(int[] prices) {
        int currentProfit = 0;
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i = 1; i < prices.length; i++)
        {
            currentProfit = prices[i] - buyPrice;
            maxProfit = Math.max(currentProfit, maxProfit);
            buyPrice = Math.min(prices[i], buyPrice);
        }
        return maxProfit;
    }
}
