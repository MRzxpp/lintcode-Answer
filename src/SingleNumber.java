/**
 * Created by Zhongsz on 2016/9/21.
 * 落单的数
 */
public class SingleNumber {
    private static int singleNumber(int[] nums) {
        int singleNum, i;
        singleNum = nums[0];
        for (i = 1; i < nums.length ; i++) {
            singleNum ^= nums[i];
        }
        return singleNum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 4, 5, 5, 4, 7};
        System.out.println(SingleNumber.singleNumber(nums));
    }
}
