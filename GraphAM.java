import java.util.ArrayList;

public class GraphAM extends Graph{

	
	    public Double[] costs;
	    public int[][] adjacencyMatrix;
	    public int size; // number of vertex in the graph

	    public GraphAM(int size) {
	        this.size = size;
	        costs = new Double[size]; //Initialized with all 0s
	        adjacencyMatrix = new int[size][size];//Initialized with all 0s
	    }

	    public void addVertex(String name) {
			// TODO Auto-generated method stub
			 name = name;

		}

	    public void addEdge(String sourceName, String destinationName, double weight) {
	        int sourceIndex = findVertexIndex(sourceName);
	        int destinationIndex = findVertexIndex(destinationName);
	        adjacencyMatrix[sourceIndex][destinationIndex] = (int) weight;
	        
	    }
	    public int findVertexIndex(String name) {
			 for (int i=0; i<size; i++) {
			   if (name.equals(name)) {
				  return i;
			   	}
			  }
			  return -1;
			}
	    
	    
	    
	    public void print(){
	        for(int i = 0 ; i < size; i++){
	            for(int j = 0 ; j < size ; j++){
	                if(adjacencyMatrix[i][j] != 0){
	                    System.out.println("name:"+(i+1)+",cost:"+costs[i]+" is connected with "+"name:"+(j+1)+",cost:"+costs[j] +" with edge-weight as "+adjacencyMatrix[i][j]);
	                }
	            }
	        }
	    }

		@Override
		public void addEdge(String snodename, String enodename) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ArrayList<Vertex> getAdjacentVertices(String parentVertex) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<Vertex> getAdjacentVertices(int vIdx) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Vertex getVertex(int vIdx) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Vertex getVertex(String vertexName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Vertex getedges(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getNumberOfVertices() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getWeight(String fromVertexName, String toVertexName) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getWeight(int fromVertexIndex, int toVertexIndex) {
			// TODO Auto-generated method stub
			return 0;
		}
	}




	    
