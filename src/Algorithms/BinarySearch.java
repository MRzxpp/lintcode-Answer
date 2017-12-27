package Algorithms;

import java.util.Arrays;

/**
 * 二分查找法
 * Created by WYN on 2017/1/18.
 */
public class BinarySearch {
    public static int rank(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = {3, 5, 1, 2, 22, 11, 55, 33, 67, 3, 1, 22};
        Arrays.sort(whitelist);
        int key = 5;
        if (rank(key, whitelist) < 0) {
            System.out.print(key);
        }
    }
}
