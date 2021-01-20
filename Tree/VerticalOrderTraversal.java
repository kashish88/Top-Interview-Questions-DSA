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
public class VerticalOrderTraversal {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A){

        if(A==null)
        return new ArrayList<>();
        ArrayList<TreeNode>node=new ArrayList<>();
        node.add(A);
        ArrayList<Integer> level = new ArrayList<>();
        level.add(0);
        verticalOrderTraversal(node,level);
        ArrayList levels = new ArrayList<>(map.keySet());
        Collections.sort(levels);
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        for (int i = 0; i < levels.size(); i++){
            sol.add(map.get(levels.get(i)));
        }
        return sol;
    }
    private void verticalOrderTraversalAux(ArrayList<TreeNode> nodes, ArrayList<Integer> levels) {

        if(node.size()==0)
        return ;
        ArrayList<TreeNode>nextNodes=new ArrayList<>();
        ArrayList<TreeNode>nextLevels=new ArrayList<>();

        for(int i=0;i<nodes.size();i++){

            TreeNode node=nodes.get(i);
            int level = levels.get(i);
            ArrayList<Integer> list = map.getOrDefault(level, new ArrayList<>());
            list.add(node.val);
            map.put(level,list);
            if(node.left!=null){
                nextNodes.add(node.left);
                nextNodes.add(level-1);
            }
            if(node.right!=null){
                nextNodes.add(node.right);
                nextNodes.add(level+1);
            }
        }
        verticalOrderTraversalAux(nextNodes, nextLevels);
    }
}
