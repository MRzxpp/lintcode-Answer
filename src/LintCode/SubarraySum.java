package LintCode;

import java.util.ArrayList;

/**
 * 从一个数组中寻找一个最小长度的辅助数组，使得辅助数组中的所有元素和为0，
 * 如果不存在这样的数组，则返回一个空的数组
 * Created by Zhongsz on 2016/9/3.
 */
public class SubarraySum {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     * and the index of the last number
     * 该算法时间复杂度过高
     */
    private ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        int i, j, k;
        ArrayList<Integer> subNum = new ArrayList<>();
        ArrayList<Integer> arrayHeadandEnd = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (i < nums.length) {
                for (j = 0; j < nums.length - i; j++) {
                    if (j < nums.length - i) {
                        subNum.clear();
                        for (k = j; k <= i + j; k++) {
                            if (k <= i + j) {
                                subNum.add(nums[k]);
                            }
                        }
                        if (sumOfArray(subNum) == 0) {
                            arrayHeadandEnd.add(j);
                            arrayHeadandEnd.add(j + i);
                            return arrayHeadandEnd;
                        }
                    }
                }
            }
        }
        return arrayHeadandEnd;
    }

    private int sumOfArray(ArrayList<Integer> subNum) {
        int sum = 0;
        for (Integer aSubNum : subNum) {
            sum += aSubNum;
        }
        return sum;
    }

    /**
     * 该种算法时间复杂度为O(n2)
     *
     * @param nums
     * @return
     */
    public ArrayList<Integer> subarraySumOn2(int[] nums) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result.add(i);
                result.add(i);
                return result;
            }
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) {
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SubarraySum subarraySum = new SubarraySum();
        int[] array = new int[]{-9, 1, 1, 2, 1, -3, 4};
        System.out.println(subarraySum.subarraySum(array));

    }
}
