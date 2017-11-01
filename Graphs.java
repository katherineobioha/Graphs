import java.util.ArrayList;

public interface Graphs {
	
	public void print();
	// This method should print the underlying graph structure. An example implementation
	// is provided for you for the Adjacency List implementation. Follow the same output
	// format for the Adjacency Matrix implementation.
	abstract public void addVertex(String name);
	// This method should add a new vertex to the graph and assign it the name �Name�. An
	// example for the Adjacency List Implementation is provided for you.
	abstract public void addEdge(String snodename, String enodename);
	// This method adds an edge to the graph connecting vertices snodename to enodename.
	// An example implementation is provided for you for the Adjacency List
	//Implementation.
	abstract public void addEdge(String snodename, String enodename, double weight);
	// This method adds an edge to the graph connecting vertices snodename to enodename.
	// Moreover, it assigns a weight this this edge. An example implementation is
	//provided for you for the Adjacency List Implementation.
	abstract public ArrayList<Vertex> getAdjacentVertices(String parentVertex);
	// This method should return an ArrayList of Vertex objects. Each Vertex in the list
	// represents an Adjacent Vertex to the Vertex with the name specified by the
	//variable parentVertex.
	abstract public ArrayList<Vertex> getAdjacentVertices(int vIdx);
	// This method should return an ArrayList of Vertex objects. Each Vertex in the list
	// represents an Adjacent Vertex to the Vertex with index specified by the variable
	// vIdx.
	abstract public Vertex getVertex(int vIdx);
	// This method returns a reference to the vertex with index specified by the variable
	// vIdx.
	abstract public Vertex getVertex(String vertexName);
	// This method returns a reference to the vertex whose name is specified by the
	//variable vertexName.
	abstract public int findVertexIndex(String name);
	// This method returns the index of a Vertex in the graph whose name is specified by
	// the variable name.
	abstract public int getNumberOfVertices();
	// This method should return the number of Vertices in the graph.
	abstract public double getWeight(String fromVertexName, String toVertexName);
	// This method should return the weight associated with the Edge connecting vertex
	//named fromVertexName and vertex toVertexName.
	abstract public double getWeight(int fromVertexIndex, int toVertexIndex);
	// This method should return the weight associated with the Edge connecting vertex
	//with index fromVertexIndex and vertex toVertexindex.
	
}
