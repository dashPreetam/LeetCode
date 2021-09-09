package AddBinary_67;
/*

 * Date : 05/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1"));
        System.out.println(solution.addBinary("0", "0"));
        System.out.println(solution.addBinary("1010", "1011"));
        System.out.println(solution.addBinary("111", "111"));
        System.out.println(solution.addBinary("100", "110010"));
    }


    public String addBinary(String a, String b) {

        int posA = a.length() - 1, posB = b.length() - 1;
        StringBuilder res = new StringBuilder();

        for (; ; posA--, posB--) {
            if (posA >= 0 && posB >= 0) {
                res.insert(0, add(a.charAt(posA), b.charAt(posB), carry));
            } else if (posA >= 0) {
                res.insert(0, add(a.charAt(posA), '0', carry));
            } else if (posB >= 0) {
                res.insert(0, add('0', b.charAt(posB), carry));
            } else break;
        }
        if (carry == '1')
            res.insert(0,'1');

        return res.toString();
    }

    char carry = '0';

    private char add(char a, char b, char c) {
        if (a == '1') {
            if (b == '1') {
                if (c == '1') {
                    carry = '1';
                    return '1';
                } else {
                    carry = '1';
                    return '0';
                }
            } else {
                if (c == '1') {
                    carry = '1';
                    return '0';
                } else {
                    carry = '0';
                    return '1';
                }
            }
        } else {
            if (b == '1') {
                if (c == '1') {
                    carry = '1';
                    return '0';
                } else {
                    carry = '0';
                    return '1';
                }
            } else {
                if (c == '1') {
                    carry = '0';
                    return '1';
                } else {
                    carry = '0';
                    return '0';
                }

            }
        }
    }

}
