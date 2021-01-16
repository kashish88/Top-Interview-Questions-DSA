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
public class PathToGivenNode {
    ArrayList<Integer> arr=new ArrayList<>();
    public ArrayList<Integer> solve(TreeNode A, int B) {
        helper(A,B);
        return arr;
    } private boolean helper(TreeNode root,int val){
        if(root==null) return false;
        if(root.val==val){
            arr.add(0,root.val);
            return true;
        }else if( helper(root.left,val) || helper(root.right,val) ){
            arr.add(0,root.val);
            return true;
        }else return false;
    }
}
