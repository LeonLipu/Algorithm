package july26web;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    class Node {
        int id ;
        Node next;

        public Node(int id) {
            this.id = id;
        }
    }// added node

    List<Node> nodelist;

    public Graph(){
        nodelist=new ArrayList<>();
    }
    public Node getNodeById(int id ){
        for (Node node : nodelist) {
            if (node.id==id) {
                return node;
            }

        }
        return null;
    }
}
