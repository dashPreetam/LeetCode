package RomanToInteger_13;
/*

 * Date : 30/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.romanToInt("III"));
//        System.out.println(solution.romanToInt("IV"));
//        System.out.println(solution.romanToInt("IX"));
//        System.out.println(solution.romanToInt("LVIII"));
//        System.out.println(solution.romanToInt("MCMXCIV"));
        System.out.println(solution.romanToInt("DCXXI"));

    }

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            System.out.print(c+" ");
            if (c == 'I') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'V') {
                        res += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        res += 9;
                        i++;
                    } else res += 1;
                } else {
                    res += 1;
                }
            } else if (c == 'X') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'L') {
                        res += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        res += 90;
                        i++;
                    } else res += 10;
                } else {
                    res += 10;
                }
            } else if (c == 'C') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'D') {
                        res += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        res += 900;
                        i++;
                    } else res += 100;
                } else {
                    res += 100;
                }
            } else if (c == 'V') {
                res += 5;
            } else if (c == 'L') {
                res += 50;
            } else if (c == 'D') {
                res += 500;
            } else if (c == 'M') {
                res += 1000;
            }
            System.out.println(res);
            i++;
        }

        return res;
    }
}
