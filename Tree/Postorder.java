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
public class Postorder {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> ans=new ArrayList<>();
      if(A==null)return ans;
      Stack<TreeNode>s=new Stack<>();
    s.push(A);
      while(!s.isEmpty()){
         
          TreeNode t=s.pop();
          ans.add(0,t.val);
         if(t.left!=null)
         s.push(t.left);
          if(t.right!=null)
         s.push(t.right);
      }
      return ans;
  }
}
