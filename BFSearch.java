import java.lang.reflect.Array;
import java.util.*;


public class BFSearch implements GraphSearchOperator{
	
	private void bfs(GraphAL g, int vIdx, boolean[] visited, Queue traversedVertex) {
        visited[vIdx] = true;
        System.out.println("visiting " + g.adjLists[vIdx].name);
        traversedVertex.enqueue(g.adjLists[vIdx]);
        while(!traversedVertex.isEmpty())
        {
        	  //Vertex b  =  (Vertex) traversedVertex.dequeue();
        	for(AdjacentNode curr=g.adjLists[vIdx].adjList; curr !=null; curr=curr.next)
        	{
        		if(!visited[curr.vertexNum]){
        			System.out.println("\n" + g.adjLists[vIdx].name + "--" + g.adjLists[curr.vertexNum].name);
        			visited[curr.vertexNum]= true;
        			traversedVertex.enqueue(g.adjLists[curr.vertexNum]);
        		}
        		
        	}
        traversedVertex.dequeue();
         
        	 
        }
        
       
       // bfs(g, curr.VertexNum,visited, traversedVertex);
    }
			
			
	public void bfs(GraphAL g, Queue traversedVertex) {
        boolean[] visited = new boolean[g.currentNumberVertices];
        for (int vIdx=0; vIdx < visited.length; vIdx++) {
            if (!visited[vIdx]) {
                System.out.println("\nSTARTING AT " + g.adjLists[vIdx].name);
                bfs(g,vIdx, visited,traversedVertex);
            }
        }
    }	

	@Override
	public Queue<Vertex> traverse1(GraphAL g) {
		// TODO Auto-generated method stub
		Queue<Vertex>traversedOrder=new Queue<Vertex>();
		//ArrayList<Vertex> traversedOrder = new ArrayList<Vertex>();
		bfs(g,  traversedOrder);
		return traversedOrder;
		
	}


	@Override
	public ArrayList<Vertex> traverse(GraphAL g) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
