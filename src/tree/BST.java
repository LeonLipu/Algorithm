package tree;

/**
 * Created by brkar on 7/12/2017.
 */
class node {

    node right ;
    node left ;
    int data;


    public node(node right, node left, int data) {
        this.right = right;
        this.left = left;
        this.data = data;
    }

    public node(int data) {
        this.data = data;
    }

    public node getRight() {
        return right;
    }

    public node getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }
}


public class BST {

    node n;


    public node createTree(){


        node n7=new node(7);
        node n6=new node (6);
        node n5=new node (5);
        node n4=new node (4);
        node n3=new node (n7,n6,3);
        node n2=new node (n4,n5,2);
        node n1=new node (n2,n3,1);

        this.n=n1;
        return this.n;
    }

    public node getTree(){
        return this.n;
    }

    public void setTree(node n){
        this.n=n;
    }

    public void traverseTree(node n){

        System.out.println(n.data);
        if(n.right!=null)
        traverseTree(n.getRight());


        if(n.left!=null)
            traverseTree(n.getLeft());
    }

    public static void main(String[] args) {

       BST object=new BST();
       object.createTree();
       node n=object.getTree();
       object.traverseTree(n);
    }




}
