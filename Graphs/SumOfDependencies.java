import java.util.Vector; 
public class SumOfDependencies {
    public static void main(String[] args)  
    { 
        int V = 4; 
          @SuppressWarnings("unchecked") 
        Vector<Integer> adj[] = new Vector[V]; 
          
        for (int i = 0; i < adj.length; i++) { 
            adj[i] = new Vector<>(); 
        } 
          
        addEdge(adj, 0, 2); 
        addEdge(adj, 0, 3); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 2, 3); 
       
        System.out.println("Sum of dependencies is " + 
                            findSum(adj, V)); 
    } 

    static void addEdge(Vector <Integer>adj[],int u,int v){
        adj[u].addElement((v));
    }
    static int findSum(Vector<Integer>adj[],int V){
        int sum=0;
        for(int u=0;u<V;u++){
            sum+=adj[u].size();
        }
        return sum;
    }
}
