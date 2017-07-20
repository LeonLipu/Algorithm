package July20Thus;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**.
 * It is Distkhatra algorithm for getting shortest path from source vertex
 */
public class GraphD {

    class GN{
        int id;
        int pd;
        GN next;

        public GN(int id, int pd) {
            this.id = id;
            this.pd = pd;
        }

        public GN(int id) {

            this.id = id;
        }
    }

    class QN implements Comparable{
        int id ;
        int sd;

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }

        @Override
        public int compareTo(Object o) {

            QN q=(QN)o;

            if (q.sd>this.sd) {
                return 1;
            }
            if(q.id<this.sd)
                return -1;
            return 0;
        }
    }

    List<GN> nodelist;
    public GraphD(){
        nodelist=new ArrayList<>();
    }
    public GN nodebyId(int id)
    {
        for (GN gn : nodelist) {
            if (gn.id==id) {
                return gn ;
            }

        }

        return null;
    }

    public void addNode(int id){
        nodelist.add(new GN(id));
    }
    public void addEdge(int sid,int did, int dist){

        GN snode=nodebyId(sid);
        GN dnode =new GN(did,dist);
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


    public void printGraph(){

        for (GN gn : nodelist) {

            while (gn != null) {

                System.out.print(gn.id+"("+gn.pd+")-->");
                gn=gn.next;
            }
            System.out.print("null");
            System.out.println();
        }

    }

    public Integer[] shortestPaths(int sid){

        PriorityQueue<QN> queue=new PriorityQueue<>();
        Integer[] distance=new Integer[nodelist.size()];
        boolean [] visisted=new boolean[nodelist.size()];

        for (int i = 0; i < nodelist.size(); i++) {
            distance[i]=Integer.MAX_VALUE;
            visisted[i]=false;
        }

        queue.add(new QN(sid,0));
        distance[sid]=0;

        while(!queue.isEmpty()){

            QN qn=queue.remove();
            GN gn=nodebyId(qn.id);
            visisted[gn.id]=true;
            GN nb=gn.next==null?null:gn.next;

            while (nb != null) {
                if (!visisted[nb.id]) {

                    int newdist=qn.sd+nb.pd;
                    if(newdist<distance[nb.id]){
                        distance[nb.id]=newdist;
                        updateQ(queue,nb.id,newdist);
                    }
                }
                nb=nb.next;
            }
        }
      return distance;
    }

    private void updateQ(PriorityQueue<QN> queue, int id, int newdist) {


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
        Integer[] dist = graphD.shortestPaths(0);

        for (int i = 0; i < dist.length; i++) {

            System.out.println("the node  "+i+" the  shortest distance "+dist[i]);
        }
    }

}
