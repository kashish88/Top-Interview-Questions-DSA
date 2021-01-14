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
public class PreOrder {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
       
       Stack<TreeNode> S = new Stack<TreeNode>();
       
      if(A == null) return res;
      TreeNode curr = A;
      S.push(curr);
      
      while(S.size() > 0){
          curr = S.pop();
          res.add(curr.val);
          if(curr.right != null) S.push(curr.right);
          if(curr.left != null) S.push(curr.left);
      }
       return  res;
   }
}
