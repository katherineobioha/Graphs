import java.util.ArrayList;

public class GraphAL extends Graph {

		public static final int  MAX_SIZE_DEFAULT = 100;

		VertexAL[] adjLists;		// The adjacency list
		int currentNumberVertices;
										// Number of vertices currenly in the graph



		public GraphAL()
		{
			this(MAX_SIZE_DEFAULT);   // Default max size
		}
		public GraphAL(int maxSize) {
			this.adjLists = new VertexAL[maxSize];
			this.currentNumberVertices = 0;
		}

		public void addVertex(String name) {
			this.adjLists[this.currentNumberVertices] =
							new VertexAL(name, null);
			this.currentNumberVertices++;
		}

		public void addEdge(String snodename, String enodename) {
			int indexStartNode = findVertexIndex(snodename);
			int indexEndNode = findVertexIndex(enodename);

			 if ((indexStartNode>=0) && (indexEndNode >= 0)) {
this.adjLists[indexStartNode].adjList =new AdjacentNode(indexEndNode,this.adjLists[indexStartNode].adjList,1);
			  }
		}

		public void addEdge(String snodename, String enodename, double weight) {

		  int v1idx = findVertexIndex(snodename);
		  int v2idx = findVertexIndex(enodename);
		  if ((v1idx>=0) && (v2idx >= 0)) {
			  this.adjLists[v1idx].adjList = new AdjacentNode(v2idx,this.adjLists[v1idx].adjList, weight);
		  }
		}


		/**
		 * This method returns the index of a vertex with name specified  by the input variable name
		 */
		public int findVertexIndex(String name) {
		 for (int i=0; i<this.currentNumberVertices; i++) {
		   if (this.adjLists[i].name.equals(name)) {
			  return i;
		   	}
		  }
		  return -1;
		}


		/**
		 *
		 * This method returns an array list of all Vertices that are Adjacent the to the Vertex with id vIdx
		 *
		 */
//search nodes for idx
		public ArrayList<Vertex> getAdjacentVertices(int vIdx) 
		{
			ArrayList<Vertex> t = new ArrayList<Vertex>();
			for (AdjacentNode curr= this.adjLists[vIdx].adjList;curr!=null;curr=curr.next)
			{
			 t.add(curr.name);
			}
			return t;
			    			
		 }
			
	    

		/**
		 * This method returns a list of references to all adjacent Vertices of the Vertex
		 * whose name is specified by the parentVertex
		 */
		//convert string to index like findvertex method
	    public ArrayList<Vertex> getAdjacentVertices(String parentVertex) 
	    { 	
	    	int parent = findVertexIndex(parentVertex);
	    	ArrayList<Vertex>then = new ArrayList<>();
	    			
	    	for(int i=0; i< this.currentNumberVertices; i++)
	    	 {
	    			if(this.adjLists[i].name.equals(parent) )
	    			{
	    				then.add(this.adjLists[i]);
	    			}
	    			
			 }
	    	return then;
	    }

	    /**
	     * This method will return a reference to a Vertex with id vIdx
	     */

	    public Vertex getVertex(int vIdx) {
				// TODO : Add  your code here.
	    	Vertex v = new Vertex();
	    	return v;
	    }

	    /**
	     * This method return a reference to the Vertex with name specified by the input variable vertexName
	     *
	     */
	    public Vertex getVertex(String vertexName) {
				// TODO : Add  your code here.
               Vertex a = new Vertex();
	    	//String a;
               for(int i=0; i<=this.currentNumberVertices;i++)
               {
            	   if (this.adjLists[i].name.equals(vertexName)){
               
               		return a;
            	   }
               	}
              // return;
			return a;
			   }

	     public int getNumberOfVertices() {
	    	 
				 // TODO : Add  your code here.
          return currentNumberVertices;
 				    }
	    
	     public Vertex getedges(String name)
	     {	
	     int v1idx = findVertexIndex(name);
	    	 return this.adjLists[v1idx].adjList.name;
	     }

	    /**
	     *
	     * This method print a list of vertices along with its adjacent nodes.
	     *
	     */

		public void print() {
			   System.out.println();
			   for (int i =0; i < this.currentNumberVertices; i++){
			      System.out.print(this.adjLists[i].name);
			      for (AdjacentNode curr=this.adjLists[i].adjList; curr != null; curr = curr.next) {
			        System.out.print(" --> " + this.adjLists[curr.vertexNum].name + "(w:" + curr.weight + ")" );
			      }
			      System.out.println();
			   }
		  }
		@Override
		public double getWeight(String fromVertexName, String toVertexName) {
			// TODO : Add  your code here.
					return currentNumberVertices ;


				}
		@Override
		public double getWeight(int fromVertexIndex, int toVertexIndex) {
			// TODO : Add  your code here.
				return toVertexIndex;
		}

}



	class VertexAL extends Vertex{
		//String name;
		AdjacentNode adjList;
		public VertexAL(String name, AdjacentNode adjNext) {
			this.name = name;
			this.adjList = adjNext;
		}
	}  // End of the vertex class

	class AdjacentNode {
		public int vertexNum;  // id of a node
		public double weight;
		public AdjacentNode next;
		public Vertex name;

		public AdjacentNode(int vertexNum, AdjacentNode adjNext, double weight){
			this.vertexNum = vertexNum;
			this.weight = weight;
			this.next = adjNext;
		}
	}  // end of AdjacentNode class
