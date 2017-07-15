package sat14july;

/**
 * Created by brahmanandakar on 15/07/17.
 */
public class Tree {
    class Node{
        int data;
        Node left;
        Node right ;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node(int data) {

            this.data = data;
        }
    }


    Node node;
    public void createTree(){


   Node n7  =new Node(7);
   Node n6  =new Node(6);
   Node n5  =new Node(5);
   Node n4  =new Node(4);
   Node n3  =new Node(3,n6,n7);
   Node n2  =new Node(2,n4,n5);
   Node n1  =new Node(1,n2,n3);

   node=n1;


    }

    public Node getNode() {
        return node;
    }

    public void traverse(Node node ){

        if(node==null)
            return;
        System.out.println(node.data);
        traverse(node.left);
        traverse(node.right);

    }

    public static void main(String[] args) {

        Tree tr=new Tree();
        tr.createTree();
        tr.traverse(tr.getNode());

    }






}
