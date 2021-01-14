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
public class ReverseLevelOrder {
    Queue<TreeNode>q=new LinkedList<>();
    LinkedList<Integer>dq=new LinkedList<>();
public ArrayList<Integer> solve(TreeNode A) {
 if(A==null)
 return new ArrayList<>();
 q.add(A);
 while(!q.isEmpty()){
     TreeNode root=q.poll();
     dq.addFirst(root.val);
     if(root.right!=null){
         q.add(root.right);
     }
       if(root.left!=null){
         q.add(root.left);
     }
 }
 return new ArrayList(dq);
    
}
}
