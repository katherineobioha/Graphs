//package Graphs;

import java.util.ArrayList;

public class GraphTester {

 public static Graph getTestGraphMST1() {
		 Graph  myGraph = (Graph)(new GraphAL (10));
		 myGraph.addVertex("Andrea");
		 myGraph.addVertex("Basilio");
		 myGraph.addVertex("Chris");
		 myGraph.addVertex("David");
		 myGraph.addVertex("Eleni");
		 myGraph.addVertex("Frank");

		 myGraph.addBidirectionalEdge("Andrea", "David",11.0);
		 myGraph.addBidirectionalEdge("Basilio", "Andrea",7.0);
		 myGraph.addBidirectionalEdge("Basilio", "Chris",3.0);
		 myGraph.addBidirectionalEdge("Basilio", "Eleni",15.0);
		 myGraph.addBidirectionalEdge("Basilio", "Frank",10.0);
		 myGraph.addBidirectionalEdge("Chris", "Frank",7.0);
		 myGraph.addBidirectionalEdge("David", "Eleni",2.0);
		 myGraph.addBidirectionalEdge("David", "Frank",4.0);
		 myGraph.addBidirectionalEdge("Eleni", "Frank",2.0);
		 return myGraph;
	}


	



	 public static Graph getTestGraph1() {
			 Graph  myGraph = (new GraphAL(10));
			 myGraph.addVertex("Andrea");
			 myGraph.addVertex("Basilio");
			 myGraph.addVertex("Chris");
			 myGraph.addVertex("David");
			 myGraph.addVertex("Eleni");
			 myGraph.addVertex("Frank");

			myGraph.addEdge("Andrea", "David",1.0);
			myGraph.addEdge("Basilio", "Andrea",23.0);
			myGraph.addEdge("Basilio", "Chris",12.0);
			myGraph.addEdge("Basilio", "Eleni",12.0);
			myGraph.addEdge("Basilio", "Frank",12.0);
			myGraph.addEdge("Chris", "Frank",12.0);
			myGraph.addEdge("David", "Eleni",12.0);
			myGraph.addEdge("Eleni", "Andrea",12.0);
			myGraph.addEdge("Eleni", "Frank",12.0);
			 return myGraph;
		}
	 public static Graph getTestGraph2() {
		 Graph  myGraph = (new GraphAM(10));
		 myGraph.addVertex("Andrea");
		 myGraph.addVertex("Basilio");
		 myGraph.addVertex("Chris");
		 myGraph.addVertex("David");
		 myGraph.addVertex("Eleni");
		 myGraph.addVertex("Frank");

		myGraph.addEdge("Andrea", "David",1.0);
		myGraph.addEdge("Basilio", "Andrea",23.0);
		myGraph.addEdge("Basilio", "Chris",12.0);
		myGraph.addEdge("Basilio", "Eleni",12.0);
		myGraph.addEdge("Basilio", "Frank",12.0);
		myGraph.addEdge("Chris", "Frank",12.0);
		myGraph.addEdge("David", "Eleni",12.0);
		myGraph.addEdge("Eleni", "Andrea",12.0);
		myGraph.addEdge("Eleni", "Frank",12.0);
		 return myGraph;
	}


	public static void testCreateGraph1() {
		  Graph  myGraph = getTestGraph1();   // Get a graph, implemented as an Ajd List
		  System.out.println("This is the AL graph implementation");
		  myGraph.print();

     //
		 // Calling DFS operator
		 //
		 System.out.println("This is the DFS traversal of the Graph");
		 GraphSearchOperator operatorDFS = new DFSearch();
		 ArrayList<Vertex> walkedPath =  operatorDFS.traverse((GraphAL) myGraph);
	   for (Vertex vx : walkedPath) {
			  System.out.print(vx.name + "->");
		 }
		 System.out.println("End of DFS traversal");

		//
		// Calling BFS operator
		//

		System.out.println("This is the BFS traversal of the Graph");
		GraphSearchOperator operatorBFS = new BFSearch();
		Queue<Vertex> walkedPathBFS =  operatorBFS.traverse1((GraphAL) myGraph);
		for (Vertex vx : walkedPathBFS)
		{
			System.out.print(vx.name + "->");
		}
		System.out.println("End of BFS traversal");


	 }
	


	



public static void testMST1() {

        Graph  myGraph =  getTestGraphMST1();
				System.out.println("This is the AL bidirectional graph implementation");
				myGraph.print();
				System.out.println("Prim MST");
  			GraphMstPrimOperator operatorMST = new GraphMstPrimOperator();
  			Graph mstPrim = operatorMST.getMSTree(myGraph);
  			mstPrim.print();
				//System.out.println("Kruskal MST");
				//GraphMstKruskalOperator operatorMST1 = new GraphMstKruskalOperator();
  			//Graph mstKruskal = operatorMST1.getMSTree(myGraph);
  			//mstKruskal.print();
}





	public static void main(String[] args) {
		testCreateGraph1();
		//testCreateGraph2();
		testMST1();
		//testMST2();  
	}






	
}
