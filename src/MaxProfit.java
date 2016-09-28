/**
 * Created by Zhongsz on 2016/9/12.
 */
public class MaxProfit {

    /**
     * 时间复杂度为O(n2)，过高
     *
     * @param prices
     * @return
     */
    public int maxprofit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int difference = prices[j] - prices[i];
                profit = (profit > difference) ? profit : difference;
            }
        }

        return profit;
    }

    /**
     * 遍历数组 时间复杂度为O(n)
     * @param prices
     * @return
     */
    public int maxprofit2(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int profit = 0;
        int curMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            curMin = Math.min(curMin, prices[i]);
            profit = Math.max(profit, prices[i] - curMin);
        }
        return profit;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{7, 6, 4, 3, 12};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxprofit2(nums));
    }
}
