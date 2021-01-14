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
public class KthSmallestElementInTree {
    public int kthsmallest(TreeNode A, int B) {
        int count = 0;
     Stack<TreeNode> s = new Stack<TreeNode>();
     TreeNode node = A;
     while(node != null || !s.empty()) {
         if(node != null) {
             s.push(node); 
             node = node.left;
         } else {
             node = s.pop();
             
             count++;
             if(count == B) 
                 return node.val;
                 
             node = node.right;
         }
         
     }
     return -1;
 }
}
