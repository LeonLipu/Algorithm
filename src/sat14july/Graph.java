package sat14july;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brahmanandakar on 15/07/17.
 */
public class Graph {

            class Node{

                int id ;
                Node next;
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

            public Graph(){
                nodelist=new ArrayList<>();
            }

            public void addNode(int  id ){

                nodelist.add(new Node(id));
            }

            //s-source t-target d-distance
            public void addEdge(int s,int t,int d){

                int i=0;
                for (i = 0; i < nodelist.size(); i++) {
                    if (nodelist.get(i).id==s)
                        break;
                }

                Node snode =nodelist.get(i);
                Node tnode =new Node(t,d);
                tnode.next=snode.next;
                snode.next=tnode;

            }


            public void traverse(){

                for (Node node : nodelist) {


                    while(node!=null){

                        System.out.print(" "+node.id+"("+node.dist+")->");
                        node=node.next;
                    }
                    System.out.print   ("NULL");
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

                Graph graph=new Graph();
                createGraph(graph);
                graph.traverse();

    }



}
