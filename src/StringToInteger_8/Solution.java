package StringToInteger_8;
/*

 * Date : 29/07/21

 * Author : SWASTIK PREETAM DASH

 */

import static java.lang.Character.isDigit;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("-91283472332"));
        System.out.println(solution.myAtoi("-+12"));
        System.out.println(solution.myAtoi("+1"));
    }

    public int myAtoi(String s) {
        StringBuilder res = new StringBuilder();
        s=s.trim();
        if(s.length() == 0)
            return 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((i == 0 && (c == '-' || c == '+')) || isDigit(c)){
                res.append(c);
            } else
                break;
        }

        if(res.length() == 0)
            return 0;
        else{
            try {
                return Integer.parseInt(res.toString());
            } catch (NumberFormatException e) {
                if(res.length()>1 && isDigit(res.charAt(1))){
                    if (res.charAt(0) == '-')
                        return -2147483648;
                    else
                        return 2147483647;
                }else return 0;
            }
        }
    }
}
