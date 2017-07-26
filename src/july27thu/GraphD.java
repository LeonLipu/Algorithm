package july27thu;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by brahmanandakar on 27/07/17.
 */
public class GraphD {


    class GN {
        int id;
        int pd;
        GN next;

        public GN(int id) {
            this.id = id;
        }

        public GN(int id, int pd) {
            this.id = id;
            this.pd = pd;
        }
    }//declaration graph node


    class QN implements Comparable {
        int id;
        int sd;

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }

        @Override
        public int compareTo(Object o) {

            QN queue = (QN) o;

            if (this.sd > queue.sd) {
                return 1;
            }
            if (this.sd < queue.sd) {
                return -1;
            }
            return 0;
        }
    }//declation of queue node

    List<GN> nodelist;

    public GraphD() {
        nodelist = new ArrayList<>();
    }


    public void addNode(int id) {
        nodelist.add(new GN(id));
    }

    public GN getNodeById(int id) {
        for (GN gn : nodelist) {
            if (gn.id == id) {
                return gn;
            }

        }
        return null;
    }

    public void addEdge(int sid, int did, int dist) {


        GN snode = getNodeById(sid);
        GN dnode = new GN(did, dist);
        dnode.next = snode.next;
        snode.next = dnode;
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


public Integer[] getShortestDistanceFromSingleSource(int id){

        //declaration of data types
    Queue<QN> queue=new PriorityQueue<>(); // minimum pid will removed first
    Set<Integer> visited =new HashSet<>(); //visited of node or not
    Integer [] distance= new Integer[nodelist.size()];

    //initilazation for fist node

    queue.add(new QN(id,0));
    visited.add(id);
    distance =  Arrays.stream(distance).mapToInt(e->Integer.MAX_VALUE).boxed().toArray(Integer[]::new);
    distance[id]=0;

    //now loooping concept
    while(!queue.isEmpty()){

        QN qn=queue.remove();
        GN gn=getNodeById(qn.id);
        GN nn=gn.next==null?null:gn.next;

        while (nn != null) {

            if (!visited.contains(nn.id)) {

                int newdist = distance[gn.id] + nn.pd;
                if (distance[nn.id] > newdist) {
                    distance[nn.id] = newdist;
                    visited.add(nn.id);
                    updateQ(queue, nn.id, newdist);
                }

            }

            nn = nn.next;
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
        Integer[] dist = graphD.getShortestDistanceFromSingleSource(0);
        for (int i = 0; i < dist.length; i++) {
            System.out.println(" node "+ i+" and distnace from source is "+dist[i]);

        }
    }

}
