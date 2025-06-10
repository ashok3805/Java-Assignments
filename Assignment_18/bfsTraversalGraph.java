package Assignment_18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfsTraversalGraph {
	static List<Integer> bfsTraversal(int[][] adj,int n){
		boolean[] visited = new boolean[n];
		List<Integer> result = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		visited[0] = true;
		q.offer(0);
		while(!q.isEmpty()) {
			int curr = q.poll();
			result.add(curr);
			for(int num : adj[curr]) {
				if(!visited[num]) {
					visited[num]=true;
					q.offer(num);
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] adj = {{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};
		int n = adj.length;
		System.out.print(bfsTraversal(adj,n));

	}

}
