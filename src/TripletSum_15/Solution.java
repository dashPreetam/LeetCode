package TripletSum_15;
/*

 * Date : 02/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //int[] nums = {3, 0, -2, -1, 1, 2};
        //int[] nums = {13, -11, -14, 4, -9, -10, -11, 7, -14, -9, 14, 0, -5, -7, 6, -9, 11, 6, -14, -12, -10, 9, -8, -7, 5, 6, 8, -12, -1, -4, 14, -3, 0, 7, 9, 7, 12, 13, -9, 13, 11, -10, -10, -9, -10, 12, -10, 8, -5, 13, 11, -8, 7, -12, 0, -11, 2, -14, -8, 8, -3, 13, -9, 5, 5, 7, -11, -6, 5, -13, -7, 1, 14, -10, -1, -11, -13, 4, 12, -11, 2, 0, -4, -14, 4, 4, -10, 13, -3, -10, 6, 1, -12, 4, -9, 1, -4, -13, 10, 8, -11, 10, -14, -12, -14, 1, -8, 10, -10, 11, -15, 0, -3, -12, 1, -14, -1, -1, 6, 11, -4, -3, -2, -1, -13};
        System.out.println(solution.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        int l = 0, r = nums.length - 1;
        boolean moveLeft  = false, moveRight = false;

        while (l<r){
            System.out.println(nums[l]+" "+nums[r]);
            int x = binarySearch(-1*(nums[l]+nums[r]),nums);
            if(x!=-1){
                if(x!=l && x!=r){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[l]);
                    triplet.add(nums[x]);
                    triplet.add(nums[r]);
                    triplet.sort(Comparator.naturalOrder());
                    if (!res.contains(triplet)) {
                        res.add(triplet);
                    }
                }
                l++;
                r--;

            } else {
                if (!moveLeft){
                    l++;
                    moveLeft = true;
                } else if(!moveRight){
                    l--;
                    r--;
                    moveRight = true;
                } else {
                    l++;
                    moveLeft = false;
                    moveRight = false;
                }
            }
        }

        return res;
    }

    private int binarySearch(int x, int[] arr) {
        System.out.println("Searching for :" + x);

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}

/*

for (int i = 0; i < nums.length - 2; i++) {
            int l  = i+1;
            int r = nums.length-1;
            while (l<r){
                if(nums[i]+nums[l]+nums[r] == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    if(!res.contains(triplet))
                    res.add(triplet);
                    l++;r--;
                } else if(nums[i]+nums[l]+nums[r] > 0)
                    r--;
                else l++;
            }
        }
 */
