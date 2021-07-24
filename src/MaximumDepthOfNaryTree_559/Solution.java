package MaximumDepthOfNaryTree_559;
/*

 * Date : 21/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {
    int maxDepth;
    public int maxDepth(Node root) {
        maxDepth = 0;

        helper(root,1);

        return maxDepth;
    }

    private void helper(Node root, int i) {
        if(root == null)
            return;

        if(i > maxDepth)
            maxDepth = i;

        for (Node child :
                root.children) {
         helper(child,i+1);
        }
    }
}
