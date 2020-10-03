/*
    Leetcode Reference for live example of prims and kruskals
    https://github.com/JayakrishnaThota/LC/blob/master/Locked/1135.%20Connecting%20Cities%20With%20Minimum%20Cost
*/

package Graphs;
import java.util.*;

public class Prim {

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

    public void prim(int[][] matrix){
        int v = matrix.length;
        int[] parent = new int[v];
        boolean[] visited = new boolean[v];
        int[] distance = new int[v];
        Arrays.fill(distance, Integer.MAX_VALUE);
        //Lets start with including vertex 0;
        parent[0] = -1;
        distance[0] = 0;
        for(int count=1;count<v;count++){
            int u = getMindistance(distance,visited);
            visited[u] = true;
            for(int j=0;j<v;j++){
                if(j==u) continue;
                if(!visited[j]&&matrix[u][j]!=0&&matrix[u][j]<distance[j]){
                    distance[j] = matrix[u][j];
                    parent[j] = u;
                }
            }
        }
        printMst(matrix, parent);
    }
    public void printMst(int[][] matrix, int[] parent){
        int n = matrix.length;
        System.out.println("Edge   Weight");
        for (int i = 1; i < n; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                    matrix[i][parent[i]]);
    }
    public static void main(String[] args) {
        Prim p = new Prim();
        int[][] matrix = new int[][] {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0},
        };
        p.prim(matrix);

    }
}
