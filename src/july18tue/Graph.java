package july18tue;

import java.util.*;

/**
 * Created by brahmanandakar on 18/07/17.
 */
public class Graph {

    class Node{
        int id;
        Node next;

        public Node(int data) {
            this.id = data;
        }
    }

    List<Node> nodeList;

    public Graph() {
        nodeList=new ArrayList<>();
    }

    public void addNode(int id )
    {
        nodeList.add(new Node(id));

    }

    public Node getNode(int id ){

        for (Node node : nodeList) {
            if (node.id==id) {
                return node;
            }
        }
        return null;
    }


    public boolean bfs(int sid,int did){

        Queue<Node> queue=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();

        queue.add(getNode(sid));


        while (!queue.isEmpty()) {

            Node node=queue.remove();
            visited.add(node.id);


            System.out.print(node.id+"->");

            if (node.id==did){

                System.out.println();
                return true;

            }


            while (node != null) {

                if (!visited.contains(node.id)) {
                    queue.add(getNode(node.id));
                    visited.add(node.id);

                }

                node=node.next;
            }

        }

        return false;




    }


    public void addEdge(int sid ,int did ){

        Node snode=getNode(sid);
        Node dnode=new Node(did);
        dnode.next=snode.next;
        snode.next=dnode;

    }


    public void createGraph(Graph graph){

        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);


        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);

    }

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.createGraph(graph);
        System.out.println(graph.bfs(0, 5));
    }


}
