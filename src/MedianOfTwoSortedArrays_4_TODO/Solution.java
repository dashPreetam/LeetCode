package MedianOfTwoSortedArrays_4_TODO;
/*

 * Date : 24/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,};
        int[] nums2 = {3,4,5,6};
        System.out.println(solution.findMedianSortedArrays(nums2,nums1));
    }
    public double findMedianSortedArrays(int[] firstArray, int[] secondArray) {

        int m = firstArray.length;
        int n = secondArray.length;
        
        if(n>m)
            return findMedianElement(firstArray,secondArray,0,m-1,0,n-1);
        else
            return findMedianElement(secondArray,firstArray,0,n-1,0,m-1);
    }

    private double findMedianElement(int[] firstArray, int[] secondArray, int firstRangeStart, int firstRangeEnd, int  secondRangeStart, int secondRangeEnd) {
        return 0;
    }
}
