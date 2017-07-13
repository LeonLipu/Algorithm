package thujuly13;

/**
 * Created by brkar on 7/13/2017.
 */
public class Tree {
    private class Node{
        int data;
        Node left;
        Node right ;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Node node ;
    public void createTree(){
            Node  node6= new Node (6);
            Node  node5= new Node (5);
            Node  node4= new Node (4);
            Node  node3= new Node (3);
            Node  node2= new Node (2,node5,node6);
            Node  node1= new Node (1,node3,node4);
            Node  node0= new Node (0,node1,node2);

           this.node=node0;

    }


    public Node getNode() {
        return node;
    }

    public  void traverseTree(Node node ){

        if (node==null)
            return;
           System.out.println(node.data);
            traverseTree(node.left);
            traverseTree(node.right);


    }

    public static void main(String[] args) {
        Tree object=new Tree();
        object.createTree();
        object.traverseTree(object.getNode());
    }








}
