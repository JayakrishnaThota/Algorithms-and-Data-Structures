package Graphs;
import java.util.*;

//Topological sort using indegrees(Kahn's Algorithm)
public class TopologicalSortBfs {
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
        }
    }

    private List<Integer> topsort(Graph G){
        List<Integer> list = new ArrayList<>();
        int vertexcount = G.vertexcount;
        int count = 0;
        //Get all the nodes whose indegree is zero
        //i.e. all the courses which do not require any prerequistes
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[vertexcount];
        for(int i=0;i<G.adjlist.length;i++){
            int s = i;
            for(Integer d:G.adjlist[i]){
                indegree[d]++;
            }
        }
        for(int i=0;i<vertexcount;i++){
            if(indegree[i]==0) { q.offer(i); list.add(i); count++; }
        }
        while(!q.isEmpty()){
            int u = q.poll();
            for(Integer v:G.adjlist[u]){
                if(--indegree[v]==0) {
                    q.offer(v);
                    count++;
                    list.add(v);
                }
            }
        }
        return (count==vertexcount)?list:new ArrayList<>();
    }

    public void display(List<Integer> list){
        for(Integer i:list){
            System.out.print(i+"->");
        }
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
        TopologicalSortBfs b = new TopologicalSortBfs();
        System.out.println("The topological sort of the given graph is");
        List<Integer> list = b.topsort(g);
        b.display(list);
        in.close();
    }
}
