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
public class RightViewOfBinaryTree {
    Set<Integer>set=new HashSet<>();
    ArrayList<Integer>ar=new ArrayList<>();
    public ArrayList<Integer> solve(TreeNode A) {
        helper(A,0);
        return ar;
    }
    public void helper(TreeNode root,int level){
        if(root==null)
        return ;
        if(!set.contains(level)){
            ar.add(root.val);
            set.add(level);
        }
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
}
