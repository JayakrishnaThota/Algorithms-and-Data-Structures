/*
    Leetcode Reference for live example of Dijkstras and BellmanFord Algorithm
    https://github.com/JayakrishnaThota/LC/blob/master/743.%20Network%20Delay%20Time
*/

//Dijkstras Time Complexity for adjancecy matrix representation: O(E + VlogV) time and O(V+E) space

package Graphs;
import java.util.*;
//Given a graph G=(V,E) represented by adjacency list and a source vertex
//Find the shortest distance from source vertex to all other vertices

public class dijkstra_adj_list {

    public static class Graph {
        private ArrayList<Vertex> vertices;
        public Graph(int numberVertices){
            vertices = new ArrayList<Vertex>(numberVertices);
            for(int i=0;i<numberVertices;i++){
                vertices.add(new Vertex("v"+Integer.toString(i)));
            }
        }

        public void addEdge(int src, int dest, int weight){
            Vertex s = vertices.get(src);
            Edge new_edge = new Edge(vertices.get(dest),weight);
            s.neighbors.add(new_edge);
        }

        public ArrayList<Vertex> getVertices() {
            return vertices;
        }

        public Vertex getVertex(int vert){
            return vertices.get(vert);
        }
    }

    public static class Edge{
        public final Vertex target;
        public final double weight;
        public Edge(Vertex target, double weight){
            this.target = target;
            this.weight = weight;
        }
    }

    public static class Vertex implements Comparable<Vertex>{
        final String name;
        ArrayList<Edge> neighbors;
        LinkedList<Vertex> path;
        Double mindistance = Double.POSITIVE_INFINITY;
        Vertex prev;
        public int compareTo(Vertex other){
            return Double.compare(mindistance,other.mindistance);
        }
        public Vertex(String name){
            this.name = name;
            neighbors = new ArrayList<Edge>();
            path = new LinkedList<Vertex>();
        }
        public String toString(){
            return name;
        }
    }

    public void dijkstra(Vertex source){
        source.mindistance = 0.0;
        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
        queue.add(source);
        while(!queue.isEmpty()){
            Vertex u = queue.poll();
            for(Edge neighbour:u.neighbors){
                Double newDist = u.mindistance+neighbour.weight;
                if(neighbour.target.mindistance>newDist){
                    queue.remove(neighbour.target);
                    neighbour.target.mindistance = newDist;
                    neighbour.target.path = new LinkedList<Vertex>(u.path);
                    neighbour.target.path.add(u);
                    queue.add(neighbour.target);
                }
            }
        }
    }

    public static void main(String[] arg){
            dijkstra_adj_list obj = new dijkstra_adj_list();
            Graph g = new Graph(9);
            g.addEdge(0, 1, 4); g.addEdge(0, 7, 8);
            g.addEdge(1, 2, 8); g.addEdge(1, 7, 11); g.addEdge(2, 1, 8);
            g.addEdge(2, 8, 2); g.addEdge(2, 5, 4); g.addEdge(2, 3, 7);
            g.addEdge(3, 2, 7); g.addEdge(3, 5, 14); g.addEdge(3, 4, 9);
            g.addEdge(4, 3, 9); g.addEdge(4, 5, 10);
            g.addEdge(5, 4, 10); g.addEdge(5, 3, 9); g.addEdge(5, 2, 4); g.addEdge(5, 6, 2);
            g.addEdge(6, 7, 1); g.addEdge(6, 8, 6); g.addEdge(6, 5, 2);
            g.addEdge(7, 0, 8); g.addEdge(7, 8, 7); g.addEdge(7, 1, 11); g.addEdge(7, 6, 1);
            g.addEdge(8, 2, 2); g.addEdge(8, 7, 7); g.addEdge(8, 6, 6);
            obj.dijkstra(g.getVertex(0));
            for(Vertex v:g.getVertices()){
                System.out.print("Vertex - "+v+" , Dist - "+ v.mindistance+" , Path - ");
                for(Vertex pathvert:v.path) {
                    System.out.print(pathvert+" ");
                }
                System.out.println(""+v);
            }
    }
}
