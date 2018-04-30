import java.util.Scanner;

public class Djikstra {
	public int adjacencyMatrix[][] = new int[5][5];
	public int[][] moveGraph(int source, int[][]adjacencyMatrix){
		int[][]graph=adjacencyMatrix;
		for(int i= 0;i<source;i++) {
			graph[i]=graph[i+1];
		}
		graph[0] = adjacencyMatrix[source];
		return graph;
	}
	public int[] djikstra(int source,int[][] adjacencyMatrix) {
		adjacencyMatrix = moveGraph(source, adjacencyMatrix);
		int v = adjacencyMatrix.length;
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		distance[0] = 0;
		for(int i = 1; i < v; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		int [] prev= new int  [v];
		for(int i = 0; i < v - 1; i++) {
			// to find vertex with min distance
			
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;
			
			// to explore neighbours
			for(int j = 0; j < v; j++) {
				if(adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
					int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
					if(newDist < distance[j]) {
						distance[j] = newDist;
						prev[j] = minVertex;
					}
					
				}
				
			}
			
		}
		
		return prev;
	}
	public int findNextHop(int destination, int []path) {
		int nexthop=destination;
		int temp=-1;
		while(temp!=0) {
			
			temp=path[nexthop];
			if(temp!=0) {
				nexthop=temp;
			}
		}
		return nexthop;
	}
	public int findMinVertex(int[] distance, boolean visited[]) {
		int minVertex =-1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i] && (minVertex ==-1||distance[i]<distance[minVertex])) {
				minVertex=i;
			}
			
		}
		return minVertex;
		
	}	
}
