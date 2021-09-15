package MergeSortedArray_88;
/*

 * Date : 09/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] nums3 = {1, 3, 5, 7, 0, 0, 0, 0};
        int[] nums4 = {2, 4, 6, 8};
        int[] nums5 = {4, 5, 6, 0, 0, 0};
        int[] nums6 = {1, 2, 3};
        solution.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        solution.merge(nums3, nums3.length - nums4.length, nums4, nums4.length);
        solution.merge(nums5, nums5.length - nums6.length, nums6, nums6.length);
        System.out.println();

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[i] < nums1[j]) {
                    swap(nums1, i, j);
                }
            }
        }


    }

    private void swap(int[] nums, int pt1, int pt2) {
        System.out.println("swap");
        int temp = nums[pt1];
        nums[pt1] = nums[pt2];
        nums[pt2] = temp;
    }
}
 