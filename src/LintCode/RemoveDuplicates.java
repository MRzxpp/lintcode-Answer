package LintCode;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int originalLength = nums.length;

        if (originalLength == 0) {
            return 0;
        }

        if (originalLength == 1) {
            return 1;
        }

        if (!isSorted(nums)) {
            return 0;
        }

        int newLength = 1;
        int compare = nums[0];
        for (int i = 1; i < originalLength; i++) {
            if (!(nums[i] == compare)) {
                compare = nums[i];
                nums[newLength] = compare;
                newLength++;
            }
        }
        return newLength;
    }

    public static boolean isSorted(int[] nums) {
        return true;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 2, 3, 4, 4};
        System.out.println("The length of new array is: " + removeDuplicates(test));
        for (int i :
                test) {
            System.out.print(i + ", ");
        }
    }
}
