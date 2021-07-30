package IntegerToRoman_12;
/*

 * Date : 30/07/21

 * Author : SWASTIK PREETAM DASH

 */


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(58));
    }

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int multiplier = 1;

        while (num != 0) {
            int d = num % 10;
            num = num / 10;
            res.insert(0, findRomanFor(d * multiplier));
            multiplier *= 10;
        }

        return res.toString();
    }

    private String findRomanFor(int i) {

        if (i == 0)
            return "";

        if (i == 4) {
            return "IV";
        } else if (i == 9) {
            return "IX";
        } else if (i == 40) {
            return "XL";
        } else if (i == 90) {
            return "XC";
        } else if (i == 400) {
            return "CD";
        } else if (i == 900) {
            return "CM";
        } else {
            StringBuilder builder = new StringBuilder();
            if (i >= 1000) {
                builder.append("M");
                builder.append(findRomanFor(i - 1000));
            } else if (i >= 500) {
                builder.append("D");
                builder.append(findRomanFor(i - 500));
            } else if (i >= 100) {
                builder.append("C");
                builder.append(findRomanFor(i - 100));
            } else if (i >= 50) {
                builder.append("L");
                builder.append(findRomanFor(i - 50));
            } else if (i >= 10) {
                builder.append("X");
                builder.append(findRomanFor(i - 10));
            }else if (i >= 5) {
                builder.append("V");
                builder.append(findRomanFor(i - 5));
            } else {
                builder.append("I");
                builder.append(findRomanFor(i - 1));
            }
            return builder.toString();
        }
    }
}