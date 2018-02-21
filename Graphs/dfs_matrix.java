package Graphs;
import java.util.*;

//Given a graph G = (V,E) represented by adjacency matrix
//Perform breadth first search to display
//all the vertices of the graph
//Note that the graph is an undirected graph
public class dfs_matrix {
    public static class Graph{
        boolean[][] adjmatrix;
        int vertexcount;
        public Graph(int v){
            this.vertexcount = v;
            adjmatrix = new boolean[v][v];
        }
        private void addEdge(int s, int d){
            adjmatrix[s][d] = true;
            adjmatrix[d][s] = true;
        }
    }

    private void dfs(Graph G, int s){
        Stack<Integer> stack = new Stack<Integer>();
        int vertexcount = G.vertexcount;
        boolean[] visited = new boolean[vertexcount];
        stack.push(s);
        while(!stack.isEmpty()){
            int v = stack.peek();
            stack.pop();
            if(!visited[v]){
                display(v);
                visited[v] = true;
            }
            for(int u=0;u<vertexcount;u++){
                if(G.adjmatrix[u][v]==true && !visited[u]){
                    stack.push(u);
                    visited[v] = true;
                }
            }
        }
    }

    private void display(int v){
        System.out.print(v+" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no of vertices in your graph");
        int v = in.nextInt();
        Graph g = new Graph(v);
        System.out.println("Please enter the no of edges in your graph");
        int e = in.nextInt();
        for(int i=0;i<e;i++){
            System.out.println("Please enter the first and second edge");
            int a = in.nextInt();
            int b = in.nextInt();
            g.addEdge(a,b);
        }
        System.out.println("Please enter the source vertex from which you want to start bfs from");
        int s = in.nextInt();
        System.out.println("The bfs of the given graph is");
        dfs_matrix d = new dfs_matrix();
        d.dfs(g,s);
        in.close();
    }
}
