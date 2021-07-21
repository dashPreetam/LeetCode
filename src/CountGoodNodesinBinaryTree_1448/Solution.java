package CountGoodNodesinBinaryTree_1448;
/*

 * Date : 20/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {
    private int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        helper(root, Integer.MIN_VALUE);
        return count;
    }

    public void helper(TreeNode root, int greatestInPath){
        if(root == null)
            return;

        if(root.val > greatestInPath){
            count++;
            greatestInPath = root.val;;
        }

        helper(root.left,greatestInPath);
        helper(root.right,greatestInPath);

    }
}
