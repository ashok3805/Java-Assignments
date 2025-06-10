package Assignment_18;

import java.util.ArrayList;
import java.util.List;

public class dfsTraversalGraph {
	static void dfs(int[][] adj,boolean[] visited,List<Integer> result,int node) {
		visited[node] = true;
		result.add(node);
		for(int num : adj[node]) {
			if(!visited[num]) {
				dfs(adj,visited,result,num);
			}
		}
	}
	
	static List<Integer> dfsTraversal(int[][] adj,int n){
		boolean[] visited = new boolean[n];
		List<Integer> result = new ArrayList<>();
		dfs(adj,visited,result,0);
		return result;
	}
	public static void main(String[] args) {
		int[][] adj = {{1,2},{0,2},{0,1,3,4},{2},{2}};
		int n = adj.length;
		System.out.print(dfsTraversal(adj,n));
	}
}
