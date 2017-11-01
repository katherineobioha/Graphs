import java.util.ArrayList;

public class Vertex {
	    int VertexNum;
		public String name;
		Vertex myvertices;
		public static final int NEW = 0;
		public static final int VISITED = 2;
        public int state = NEW;
        public double cost = Double.MAX_VALUE;
        public char data;
        public AdjacentNode adj;
        public int parentIndex = -1;

        public int compareTo(Vertex other) {
            if (cost < other.cost) {
                return -1;
            }
            if (cost > other.cost) {
                return 1;
            }
            return 0;
        }

        public void addAdjacentVertex(AdjacentNode adj) {
            this.adj = adj;
        }

        public void updateCost(int newCost, int parentIndex) {
            this.cost = newCost;
            this.parentIndex = parentIndex;
        }
    

   
}

