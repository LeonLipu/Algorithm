package sunJuly16;

/**
 * Created by brahmanandakar on 16/07/17.
 */
public class Tree {

    class Node {
        int data;
        Node right ;
        Node left ;

        public Node(int data, Node right, Node left) {
            this.data = data;
            this.right = right;
            this.left = left;
        }

        public Node(int data) {

            this.data = data;
        }
    }
    Node node ;

    public Node getNode() {
        return node;
    }


    public void createTree(){



        Node n6=new Node (6);
        Node n5=new Node (5);
        Node n4=new Node (4);
        Node n3=new Node (3);
        Node n2=new Node (2,n5,n6);
        Node n1=new Node (1,n3,n4);
        Node n0=new Node (0,n1,n2);


        node =n0;


    }

    public void traverse(Node n)
    {
        if(n==null)
            return;

        System.out.println(n.data);
        traverse(n.left);
        traverse(n.right);
    }

    public static void main(String[] args) {


        Tree tree=new Tree();
        tree.createTree();
        tree.traverse(tree.getNode());
    }

}
