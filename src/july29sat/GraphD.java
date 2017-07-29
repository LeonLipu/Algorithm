package july29sat;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.*;

/**
 * Created by brahmanandakar on 29/07/17.
 */
public class GraphD {
    class GN {
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


    class QN implements  Comparable{
        int id ;
        int sd;

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }


        @Override
        public int compareTo(Object o) {

            QN object=(QN)o;

            if (object.sd>this.sd) {
                return -1;
            }
            if(object.sd<this.sd)
                return 1;

            return 0;
        }
    }//declaration of queue node
    List<GN> nodelist;
    public GraphD(){
        nodelist=new ArrayList<>();
    }

    public void addNode(int id){
        nodelist.add(new GN(id));
    }
    public GN getNodebyId(int id ){
        for (GN gn : nodelist) {
            if (gn.id==id) {
                return gn;
            }

        }
        return null;
    }
    public void addEdge(int sid,int did,int dist){
        GN snode=getNodebyId(sid);
        GN dnode=new GN(did,dist);
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
        addEdge(0,2,1);
        addEdge(1,2,3);
        addEdge(2,3,5);
        addEdge(2,6,12);
        addEdge(3,5,6);
        addEdge(3,6,6);

    }

    public Integer [] getMinfromSingleSource(int id){

        //declaration part

        Queue<QN> queue=new PriorityQueue<>();
        Set<Integer> visited=new HashSet<>();
        Integer[] dist=new Integer[nodelist.size()];
        dist= Arrays.stream(dist).mapToInt(e->Integer.MAX_VALUE).boxed().toArray(Integer[]::new);

        //Inialazation part
        queue.add(new QN(id,0));
        visited.add(id);
        dist[id]=0;

        //relaxation part

        while(!queue.isEmpty()){

            QN qn=queue.remove();
            GN gn=getNodebyId(qn.id);
            GN nn=gn.next==null?null:gn.next;

            while (nn != null) {

                if (!visited.contains(nn.id)) {
                    int d=dist[gn.id]+nn.pd;
                    if(d<dist[nn.id]){
                        dist[nn.id]=d;
                        visited.add(nn.id);
                        updateQueue(queue,nn.id,d);
                    }

                }


                nn=nn.next;
            }



        }


        return dist;

    }

    private void updateQueue(Queue<QN> queue, int id, int d) {
        boolean flag=false;
        for (QN qn : queue) {
            if (qn.id==id) {
                qn.sd=d;
                flag=true;
            }

        }

        if (!flag) {
            queue.add(new QN(id,d));
        }
    }

    public static void main(String[] args) {
        GraphD graphD=new GraphD();
        graphD.createGraph();
        graphD.printGraph();
        Integer [] dist=graphD.getMinfromSingleSource(0);
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i+" node having distance from source "+dist[i]);

        }
    }


}
