package StoneGame_877;
/*

 * Date : 05/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] piles = {288,479,157,128,401,125,380,492,493,173,90,88,248,189,136,492,438,65,399,68,213,255,32,98,212,174,2,435,323,6,54,109,133,17,156,152,22,154,289,488,181,464,445,483,247,298,77,386,384,152,225,358,171,274,282,339,388,125,20,363,393,391,444,284,434,233,138,179,140,60,246,266,319,372,446,271,50,120,85,148,233,143,100,322,269,347,370,227,336,230,42,260,251,330,359,477,342,471,102,336,480,441,401,95,22,309,147,412,442,89,435,497,249,315,173,110,350,484,56,227,30,157,204,312,95,319,44,381,422,144,198,283,26,27,465,301,407,357,452,432,228,3,404,404,291,276,336,157,28,109,434,373,356,140,295,492,52,106,294,402,354,378,109,91,51,340,102,393,313,405,146,301,2,487,268,190,6,461,372,457,44,356,272,491,349,232,1,272,154,156,214,275,460,19,289,462,163,455,22,285,464,263,330,3,193,164,52,171,247,314,83,381,239,103,407,181,315,88,147,274,341,354,229,206,298,489,297,4,415,484,295,118,372,499,272,216,248,273,49,391,489,16,266,326,428,346,426,69,354,229,24,482,497,103,112,91,331,210,230,390,183,256,172,473,494,372,249,36,464,486,121,415,273,315,472,125,59,196,334,172,196,148,351,72,99,406,304,96,429,477,453,168,187,399,299,409,483,500,431,306,153,392,386,378,220,128,42,497,104,348,307,465,119,1,220,175,201,413,7,154,423,396,167,170,407,316,26,317,334,426,343,470,70,133,255,338,392,31,45,365,479,440,179,276,68,378,259,196,473,268,204,192,56,195,325,402,342,129,385,210,83,51,64,238,21,358,153,274,375,320,31,458,180,309,134,35,272,386,255,82,370,404,334,367,423,359,398,478,102,185,262,221,337,293,277,464,477,207,312,480,337,140,39,407,41,441,417,189,218,43,369,83,87,215,218,463,127,1,87,105,170,122,87,231,261,317,310,131,201,151,440,38,115,3,347,488,15,225,66,216,351,109,383,421,257,324,271,24,161,493,100,499,329,170,183,139,281,449,81,294,191,388,71,178,279,119,342,477,175,62,148,303,468,368,321,120,208,500,417,468,319,470,486,335,389,129,223,59,400,14,461,494,50,208,423,414,148,228,497,30};
        //int[] piles = {5,3,4,5};
        System.out.println(solution.stoneGame(piles));
    }

    public boolean stoneGame(int[] piles) {
        return true;
        //return canWin(0, 0, Arrays.stream(piles).boxed().collect(Collectors.toList()), true, "");
    }

    private boolean canWin(int alexTotal, int leeTotal, List<Integer> piles, boolean alexTurn, String tab) {
        if (piles.size() == 0) {
            if(alexTotal > leeTotal) {
                System.out.println(tab+"Won by : Alex");
                return true;
            } else {
                System.out.println(tab+"Won by : Lee");
                return false;
            }
        } else {
            List<Integer> newListWithoutFirst = new ArrayList<>(piles);
            List<Integer> newListWithoutLast = new ArrayList<>(piles);
            int first = newListWithoutFirst.remove(0);
            int last = newListWithoutLast.remove(newListWithoutLast.size() - 1);
            if (alexTurn) {
                System.out.println(tab+"Alex picking");
                return canWin(alexTotal + first, leeTotal, newListWithoutFirst, false,tab+"") || canWin(alexTotal + last, leeTotal, newListWithoutLast, false,tab+"");
            } else {
                System.out.println(tab+"Lee picking");
                return canWin(alexTotal, leeTotal + first, newListWithoutFirst, true,tab+"") || canWin(alexTotal, leeTotal + last, newListWithoutLast, true,tab+"");
            }
        }
    }
}
