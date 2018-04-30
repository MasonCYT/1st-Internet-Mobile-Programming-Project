package com.ssaurel.djikstra;

public class Main {
	
	public static void main(String[] args) {
	    Edge[] edges = {
	      new Edge(1, 2, 1), 
	      new Edge(2, 3, 4), 
	      new Edge(3, 5, 7),
	      new Edge(2, 4, 3),	      
	      new Edge(4, 5, 5),
	      
	      new Edge(1, 4, 3),
	      new Edge(1, 5, 1),
	      new Edge(2, 4, 1),
	      new Edge(3, 5, 4),
	      new Edge(4, 5, 2), 
	      new Edge(4, 6, 7), 
	      new Edge(4, 7, 2),
	      new Edge(5, 6, 4), 
	      new Edge(6, 7, 5)
	    };
	    
	    Graph g = new Graph(edges);
	    g.calculateShortestDistance();
	    
	    g.printResult(); // let's try it !
	  }
}