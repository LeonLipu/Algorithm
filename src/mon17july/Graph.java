package mon17july;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by brahmanandakar on 17/07/17.
 */
public class Graph {

    class Node{
        int id ;
        Node next;

        public Node(int id) {
            this.id = id;
        }

    }

    List<Node>  nodelist;

    public Graph() {
        this.nodelist =new ArrayList<>();
    }

    public void addNode (int id ){

        nodelist.add(new Node(id));

    }

    public Node getNodebyId(int id )
    {
        for (Node node : nodelist) {

            if (node.id==id) {
                return node ;
            }

        }
        return null;
    }

    public void  addEdge(int sid,int did){

        Node snode=getNodebyId(sid);
        Node Dnode=new Node(did);
        Dnode.next=snode.next;
        snode.next=Dnode;
    }

    public void CreateGraph(Graph graph){
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(1,3);
        graph.addEdge(3,5);
        graph.addEdge(4,5);

    }

    public void traverse(){

        for (Node node : nodelist) {

            while(node!=null)
            {
                System.out.print(node.id+"->");
                node=node.next;
            }
            System.out.print("null");
            System.out.println();
        }

    }

    public boolean bfs(int sid,int did){


        LinkedList<Node> queue=new LinkedList<>();
        List<Integer> visited=new ArrayList<>();

        Node snode=getNodebyId(sid);
        if (snode==null) {
            return false;
        }
        System.out.println("squence of element bfs ");

        queue.add(snode);
        visited.add(snode.id);


        while (!queue.isEmpty()){

            Node node =queue.remove();


            System.out.print(node.id+"->");
            if (node.id==did) {
                return true;
            }

            while (node != null) {

                if (!visited.contains(node.id)) {
                    visited.add(node.id);
                    queue.add(getNodebyId(node.id));
                }
                node=node.next;

            }


        }



        return false;



    }

    public boolean dfs(int sid,int did){


        Stack<Node> stack=new Stack<>();
        List<Integer> visited=new ArrayList<>();

        Node snode=getNodebyId(sid);
        if (snode==null) {
            return false;
        }
        System.out.println("squence of dfs ");
        stack.add(snode);
        visited.add(snode.id);

        while (!stack.isEmpty()){

            Node node =stack.pop();


            System.out.print(node.id+"->");
            if (node.id==did) {
                return true;
            }

            while (node != null) {

                if (!visited.contains(node.id)) {
                    visited.add(node.id);
                    stack.push(getNodebyId(node.id));
                    stack.push(getNodebyId(node.id));
                }
                node=node.next;

            }


        }



        return false;



    }

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.CreateGraph(graph);
        graph.traverse();
        System.out.println(" bfs "+graph.bfs(0,5));
        System.out.println(" dfs "+graph.dfs(0,5));
    }

}
