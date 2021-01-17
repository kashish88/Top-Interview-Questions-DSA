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
public class ZigZagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
     
        if(A==null){
            return  null;
        }
        Stack<TreeNode>evenStack=new Stack<TreeNode>();
        Stack<TreeNode> oddStack = new Stack<TreeNode>();
        evenStack.push(A);
        ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>(); 
        while(!evenStack.isEmpty()||!oddStack.isEmpty()){
            ArrayList<Integer>evenLevel=new ArrayList<Integer>();
         while(!evenStack.isEmpty()){
             TreeNode node=evenStack.pop();
             evenLevel.add(node.val);
             if(node.left !=null)
	               oddStack.push(node.left);
	            
	        if(node.right !=null)
	               oddStack.push(node.right);
         }
         if(evenLevel.size()>0)
         main.add(evenLevel);
    
    ArrayList<Integer> oddLevel = new ArrayList<Integer>(); 
    
    while(!oddStack.isEmpty())
    {
        TreeNode node = oddStack.pop();
        oddLevel.add(node.val);
        
        if(node.right !=null)
           evenStack.push(node.right);
        
        if(node.left !=null)
           evenStack.push(node.left);
    }
    if(oddLevel.size()>0)
        main.add(oddLevel);
        }
        return main; 
    }
}
