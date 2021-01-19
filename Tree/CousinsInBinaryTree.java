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
import java.util.*;

import javax.swing.tree.TreeNode;
public class CousinsInBinaryTree {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer>result=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(A);
        boolean carryon=true;
        while(!q.isEmpty() && carryon){
            int size=q.size();
            for(int y=0;y<size;y++) {
                TreeNode temp = q.poll();
                if (temp.val == B) continue;
                if ((temp.left != null && temp.left.val == B) || (temp.right != null && temp.right.val == B)){carryon=false;continue;}
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            result.add(temp.val);
        }
        return result;

    }
}
