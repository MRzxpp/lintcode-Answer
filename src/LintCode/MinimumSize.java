package LintCode;

import java.util.ArrayList;

import static java.lang.Math.min;

/**
 * Created by Zhongsz on 2016/9/5.
 */
public class MinimumSize {
    /**
     * @param nums : an array of integers
     * @param s    :    an integer
     * @return: an integer representing the minimum size of subarray
     * 时间复杂度为O（n2）
     */
    public int minimumSize(int[] nums, int s) {
        // write your code here
//        nums = new int[]{2, 3, 1, 2, 4, 3};
//        nums = new int[]{3, 5, 1, 2, 2, 2};
        nums = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5, 10};
        s = 55;
        int sum, len = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> resultStore = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.clear();
            sum = 0;
            if (nums[i] >= s) {
                resultStore.clear();
                resultStore.add(nums[i]);
                return resultStore.size();
            }
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                result.add(nums[j]);
                if (sum >= s && result.size() <= len) {
                    len = result.size();
                    resultStore.clear();
                    resultStore.addAll(result);
                    break;
                }

            }
        }
        if (resultStore.size() == 0) {
            return -1;
        }

        return resultStore.size();
    }

    /**
     * 时间复杂度为O(nlog2n)
     *
     * @param nums
     * @param s
     * @return
     */

    public int minimumSizeIndicator(int[] nums, int s) {
        int result = 2147483647;
        int sum = 0;
        int start = 0;
        int end = 0;
        for (; end < nums.length; end++) {
            sum += nums[end];
            if (sum >= s) {
                result = min(result, end - start + 1);
                for (; start <= end; start++) {
                    if (sum >= s) {
                        sum -= nums[start];
                        result = min(result, end - start + 1);
                    } else {
                        break;
                    }
                }
            }
        }
        if (result == 2147483647) {
            return -1;
        }
        return result;
    }


    public static void main(String args[]) {
        int[] a = new int[]{2, 3, 1, 2, 3, 3};
        int b = 7;
        MinimumSize minimumSize = new MinimumSize();
        System.out.println(minimumSize.minimumSizeIndicator(a, b));
    }
}
