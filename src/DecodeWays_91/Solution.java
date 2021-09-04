package DecodeWays_91;
/*

 * Date : 18/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDecodings("106"));
    }

    public int numDecodings(String s) {
        return recursiveHelper(s, 0);
    }

    private int recursiveHelper(String pattern, int currentPosition) {
        if (currentPosition >= pattern.length())
            return 0;
        int counter = 0;

        int currentNumber = Integer.parseInt(pattern.charAt(currentPosition)+"");
        System.out.println(currentNumber);

        if (currentNumber == 0) {
            return 0;
        } else if (currentNumber == 1) {
            counter += 2 + recursiveHelper(pattern, currentPosition + 1) + recursiveHelper(pattern, currentPosition + 2);
        } else if (currentNumber == 2) {
            counter += 1 + recursiveHelper(pattern, currentPosition + 1);
            if (currentPosition < pattern.length() - 1 && Integer.parseInt(pattern.charAt(currentPosition+1)+"") <= 6)
                counter += 1 + recursiveHelper(pattern, currentPosition + 2);
        } else {
            counter += 1 + recursiveHelper(pattern, currentPosition + 1);
        }

        return counter;
    }
}
