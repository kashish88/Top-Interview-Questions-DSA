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
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode A) {
        if(A==null) return 0;
     
     return sumNumbersUtil(A,0,1)%1003;
    }
    public int sumNumbersUtil(TreeNode A, int sum, int depth){
        if(A==null) return 0;
        //sum = (sum*depth+A.val)%1003;
        if(A.left==null&&A.right==null){
            return (sum*10+A.val)%1003;
        }
        int left = sumNumbersUtil(A.left,(sum*10+A.val)%1003,depth);
        int right = sumNumbersUtil(A.right,(sum*10+A.val)%1003,depth);
        
        
        return (left+right)%1003;
    }
}
