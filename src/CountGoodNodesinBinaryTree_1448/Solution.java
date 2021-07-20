package CountGoodNodesinBinaryTree_1448;
/*

 * Date : 20/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        List<Integer> valuesInPath = new ArrayList<>();
        helper(root, valuesInPath);
        return count;
    }

    public void helper(TreeNode root, List<Integer> valuesInPath){
        if(root == null)
            return;

        if(hasNoGreater(root.val,valuesInPath)){
            count++;
        }

        List<Integer> newValues = new ArrayList<>(valuesInPath);
        newValues.add(root.val);
        helper(root.left,newValues);
        helper(root.right,newValues);

    }

    private boolean hasNoGreater(int val, List<Integer> valuesInPath) {

        for (int x : valuesInPath) {
            if (x > val)
                return false;
        }

        return true;
    }
}
