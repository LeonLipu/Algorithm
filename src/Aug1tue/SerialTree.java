package Aug1tue;

/**
 * Created by brahmanandakar on 01/08/17.
 */
public class SerialTree {

    class Node {
        int id ;
        Node left;
        Node right ;

        public Node(int id, Node left, Node right) {
            this.id = id;
            this.left = left;
            this.right = right;
        }

        public Node(int id) {

            this.id = id;
        }
    }//declaration of node


    Node node;
    public void createTree(){

        Node n9=new Node(9);
        Node n8=new Node(8);
        Node n7=new Node(7);
        Node n6=new Node(6);
        Node n5=new Node(5);
        Node n4=new Node(4);
        Node n3=new Node(3,n7,n8);
        Node n2=new Node(2,n5,n6);
        Node n1=new Node(1,n3,n4);
        Node n0=new Node(0,n1,n2);
        node=n0;

    }

    public Node getNode() {
        return node;
    }

    public void travese(Node node ){

        if (node==null) {
            return;
        }
        System.out.println(node.id);
        travese(node.left);
        travese(node.right);
    }

    public static void main(String[] args) {
        SerialTree tree=new SerialTree();
        tree.createTree();
        tree.travese(tree.getNode());
        Integer [] arr={0,1,3,7,8,4,2,5,6};

        doInorder(arr);







    }

    private static Node  doInorder(Integer[] arr) {


        

        return null;
    }

}
