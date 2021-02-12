import java.util.*; 
import java.lang.*; 
import java.io.*; 
public class ShortestPathWithExactlyKEdges {
    // Define number of vertices in the graph and inifinite value
    static final int V = 4; 
    static final int INF = Integer.MAX_VALUE; 
    public static void main(String[] args) {
        int graph[][] = new int[][]{ {0, 10, 3, 2}, 
        {INF, 0, INF, 7}, 
        {INF, INF, 0, 6}, 
        {INF, INF, INF, 0} 
      }; 
ShortestPath t = new ShortestPath(); 
int u = 0, v = 3, k = 2; 
System.out.println("Weight of the shortest path is "+ 
t.shortestPath(graph, u, v, k)); 
    }
    int shortestPath(int graph[][], int u, int v, int k) {
        int sp[][][]=new int[V][V][k+1];
        for(int e=0;e<k;e++){
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                       sp[i][j][e]=INF;

                       if(e==0 && i==j)
                       sp[i][j][e]=0;
                       if(e==1 && graph[i][j]!=INF)
                       sp[i][j][e]=graph[i][j];

                        // go to adjacent only when number of edges is 
                    // more than 1 
                    if(e>1){
                        for(int a=0;a<V;a++){
                              // There should be an edge from i to a and 
                            // a should not be same as either i or j 
                            if(graph[i][a]!=INF && i!=a && j!=a && sp[a][j][e-1]!=INF)
                            sp[i][j][e]=Math.min(sp[i][j][e],graph[i][a]+sp[a][j][e-1]);
                        }
                    }
                }
            }
        }
        return sp[u][v][k]; 
    }
}
