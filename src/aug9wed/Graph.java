package aug9wed;

import java.util.*;

/**
 * Created by brahmanandakar on 09/08/17.
 */
public class Graph {
    class Node {
        int id ;
        Node next;

        public Node(int id) {
            this.id = id;
        }
    }

    List<Node> nodelist;
    public Graph(){
        nodelist=new ArrayList<>();
    }

    public Node getNodebyId(int id ){
        for (Node node : nodelist) {
            if (node.id==id) {
                return node;
            }

        }
        return null;
    }

    public void addNode(int id ){
        nodelist.add(new Node(id));

    }
    public void addEdge(int sid,int did){
        Node snode=getNodebyId(sid);
        Node dnode=new Node(did);
        dnode.next=snode.next;
        snode.next=dnode;
    }

    public void printGraph(){
        for (Node node : nodelist) {

            while (node!=null) {
                System.out.print(node.id+"->");
                node=node.next;
            }
            System.out.print("null");
            System.out.println();

        }
    }


    public boolean bfs(int sid, int did){

        Queue<Node> queue=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();

        queue.add(getNodebyId(sid));
        visited.add(sid);

        while(!queue.isEmpty()){

            Node node=queue.remove();

            System.out.print(node.id+"--");
            if (node.id==did) {
                return true;
            }


            while(node!=null){

                if (!visited.contains(node.id)) {
                    queue.add(getNodebyId(node.id));
                    visited.add(node.id);
                }

                node=node.next;
            }


        }
        return false;




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
        addEdge(1,2);
        addEdge(2,3);
        addEdge(2,6);
        addEdge(3,6);
        addEdge(3,5);

    }

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.createGraph();
        graph.printGraph();
        graph.bfs(0,5);
    }

}
