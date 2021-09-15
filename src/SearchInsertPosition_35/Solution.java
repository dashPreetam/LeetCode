package SearchInsertPosition_35;
/*

 * Date : 09/09/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 6));
        System.out.println(solution.searchInsert(new int[]{2, 2, 4, 4}, 3));

    }

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = -1;

        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return r+1;
    }

}
