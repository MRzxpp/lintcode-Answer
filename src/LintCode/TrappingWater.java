package LintCode;

public class TrappingWater {
    public static void main(String[] args) {
        int[] array = {2,0,2};
        System.out.println(trappingWater(array));
    }

    private static int trappingWater(int[] height) {
        int water = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int left = 0;
            int right = 0;
            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }
            water += Math.min(left, right) - height[i];

        }
        return water;
    }
}
