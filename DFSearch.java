//package stjohns_javarefresher;

import java.util.*;

public class DFSearch implements GraphSearchOperator {
	
	
	
    // recursive dfs
    private void dfs(GraphAL g, int vIdx, boolean[] visited, ArrayList traversedVertex) {
        visited[vIdx] = true;
        System.out.println("visiting " + g.adjLists[vIdx].name);
        traversedVertex.add(g.adjLists[vIdx]);
        for (AdjacentNode curr=g.adjLists[vIdx].adjList; curr != null; curr=curr.next ) {
            if (!visited[curr.vertexNum]) {
                System.out.println("\n" + g.adjLists[vIdx].name + "--" + g.adjLists[curr.vertexNum].name);
                dfs(g, curr.vertexNum, visited, traversedVertex);
            }
        }
    }
     //read here then go up
    public void dfs(GraphAL g, ArrayList traversedVertex) {
        boolean[] visited = new boolean[g.currentNumberVertices];
        for (int vIdx=0; vIdx < visited.length; vIdx++) {
            if (!visited[vIdx]) {
                System.out.println("\nSTARTING AT " + g.adjLists[vIdx].name);
                dfs(g,vIdx, visited,traversedVertex);
            }
        }
    }
     
	
	@Override
	public ArrayList<Vertex> traverse(GraphAL g) {
		ArrayList<Vertex> traversedOrder = new ArrayList<Vertex>();
		dfs(g,traversedOrder);
		return traversedOrder;
	}
	@Override
	public Queue<Vertex> traverse1(GraphAL g) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
