package graphs;

public class graph {
		boolean[][] adjmatrix;
		int vertexcount;
		boolean[] visited;
		public graph(int v){
			adjmatrix = new boolean[v][v];
			vertexcount = v;
			visited = new boolean[v];
		}
}
