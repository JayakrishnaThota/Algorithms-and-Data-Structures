/*
    Leetcode Reference for live example of Dijkstras and BellmanFord Algorithm
    https://github.com/JayakrishnaThota/LC/blob/master/743.%20Network%20Delay%20Time
*/

//Dijkstras Time Complexity for adjancecy matrix representation: O(V^2 + ElogV) time and O(V+E) space

//Dijkstra's shortest path using adjacent matrix
package graphs;
import java.util.*;

public class shortestpath {

	public int getMindistance(int[] distance, boolean[] visited){
		int v = distance.length;
		int min = Integer.MAX_VALUE, ret = -1;
		for(int i=0;i<v;i++){
			if(!visited[i] && distance[i]<min){
				min = distance[i];
				ret = i;
			}
		}
		return ret;
	}

	public void dijkstra(int[][] matrix, int s){
		//Initially all are false indicating that we haven't processed any vertex;
		boolean[] visited = new boolean[matrix.length];
		int[] distance = new int[matrix.length];
		for(int i=0;i<distance.length;i++)
			distance[i] = Integer.MAX_VALUE;
		distance[s] = 0;
		for(int count = 0;count<matrix.length-1;count++){
			int u = getMindistance(distance, visited);
			if(u==-1) continue;
			visited[u] = true;
			for (int v = 0; v < matrix.length; v++){
			    if (!visited[v] && matrix[u][v]!=0 && distance[u] != Integer.MAX_VALUE && distance[u]+matrix[u][v] < distance[v])
			        distance[v] = distance[u] + matrix[u][v];
				}
		}
		 printSolution(distance, distance.length);
	}
	public void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < n; i++)
            System.out.println(i+  "    " +dist[i]);
    }

	public static void main(String[] args){
		int[][] adjmat = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
        shortestpath s = new shortestpath();
        s.dijkstra(adjmat, 0);
	}
}
