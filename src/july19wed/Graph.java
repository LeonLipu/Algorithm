package july19wed;

import java.util.*;

/**
 * Created by brahmanandakar on 19/07/17.
 */
public class Graph {


    class Node {
        int id ;
        Node next;

        public Node(int id) {
            this.id = id;
        }
    }


    List<Node> nodeList;

    public void addNode(int id )
    {
        nodeList.add(new Node(id));
    }

    public Node getNodeByID(int id ){
        for (Node node : nodeList) {
            if (node.id==id) {
                return node;
            }
        }
        return null;
    }

    public Graph() {
        this.nodeList = new ArrayList<>();
    }

    public void addEdge(int sid, int did){

        Node snode=getNodeByID(sid);
        Node dNode=new Node(did);
        dNode.next=snode.next;
        snode.next=dNode;
    }


    public static void CreateGraph(Graph graph){



        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);

        graph.addEdge(0,1);
        graph.addEdge(0,2);


        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);

    }



    public boolean bfs(int sid,int did){

        Node sn=getNodeByID(sid);
        Queue<Node> q =new LinkedList<>();
        q.add(sn);
        Set<Integer> v=new HashSet<>();

        while (!q.isEmpty()){

            Node n=q.remove();

            System.out.println(n.id);

            if (n.id==did) {
                return true;
            }
            v.add(n.id);

            while (n != null) {
                if (!v.contains(n.id)) {
                    q.add(getNodeByID(n.id));
                    v.add(n.id);
                }
                n=n.next;
            }


        }

        return false;
    }

    public void traverse(){

        for (Node node : nodeList) {


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
        CreateGraph(graph);
        graph.traverse();
        graph.bfs(0,5);
    }






}
