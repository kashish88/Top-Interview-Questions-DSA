/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FlattenBinaryTreeToLinkedList {
    TreeNode prev = null;
    public TreeNode flatten(TreeNode a) {
         if(a==null) return a;
        
        flatten(a.right);
        flatten(a.left);
        a.right = prev;
        a.left = null;
        prev = a;
        
        return a;
    }
}
