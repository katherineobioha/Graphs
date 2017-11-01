

import java.util.ArrayList;

import java.util.Collection;







public class GraphMstPrimOperator implements GraphMSTOperators {
 

	// Implement the PRIM algorithm, return a graph that represents
  // the MST of graph g
	private Graph primMSTAlgorithm(Graph g) {
		int V1dx =0;
		int maxSize = 5;
		Graph tree = (Graph)new GraphAL();
		boolean[]s = new boolean[g.getNumberOfVertices()];
		Heap p = new Heap(g.getNumberOfVertices());
		s[V1dx]=false;
		AdjacentNode n = null;
		
		for(int i=0;i<g.getNumberOfVertices();i++)
		{
			tree.addVertex(g.getVertex(i).name);
			
		}
		
			for(int i=0;i<g.getNumberOfVertices();i++)
			{
				Vertex d = g.getVertex(i);
				s[d.VertexNum]=true;
				ArrayList<Vertex> c = g.getAdjacentVertices(d.name);
				for(Vertex w : c)
				{
					p.add(w);
				}
				Vertex e = p.remove();
				while (s[d.VertexNum]==true)
				{
					if(p.isEmpty()==true)
					{
						break;
					}
					else 
					{
						p.remove();
					}
				}
				//s[d.VertexNum]=true;
				tree.addBidirectionalEdge(e.name, d.name, g.getWeight(d.name, e.name));
				
				
			}		
			
		
		return tree;
		}
	


	public Graph getMSTree(Graph g) {

		return primMSTAlgorithm(g) ;

	}


	


}
