package mon17july;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brkar on 7/17/2017.
 */
public class diskastra {

    class Node {

        int id;
        Node next;
        int  dist;

        public Node(int id, int  dist) {
            this.id = id;
            this.dist = dist;
        }

        public Node(int id) {

            this.id = id;
        }
    } //end of class


    List<Node> nodelist;

    public diskastra() {
        this.nodelist = new ArrayList<>();
    }

    public void addNode(int id) {
        nodelist.add(new Node(id));
    }

    public Node getNode(int nid) {


        for (Node node : nodelist) {
            if (node.id == nid) {
                return node;
            }

        }
        return null;
    }

    public void addEdge(int sid, int did, int dist) {

              Node snode=getNode(sid);
              Node dnode=new Node(did,dist);

              dnode.next=snode.next;
              snode.next=dnode;
    }


}
