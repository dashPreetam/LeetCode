package XOfAKindInADeckOfCards_914;
/*

 * Date : 18/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.HashMap;
import java.util.Set;

public class Solution {

    public boolean hasGroupsSizeX(int[] deck) {

        if(deck.length <= 1)
            return false;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int x: deck) {
            freq.put(x,freq.getOrDefault(x,0)+1);
        }

        int hcf = hcfFinder(freq);
        System.out.println(hcf);

        if (hcf == 1)
            return false;
        else return true;

    }

    static int hcfFinder(HashMap<Integer,Integer> freq) {
        int hcf = 0;

        Set<Integer> set = freq.keySet();

        for (int x: set) {
            hcf = hcf(hcf,freq.get(x));
        }

        return hcf;
    }

    static int hcf(int a, int b){
        if (a == 0)
            return b;
        return hcf(b % a, a);
    }
}
