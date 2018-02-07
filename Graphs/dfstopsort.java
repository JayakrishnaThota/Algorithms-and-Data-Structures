package graphs;
import java.util.*;

public class dfstopsort {
public class graph {
		int vertexcount;
		ArrayList<Integer>[] adjlist;
		public graph(int v){
			vertexcount = v;
			adjlist = new ArrayList[v];
			for(int i=0;i<v;i++)
				adjlist[i] = new ArrayList();
		}
		public void addEdge(int s, int d){
			adjlist[s].add(d);
		}
}

	public void helper(graph g, boolean[] visited, Stack<Integer> stack, int s){
		visited[s] = true;
		ArrayList<Integer>[] adjlist = g.adjlist;
		Iterator iter = adjlist[s].listIterator();
		while(iter.hasNext()){
			Integer v = (Integer) iter.next();
			if(!visited[v])
			helper(g, visited, stack, v);
		}
		stack.push(s);
	}
	public void topologicalsort(graph g){
		int v = g.vertexcount;
		boolean[] visited = new boolean[v];
		Stack<Integer> stack = new Stack();
		for(int i=0;i<v;i++){
			if(!visited[i])
				helper(g, visited, stack, i);
		}
		printorder(stack);
	}
	public void printorder(Stack<Integer> stack){
		while(!stack.isEmpty()){
			int v = stack.pop();
			if(!stack.isEmpty())
				System.out.print(v+"->");
			else
				System.out.print(v);
		}

	}
	public static void main(String[] args){
		dfstopsort d = new dfstopsort();
		graph g = new graph(6);
		g.addEdge(5,0);
		g.addEdge(4,0);
		g.addEdge(4,1);
		g.addEdge(3,1);
		g.addEdge(2,3);
		g.addEdge(5,2);
		d.topologicalsort(g);
	}
}
