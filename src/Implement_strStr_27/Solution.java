package Implement_strStr_27;
/*

 * Date : 17/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("aaaaa","bba"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        if (haystack.isEmpty())
            return -1;

        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            String pattern = haystack.substring(i,i+needle.length());
            if(pattern.equals(needle))
                return i;
        }

        return -1;
    }
}
