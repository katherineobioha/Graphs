import java.util.ArrayList;

public class GraphMstKruskalOperator implements GraphMSTOperators {


  // Implement the KRUSKAL algorithm, return a graph that represents
  // the MST of graph g
  private Graph kruskalMSTAlgorithm(Graph g) {
	 
	  Heap p = new Heap(g.getNumberOfVertices())
	  for(int i=0;i<g.getNumberOfVertices();i++)
	  {
		  p.add(g.getAdjacentVertices(i));
	  }
	  int n=1;
	  while(n<g.getNumberOfVertices())
	  {
		  Vertex c = p.remove();
		  
	  }
	 
	  
	  
	  
	  
	  
	  
	  
	  
  }
  private void union(Vertex u, Vertex v) {
	// TODO Auto-generated method stub
	  if(u.VertexNum ==v.VertexNum)
	  {
		  v.myvertices=u;
		  u.VertexNum++;
	  }
	  else if(u.VertexNum<v.VertexNum){
		  v.myvertices=u;
	  }
	  else{
		  u.myvertices=v;
	  }
	
}

private Vertex find(Vertex vertexNum) {
	// TODO Auto-generated method stub
	  if(vertexNum.myvertices != vertexNum){
		  vertexNum.myvertices=find(vertexNum.myvertices);
	  }
	return vertexNum.myvertices;
}

@Override
  public Graph getMSTree(Graph g) {
    return kruskalMSTAlgorithm(g) ;

  }
}
