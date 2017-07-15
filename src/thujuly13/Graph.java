package thujuly13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brkar on 7/13/2017.
 */
public class Graph {



    class GraphNode{

        int data;
        GraphNode next;
        int dist;

        public GraphNode(int data) {
            this.data = data;
        }

        public GraphNode(int data, int dist) {
            this.data = data;
            this.dist = dist;
        }
    }


    List<GraphNode> nodeList ;

    public Graph() {
        nodeList = new ArrayList<>();
    }

    private void addNode(GraphNode node ){
        nodeList.add(node);
    }
    private void addEdge(){

    }






}
