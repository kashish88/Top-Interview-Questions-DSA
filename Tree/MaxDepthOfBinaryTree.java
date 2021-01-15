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
public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode A) {
        if(A==null){
            return 0;
        }
        int left = 1+maxDepth(A.left);
        int right = 1+maxDepth(A.right);
        return Math.max(left,right);
    }
}
