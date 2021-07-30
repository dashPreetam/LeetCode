package LongestSubstringWithoutRepeatingCharacters_3;
/*

 * Date : 24/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.HashMap;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        if (s.length() < 2)
            return s.length();


        int max = Integer.MIN_VALUE, curr = 0;
        StringBuilder pattern = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c :
                s.toCharArray()) {
            if (pattern.toString().contains("" + c)) {
                int indexOfC = map.get(c);
                curr = Math.max(
                        pattern.substring(0, indexOfC + 1).length(),
                        pattern.substring(indexOfC + 1).length()
                );
                max = Math.max(curr, max);
                pattern.delete(0, indexOfC + 1);
                pattern.append(c);
                map.clear();
                for (int i = 0; i < pattern.length(); i++) {
                    map.put(pattern.charAt(i),i);
                }
            } else {
                pattern.append(c);
                max = Math.max(max, pattern.length());
                map.put(c,pattern.length()-1);
            }
        }
        max = Math.max(max, pattern.length());
        return max;
    }
}
