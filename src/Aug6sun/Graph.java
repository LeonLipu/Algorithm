package Aug6sun;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brahmanandakar on 06/08/17.
 */
public class Graph {
    class Node{
        int id ;
        Node next;

        public Node(int id) {
            this.id = id;
        }
    }//declaration of node

    List<Node> nodelist;

    public Graph() {
        nodelist=new ArrayList<>();
    }

    public void addNode(int id ){
        nodelist.add(new Node(id));
    }
    public Node getNodeById(int id ){
        for (Node node : nodelist) {
            if (node.id==id) {
                return node;
            }
        }
        return null;
    }
    public void addEdge(int sid,int did ){
        Node snode=getNodeById(sid);
        Node dnode=new Node(did);
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
        addNode(6);

        addEdge(0,1);
        addEdge(0,2);
        addEdge(2,3);
        addEdge(2,6);
        addEdge(3,6);
        addEdge(3,5);

    }

    public void printGraph(){
        for (Node node : nodelist) {
            while(node!=null){
                System.out.print(node.id+"->");
                node=node.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.createGraph();
        graph.printGraph();
    }



}
