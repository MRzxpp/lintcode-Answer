import java.util.Arrays;

/**
 * Created by Zhongsz on 2016/9/12.
 * 一次过哈哈哈哈
 */
public class WiggleSort {
    public int[] wiggleSort(int[] nums) {
        int k;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                if (nums[i] > nums[i + 1]) {
                    k = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = k;
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    k = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = k;
                }
            }

        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{3, 5, 2, 1, 6, 7, 8, 5, 3};
        WiggleSort wiggleSort = new WiggleSort();
        System.out.println(Arrays.toString(wiggleSort.wiggleSort(nums)));
    }
}
