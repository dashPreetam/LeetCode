package GenerateParentheses_22;
/*

 * Date : 19/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.ArrayList;
import java.util.List;
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        helper(results, n, 0,0, "");
        return results;
    }

    private void helper(List<String> results, int n, int open,int close, String pattern) {

        if(pattern.length()  == n * 2)
        {
            if(!results.contains(pattern))
            results.add(pattern);
            return;
        }

        if(open < n)
            helper(results,n,open+1,close,pattern+"(");

        if(close<open)
            helper(results,n,open,close+1,pattern+")");

    }
}