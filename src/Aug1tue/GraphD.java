package Aug1tue;

import java.util.*;

public class GraphD {

    class GN{
        int id ;
        int pd ;
        GN next;

        public GN(int id, int pd) {
            this.id = id;
            this.pd = pd;
        }

        public GN(int id) {

            this.id = id;
        }
    }//declaration of graph node

    class QN implements Comparable{
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
                return -1;
            }
            if (qn.sd<this.sd)
                return -1;

            return 0;
        }
    }//declaration of queue node

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

    public void addNode(int id ){nodelist.add(new GN(id));}

    public void addEdge(int sid ,int did,int dist){
        GN snode=getNodebyId(sid);
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
        addEdge(3,5,6);
        addEdge(3,6,6);
    }
    public void printGraph(){
        for (GN gn : nodelist) {
            while(gn!=null){
                System.out.print(gn.id+"("+gn.pd+")->");
                gn=gn.next;
            }

            System.out.print("null");
            System.out.println();
        }
    }

    public Integer [] getDistancefromSource(int id ){


        //declaration of node
        Queue<QN> queue=new PriorityQueue<>();
        Set<Integer> visited=new HashSet<>();
        Integer [] distance= Arrays.stream(new Integer[nodelist.size()]).mapToInt(e->Integer.MAX_VALUE).boxed().toArray(Integer[]::new);

        //Initization
        queue.add(new QN(id,0));
        visited.add(id);
        distance[id]=0;

        //while loop
        while(!queue.isEmpty()){
            QN qn=queue.remove();
            GN gn=getNodebyId(qn.id);
            GN nn=gn.next==null?null:gn.next;
            while (nn != null) {
                if (!visited.contains(nn.id)) {
                    int newdist=distance[gn.id]+nn.pd;

                    if (newdist<distance[nn.id]){
                        distance[nn.id]=newdist;
                        visited.add(nn.id);
                        UpdateQ(queue,nn.id,newdist);
                    }
                }
                nn=nn.next;
            }
        }
    return distance;
    }

    private void UpdateQ(Queue<QN> queue, int id, int newdist) {
        for (QN qn : queue) {
            if (qn.id==id) {
                qn.sd=newdist;
                return;
            }

        }
        queue.add(new QN(id,newdist));
    }

    public static void main(String[] args) {
        GraphD graphD=new GraphD();
        graphD.createGraph();
        graphD.printGraph();
        Integer[] distance = graphD.getDistancefromSource(0);
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i+" node having distance from root "+distance[i]);

        }
    }


}
