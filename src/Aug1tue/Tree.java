package Aug1tue;

public class Tree {

    class Node {
        int id ;
        Node left ;
        Node right ;

        public Node(int id, Node left, Node right) {
            this.id = id;
            this.left = left;
            this.right = right;
        }

        public Node(int id) {

            this.id = id;
        }
    }// declaration fo node


    Node node ;

    public Node getNode() {
        return node;
    }

    public void createTree(){
        Node n7=new Node(7);
        Node n6=new Node(6);
        Node n5=new Node(5);
        Node n4=new Node(4);
        Node n3=new Node(3);
        Node n2=new Node(2,n5,n6);
        Node n1=new Node(1,n3,n4);
        Node n0=new Node(0,n1,n2);
        node=n0;
    }

    public void traverse(Node node){
        if (node==null) {
            return;
        };

        System.out.println(node.id);
        traverse(node.left);
        traverse(node.right);
    }

    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.createTree();
        tree.traverse(tree.getNode());
    }

}
