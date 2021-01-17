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
public class RootToLeafPathSum {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        if (A == null) {return new ArrayList<>();}
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       pathSum(A, B, A.val, res, new ArrayList<>());
       return res;
   }
   private void pathSum(TreeNode root, int k, int sum, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list) {
       list.add(root.val);
       if (root.left == null && root.right == null && sum == k) {res.add(new ArrayList<>(list));}
       if (root.left != null) {pathSum(root.left, k, root.left.val + sum, res, new ArrayList<>(list));}
       if (root.right != null) {pathSum(root.right, k, root.right.val + sum, res, new ArrayList<>(list));}
   }
}
