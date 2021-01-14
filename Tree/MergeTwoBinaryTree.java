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
public class MergeTwoBinaryTree {
    public TreeNode solve(TreeNode A, TreeNode B) {
        return helper(A,B);
   }
   TreeNode helper(TreeNode left,TreeNode right){
       if(left==null||right==null) return left==null?right:left;
       TreeNode root=new TreeNode(left.val+right.val);
       root.left=helper(left.left,right.left);
       root.right=helper(left.right,right.right);
       return root;
   }
}
