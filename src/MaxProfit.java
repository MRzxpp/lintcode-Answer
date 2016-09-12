/**
 * Created by Zhongsz on 2016/9/12.
 */
public class MaxProfit {

    /**
     * 时间复杂度为O(n2)，过高
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

    public static void main(String args[]) {
        int[] nums = new int[]{7,6,4,3,1};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxprofit(nums));
    }
}
