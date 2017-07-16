package sunJuly16;

import java.util.*;

/**
 * Created by brahmanandakar on 16/07/17.
 */
public class Graph {

    class Node {
        int id;
        Node next ;
        int dist;

        public Node(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }

        public Node(int id) {

            this.id = id;
        }
    }

    List<Node> nodelist;

    public Graph() {
        this.nodelist = new ArrayList<>();
    }

    public void addNode (int id){

        Node node=new Node(id);
        nodelist.add(node);

    }


    public void addEdge(int id1,int id2 ,int dist){



        int i=0;
        for ( i = 0; i < nodelist.size(); i++) {


            if(nodelist.get(i).id==id1)
                break;

        }

        Node node =nodelist.get(i);

        Node node2=new Node(id2,dist);

        node2.next=node.next;
        node.next=node2;

    }

    public void traverse(){


        for (Node node : nodelist) {

            while(node!=null)
            {
                System.out.print(node.id+"("+node.dist+")->");
                node=node.next;
            }

            System.out.print("null");
            System.out.println();


        }
    }


    public void  CreateGraph(Graph graph){


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

    public Node getFirstNode(int id){

        for (int i = 0; i < nodelist.size(); i++) {
            if(nodelist.get(i).id==id)
                return nodelist.get(i);
        }
        return null;
    }


 public boolean breathFirstSearch(int source,int dest){


        if (nodelist.isEmpty())
            return false;

     LinkedList<Node> queue=new LinkedList<>();


     //find source node

     Node sourceNode=null;
     for (Node node : nodelist) {

         if (node.id==source)
         {
             sourceNode=node;
             break;
         }

     }

     if(sourceNode==null)
         return false;


     queue.add(sourceNode);

     List<Integer> visited=new ArrayList<>();
     visited.add(sourceNode.id);

     while(!queue.isEmpty()){

         Node node=queue.remove();

         System.out.println(node.id);
         int currentId=node.id;

         if (currentId==dest)
             return true;

         while (node!=null){

             if(!visited.contains(node.id)){

                // System.out.println("insersted "+node.id);
                 queue.add(getFirstNode(node.id));
                 visited.add(node.id);

             }

             node=node.next;
         }

     }



return  false;



 }










    public static void main(String[] args) {

        Graph graph=new Graph();
        graph.CreateGraph(graph);
        graph.traverse();
        int srcNodeId = 0, destNodeId = 5;

        System.out.println(graph.breathFirstSearch(srcNodeId,destNodeId));

    }



}
