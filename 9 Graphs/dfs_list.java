package Graphs;
import java.util.*;
//Given a graph G = (V,E) represented by adjacency list
//Perform Depth first search to display
//all the vertices of the graph
//Note that the graph is an undirected graph
public class dfs_list {
    public static class Graph{
        List<Integer>[] adjlist;
        int vertexcount;
        public Graph(int v){
            this.vertexcount = v;
            adjlist = new ArrayList[v];
            for(int i=0;i<v;i++)
                adjlist[i] = new ArrayList<>();
        }
        private void addEdge(int s, int d){
            adjlist[s].add(d);
            adjlist[d].add(s);
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
            //Now find all the vertices which is at one level distance from the queue
            Iterator<Integer> iter = G.adjlist[v].iterator();
            while(iter.hasNext()){
                int u = iter.next();
                if(!visited[u]){
                    stack.push(u);
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
        dfs_list d = new dfs_list();
        System.out.println("The bfs of the given graph is");
        d.dfs(g,s);
        in.close();
    }
}
