package july25monday;

import java.util.*;

/**
 * Created by brahmanandakar on 25/07/17.
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

            if(this.sd>q.sd)
                return 1;
            if (this.sd<q.sd) {
                return 1;
            }

            return 0;
        }
    }

    List<GN> nodelist;
    public GraphD(){
        nodelist=new ArrayList<>();
    }

    public GN getNodebyId(int id ){
        for (GN gn : nodelist) {
            if (gn.id==id) {
                return gn;
            }

        }
        return null;
    }

    public void addNode(int id ){
        nodelist.add(new GN(id));
    }
    public void addEdge(int sid,int did,int dist){

        GN snode=getNodebyId(sid);
        GN dnode =new GN(did,dist);
        dnode.next=snode.next;
        snode.next=dnode;
    }

    public void printGraph(){
        for (GN gn : nodelist) {

            while (gn != null) {
                System.out.print(gn.id+"("+gn.pd+")->");
                gn=gn.next;
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
        addEdge(0,2,3);
        addEdge(1,2,3);
        addEdge(2,3,5);
        addEdge(2,6,12);
        addEdge(3,6,6);
        addEdge(3,5,6);


    }


    public Integer[] getShortestDistance(int id ){

        Queue<QN> queue=new PriorityQueue<>();
        Set<Integer> visited=new HashSet<>();
        Integer [] distance=new Integer[nodelist.size()];

        for (int i = 0; i < distance.length; i++) {
            distance[i]=Integer.MAX_VALUE;

        }

        queue.add(new QN(id,0));
        visited.add(id);

        distance[id]=0;

        while(!queue.isEmpty()){

            QN qn=queue.remove();
            GN gn=getNodebyId(qn.id);
            GN nn=gn.next==null?null:gn.next;

            while (nn != null) {
                if (!visited.contains(nn.id)) {

                    int dist=distance[gn.id]+nn.pd;
                    if (distance[nn.id]>dist) {
                        distance[nn.id]=dist;
                        updateQ(queue,nn.id,dist);
                        visited.add(nn.id);
                    }
                }
                nn=nn.next;
            }
        }
        return distance;
    }

    private void updateQ(Queue<QN> queue, int id, int dist) {
        boolean flag=false;

        for (QN qn : queue) {
            if (qn.id==id) {
                qn.sd=dist;
                flag=true;
            }
        }
        if (!flag) {
            queue.add(new QN(id,dist));
        }

    }

    public static void main(String[] args) {
        GraphD graphD=new GraphD();
        graphD.createGraph();
        graphD.printGraph();
        Integer[] dist = graphD.getShortestDistance(0);

        for (int i = 0; i < dist.length; i++) {

            System.out.println("node "+i+" the distance "+dist[i]);

        }

    }


}
