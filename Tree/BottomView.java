import java.util.*;
public class BottomView {
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<Integer>bottomView(Node root){
        ArrayList<Integer>al=new ArrayList<Integer>();
        if(root==null)
            return al;
            Deque<Pair>q=new ArrayDeque<>();
            Map<Integer,Integer>map=new TreeMap<>();
            q.add(new Pair(root,0));
            while(!q.isEmpty()){
                Pair p=q.getFirst();
                q.removeFirst();
                Node temp=p.node;
                int hd=p.hd;
                map.put(hd,temp.data);
                if(temp.left!=null){
                    q.add(new Pair(temp.left,hd-1));
                }
                if(temp.right!=null){
                    q.add(new Pair(temp.right,hd+1));
                }
            }
       
            for(int key:map.values()){
                al.add(key);
            }
            return al;
    }
}
