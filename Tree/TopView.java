import java.util.Deque;

public class TopView {
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    static void topView(Node root){
        if(root==null)
        return ;
        Deque<Pair>q=new ArrayDeque<>();
        Map<Integer,Integer>map=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.getFirst();
            q.removeFirst();
            Node t=p.node;
            int hd=p.hd;
            if(map.get(hd)==null){
                map.put(hd,temp.data);
            }
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,hd+1));
            }
        }
        for(int key:map.values()){
            System.out.print(key+" ");
        }
    }
}
