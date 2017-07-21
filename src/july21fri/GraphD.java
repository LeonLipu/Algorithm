package july21fri;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by brahmanandakar on 21/07/17.
 */
public class GraphD {

    class GN{
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
    }//it is graph node class declared

    class QN  implements  Comparable{
        int id ;
        int sd;

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }

        @Override
        public int compareTo(Object o) {
            QN node=(QN)o;
            if(this.sd>node.sd)
                return 1;
            if(this.sd<node.id)
                return -1;
            return 0;
        }
    }//queue node declared to store distance from source


    List<GN> nodelist;
    public GraphD(){
        nodelist=new ArrayList<>();
    }

    public GN getNodeById(int id){

        for (GN gn : nodelist) {
            if (gn.id==id) {
                return gn;
            }

        }
        return  null;
    }

public void addNode(int id ){


        nodelist.add(new GN(id));

}

public void addEdge(int sid ,int did,int dist){


    GN snode=getNodeById(sid);
    GN dnode=new GN(did,dist);
    dnode.next=snode.next;
    snode.next=dnode;

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
        addEdge(3,6,6);
        addEdge(3,5,6);

    }


    public Integer[] shortestPath(int sid){

        PriorityQueue<QN> queue=new PriorityQueue<>();

        Integer[] distance=new Integer[nodelist.size()];
        boolean[] visisted= new boolean[nodelist.size()];




        for (int i = 0; i <nodelist.size(); i++) {
            distance[i]=Integer.MAX_VALUE;
            visisted[i]=false;

        } //These are step to required for graph



        queue.add(new QN(sid,0));
        distance[sid]=0;



        while(!queue.isEmpty()){


            QN qn=queue.remove();

            GN gn=getNodeById(qn.id);

            visisted[gn.id]=true;

            GN nb =gn.next==null?null:gn.next;


            while(nb!=null){

                if (!visisted[nb.id]) {

                    int kdist=qn.sd+nb.pd;

                    if (kdist< distance[nb.id]){

                        distance[nb.id]=kdist;
                        Qupdate(queue,nb.id,kdist);

                    }


                }

                nb=nb.next;


            }

        }

        return distance;

    }

    private void Qupdate(PriorityQueue<QN> queue, int id, int kdist) {


        boolean uflag=false;
        for (QN qn : queue) {

            if (qn.id==id) {
                qn.sd=kdist;

                uflag=true;
            }

        }
        if (!uflag) {
            queue.add(new QN(id,kdist));
        }
    }


    public static void main(String[] args) {

        GraphD graphD=new GraphD();
        graphD.createGraph();
        Integer[] distance = graphD.shortestPath(0);


        for (int i = 0; i < distance.length; i++) {

            System.out.println("the node id "+i+" shortest distance is "+distance[i]);

        }

    }


}




















