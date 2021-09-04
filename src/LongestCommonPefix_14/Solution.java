package LongestCommonPefix_14;
/*

 * Date : 02/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"tester", "test","tes"};
        //String[] strs = {"flower","flow","flight"};
        //String[] strs = {"dog","racecar","car"};
        //String[] strs = {"","",""};
        System.out.println(solution.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length <= 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        List<String> prefs = new ArrayList<>();

        for (int i = 0; i < strs[0].length(); i++) {
            prefs.add(strs[0].substring(0, i + 1));
        }

        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            System.out.println(prefs);
            if(word.length()==0||prefs.isEmpty()){
                prefs.clear();
                break;
            }
            if(prefs.get(prefs.size()-1).length() > word.length()){
                removeAllToRight(word.length(),prefs);
            }
            for (int j = 0; j < word.length(); j++) {
                if(!prefs.contains(word.substring(0,j+1))){
                    removeAllToRight(j,prefs);
                    break;
                }
            }
            if(prefs.size()==0)
                break;
        }


        if (prefs.size() > 0)
            return prefs.get(prefs.size() - 1);
        else
            return "";

    }

    private void removeAllToRight(int i, List<String> prefs) {
        while (prefs.size() > i) {
            prefs.remove(prefs.size()-1);
        }
    }
}
