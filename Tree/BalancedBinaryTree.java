/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */

public class BalancedBinaryTree {
    public int isBalanced(TreeNode A) {
        int lh;
        int rh;
        if(A==null)
        return 1;
        lh=height(A.left);
        rh=height(A.right);
        if(Math.abs(lh-rh)<=1 && isBalanced(A.left)==1&& isBalanced(A.right)==1)
        return 1;
        return 0;
        
     }
      int height(TreeNode node){
             if(node==null)
             return 0;
             
             return 1 +Math.max(height(node.left),height(node.right));
         }
}
