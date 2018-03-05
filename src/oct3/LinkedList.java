package oct3;

/**
 * Created by brahmanandakar on 04/10/17.
 */

public class LinkedList {


    private class Node {
        Node prev,next;
        int value;
        Node(int  value){
            this.value=value;
        }
        Node(Node prev, Node next){
            this.prev=prev;
            this.next=next;
        }

public Node(){

}

    }



    Node node=new Node();
    public void addElement(int value ){
        Node temp=new Node(value) ;
        node.next=temp;
       temp.prev=node;
    }

    public void deleteElement(int  value){


        while(node!=null){

            if(node.value==value){

                Node temp=node.next;
                temp.prev=node.prev;

                return;
            }
           node= node.prev;
        }
    }

    public boolean searchElement(int  value){


        while(node!=null){
            if( node.value==value)
            {
                return true;
            }
            node=node.prev;
        }
        return false;
    }

    public void reset(){
        while(node!=null)node=node.next;
    }


    public Node getNode(){
        return this.node;
    }
    public void traverse(Node node ){
        while(node!=null){
            System.out.print(node.value+"   --  ");
            node=node.prev;
        }
    }


    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addElement(3);
        list.addElement(5);
        list.addElement(7);

        System.out.println(list.getNode().value);
        list.addElement(9);
        list.addElement(12);
        list.addElement(33);
        list.addElement(4);

        System.out.println("list");

        System.out.println(list.getNode().value);
        list.reset();
        list.traverse(list.getNode());
        list.reset();
        list.deleteElement(7);
        list.reset();
        list.traverse(list.getNode());






    }



}
