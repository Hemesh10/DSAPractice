package Arrays;

public class _0016_best_time_to_buy_or_sell_stock {
    static int maxProfit(int[] p) {
        int profit = 0, cost = Integer.MAX_VALUE;

        for (int i = 0 ; i < p.length ; i++) {
            if (p[i] < cost) {
                cost = p[i];
                continue;
            }

            profit = Math.max(profit, p[i] - cost);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println(result);
    }
}
