package july21fri;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    class Node {
        int id ;
        Node next;

        public Node(int id) {
            this.id = id;
        }
    }

    List<Node> nodeList;
    public Graph(){

        nodeList=new ArrayList<>();
    }

    public void addNode(int id ){
        nodeList.add(new Node(id));
    }

    public Node getNodeById(int id ){
        for (Node node : nodeList) {
            if (node.id==id) {
                return node;
            }

        }
        return null;

    }


    public void addEdge(int sid, int did){


        Node snode=getNodeById(sid);
        Node dnode =new Node(did);
        dnode.next=snode.next;
        snode.next=dnode;
    }

    public void createGraph(){


        addNode(0);
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,2);
        addEdge(1,4);
        addEdge(3,5);
        addEdge(4,5);
    }


    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.createGraph();
        graph.printGraph();
    }
public void printGraph(){

    for (Node node : nodeList) {


        while(node!=null){
            System.out.print(node.id+"-->");
            node=node.next;
        }

        System.out.print("null");
        System.out.println();
    }

}
}
