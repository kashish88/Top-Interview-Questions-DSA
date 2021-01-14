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
public class InvertTheBinaryTree {
    public TreeNode invertTree(TreeNode A) {
        if(A == null)
           return null;
       TreeNode temp = A.left;
       A.left = invertTree(A.right);
       A.right = invertTree(temp);
       return A;
   }
}
