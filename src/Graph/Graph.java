package Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brahmanandakar on 12/07/17.
 */


public class Graph {


    private class GraphNode {
        int id;
        GraphNode next;
        int prentDist;

        public GraphNode(int id) {
            this.id = id;
        }

        public GraphNode(int id, int prentDist) {
            this.id = id;
            this.prentDist = prentDist;
        }
    }

    List<GraphNode> nodelist;


    public Graph() {

        nodelist = new ArrayList<GraphNode>();
    }


    public void addNode(int id) {

        GraphNode node = new GraphNode(id);
        nodelist.add(node);

    }

    public void addEdge(int id, int id1, int dist) {
        int i = 0;

        for (i = 0; i < nodelist.size(); i++) {


            if (nodelist.get(i).id == id)
                break;

        }

        if (i == nodelist.size())
            return;
        GraphNode node = nodelist.get(i);
        GraphNode node1 = new GraphNode(id1, dist);
        node1.next=node.next;
        node.next=node1;
    }


    public GraphNode findNode(int id ){

        for (int i = 0; i <nodelist.size() ; i++) {

            if(nodelist.get(i).id==id)
                return nodelist.get(i);

        }
        return null;

    }


    public void printGraph(){

        for (int i = 0; i <nodelist.size() ; i++) {


            GraphNode node=nodelist.get(i);


            while(node!=null){

                System.out.println(node.id+"("+node.prentDist+")->");
                node=node.next;


            }
            System.out.println("Null");
            System.out.println();

        }

    }


    public static void createGraph(Graph graph){


        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);


        graph.addEdge(0,1,2);
        graph.addEdge(0,2,4);

        graph.addEdge(1,2,4);
        graph.addEdge(1,3,5);
        graph.addEdge(1,4,3);


        graph.addEdge(3,5,2);
        graph.addEdge(4,5,1);




    }

    public static void main(String[] args) {

        Graph graph =new Graph();
        createGraph(graph);
        graph.printGraph();

    }


}
