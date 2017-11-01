
import java.util.ArrayList;

// use this class like dataset in class exc
public abstract class Graph {

	public Graph(){};
	public Graph(int maxSize) {};
	
	public void print() {};
	abstract public void addVertex(String name);
	abstract public void addEdge(String snodename, String enodename);	
	abstract public void addEdge(String snodename, String enodename, double weight);
	 public void addBidirectionalEdge(String snodename, String enodname, double weight)
	{
		addEdge(snodename,enodname,weight);
		addEdge(enodname,snodename,weight);
	}

	abstract public ArrayList<Vertex> getAdjacentVertices(String parentVertex);
	abstract public ArrayList<Vertex> getAdjacentVertices(int vIdx);
	
	abstract public Vertex getVertex(int vIdx);
	abstract public Vertex getVertex(String vertexName);
	abstract public Vertex getedges(String name);
	
	abstract public int findVertexIndex(String name);
	abstract public int getNumberOfVertices();
	
	abstract public double getWeight(String fromVertexName, String toVertexName);
	abstract public double getWeight(int fromVertexIndex, int toVertexIndex);
	
}
