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
public class DiagonalTraversal {
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    Map<Integer,ArrayList<Integer>>map=new HashMap<>();
    public ArrayList<Integer>solve(TreeNode A){
        ArrayList<Integer> ar= new ArrayList<>();
        if(A==null)
        return arr;
        traverse(A,0);
        for(int i=min;i<=max;i++){
            ar.addAll(map.get(i));
        }
        return ar; 
    }
    public void traverse(TreeNode temp,int l){
        if(temp==null) return;
        ArrayList<Integer>a=map.getOrDefault(l, new ArrayList<>());
        a.add(temp.val);
        map.put(l,a);
        min=Math.min(l,min);
        max=Math.max(l,max);
        if(temp.left!=null)
        traverse(temp.left,l+1);
        if(temp.right!=null) 
        traverse(temp.right,l);
    }

}
