package july24mon;

import java.util.*;

/**
 * Created by brahmanandakar on 25/07/17.
 */
public class GraphD {

    class GN{
        int id ;
        GN next;
        int pd; //parent distance

        public GN(int id) {
            this.id = id;
        }

        public GN(int id, int pd) {
            this.id = id;
            this.pd = pd;
        }
    } //declation of  Graph node

    class QN implements Comparable{
        int id ;
        int sd; //source distance

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }

        @Override
        public int compareTo(Object o) {

            QN node=(QN)o;
            if (this.id>node.id) {
                return 1;
            }
            if(this.id<node.id)
                return -1;

            return 0;
        }
    } //declaration of Queue node

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

    public void addEdge(int sid,int did,int dist){
        GN snode =getNodeById(sid);
        GN dnode=new GN(did,dist);
        dnode.next=snode.next;
        snode.next=dnode;
    }

    public void addNode(int id ){
        nodelist.add(new GN(id));
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

        PriorityQueue<QN> queue  =new  PriorityQueue<>();
        queue.add(new QN(sid,0));
        Set<Integer> visisted=new HashSet<>();
        Integer [] dist=new Integer[nodelist.size()];


        for (int i = 0; i < dist.length; i++) {
            dist[i]=Integer.MAX_VALUE;

        }


        dist[sid]=0;



        while(!queue.isEmpty())
        {
            QN q=queue.remove();
            GN g=getNodeById(q.id);
            GN n=g.next==null?null:g.next;

            while(n!=null){

                if (!visisted.contains(n.id)) {

                    int distance =dist[g.id]+n.pd;

                    if(distance<dist[n.id]){
                        dist[n.id]=distance;

                        updateQ(queue,n.id,distance);
                        visisted.add(n.id);
                    }


                }

              n=n.next;

            }

        }

        return dist;
    }

    private void updateQ(PriorityQueue<QN> queue, int id, int distance) {


        boolean flag=false;
        for (QN qn : queue) {
            if (qn.id==id) {
                qn.sd=distance;
                flag=true;
            }
        }

        if (!flag) {
            queue.add(new QN(id,distance));
        }


    }

    public static void main(String[] args) {
        GraphD grap=new GraphD();
        grap.createGraph();
        Integer[] arr = grap.shortestPath(0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i +"  node distance is "+arr[i] );

        }

    }


}
