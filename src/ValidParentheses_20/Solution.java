package ValidParentheses_20;
/*

 * Date : 19/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("(()())(())"));
    }

    public boolean isValid(String s) {

        if(s.length() <= 1)
            return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '[')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;

                char top = stack.pop();

                if((c == '}' && top != '{') || (c == ')' && top != '(') || (c == ']' && top != '[')){
                    return false;
                }

            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
