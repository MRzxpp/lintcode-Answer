package LintCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;

        if (length == 0) {
            return threeSumList;
        }

        if (nums[0] > 0 || nums[length - 1] < 0) {
            return threeSumList;
        }

        for (int i = 0; i < length - 2; i++) {
            if (i == 0 || (i > 0 && (nums[i] != nums[i - 1]))) {
                int a = nums[i];
                if (a > 0) {
                    break;
                }
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = a + nums[l] + nums[r];
                    if (sum < 0) {
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        l++;
                    }
                    if (sum > 0) {
                        while (nums[r] == nums[r - 1] && r > l) {
                            r--;
                        }
                        r--;
                    }
                    if (sum == 0) {
                        List<Integer> solution = new ArrayList<>();
                        solution.add(a);
                        solution.add(nums[l]);
                        solution.add(nums[r]);
                        threeSumList.add(solution);
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (r > l && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    }
                }
            }
        }
        return threeSumList;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums).toString());
    }
}
