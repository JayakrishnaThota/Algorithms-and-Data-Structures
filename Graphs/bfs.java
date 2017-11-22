package graphs;
import java.util.*;

public class bfs {
	public static void bfs(graph g, int source){
		Queue<Integer> q = new LinkedList();
		q.offer(source);
		g.visited[source] = true;
		while(!q.isEmpty()){
			int temp = q.poll();
			System.out.println(temp+1);
			for(int i=0;i<g.vertexcount;i++){
				if((g.adjmatrix[temp][i])&&!g.visited[i]){
					g.visited[i] = true;
					q.offer(i);
				}
			}
		}
	}
	public static void main(String[] args){
		graph g = new graph(6);
		g.adjmatrix[0][1] = true;
		g.adjmatrix[0][2] = true;
		g.adjmatrix[1][3] = true;
		g.adjmatrix[1][4] = true;
		g.adjmatrix[2][4] = true;
		g.adjmatrix[3][4] = true;
		g.adjmatrix[3][5] = true;
		g.adjmatrix[4][5] = true;
		bfs(g,0);
	}
}
