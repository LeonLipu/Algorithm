package july31mon;

import java.util.*;

/**
 * Created by brahmanandakar on 31/07/17.
 */
public class GraphD {
 protected    class GN{
        int id ;
        int pd;
        GN next;

        public GN(int id, int pd) {
            this.id = id;
            this.pd = pd;
        }

        public GN(int id) {

            this.id = id;
        }
    }//declaration of graph node

   protected class QN implements Comparable{
        int id ;
        int sd;

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }


        @Override
        public int compareTo(Object o) {
            QN qn=(QN)o;

            if (qn.sd>this.sd) {
                return 1;
            }
            if(qn.sd<this.sd)
                return -1;
            return 0;
        }
    }// declaration of queue node



    List<GN> nodelist;
    public GraphD(){
        nodelist=new ArrayList<>();
    }


    public GN getNodeById(int id ){
        for (GN gn : nodelist) {
            if (gn.id==id) {
                return gn;
            }

        }
        return null;
    }

    public void addNode(int id){
        nodelist.add(new GN(id));
    }
    public void addEdge(int sid,int did,int dist){
        GN snode=getNodeById(sid);
        GN dnode=new GN(did,dist);
        dnode.next=snode.next;
        snode.next=dnode;
    }
    public void printGraph(){
        for (GN node : nodelist) {

            while (node != null) {

                System.out.print(node.id+"("+node.pd+")->");
                node=node.next;

            }
            System.out.print("null");
            System.out.println();
        }
    }
    public void createGraph(){

        addNode(0);
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);

        addEdge(0,1,2);
        addEdge(0,2,1);
        addEdge(1,2,3);
        addEdge(2,3,5);
        addEdge(2,6,12);
        addEdge(3,5,6);
        addEdge(3,6,6);

    }

    public Integer[] getDistanceFromSingleSource(int source){

        //declarations
        Queue<QN> queue=new PriorityQueue<>();
        Set<Integer> visited=new HashSet<>();
        Integer [] distance= Arrays.stream(new Integer[nodelist.size()]).mapToInt(e->Integer.MAX_VALUE).boxed().toArray(Integer[]::new);

        //Inilization by first node
        queue.add(new QN(source,0));
        visited.add(source);
        distance[source]=0;

        //while loop
        while (!queue.isEmpty()){

            QN qn=queue.remove();
            GN gn=getNodeById(qn.id);
            GN nn=gn.next==null?null:gn.next;

            while(nn!=null){

                if (!visited.contains(nn.id)) {

                    int newdist=distance[gn.id]+nn.pd;
                    if(newdist<distance[nn.id]){
                        distance[nn.id]=newdist;
                        visited.add(nn.id);
                        updateQ(queue,nn.id,newdist);
                    }

                }


                nn=nn.next;
            }

        }






        return distance;
    }

    private void updateQ(Queue<QN> queue, int id, int newdist) {
        boolean flag=false;
        for (QN qn : queue) {
            if (qn.id==id) {
                qn.sd=newdist;
                flag=true;
            }

        }

        if (!flag) {
            queue.add(new QN(id,newdist));
        }
    }


    public static void main(String[] args) {
        GraphD graphD=new GraphD();
        graphD.createGraph();
        graphD.printGraph();
        Integer [] distance=graphD.getDistanceFromSingleSource(0);
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i+" node having distance "+distance[i]);

        }

    }




}
