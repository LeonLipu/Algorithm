package july19wed;

import java.util.*;

/**
 * Created by brahmanandakar on 19/07/17.
 */
public class GraphD {

    class GN {
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
    // graph node with parent distance


    class QN implements Comparable {

        int id;
        int sd;

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }

        @Override
        public int compareTo(Object o) {
            QN qnode = (QN) o;
            if (this.sd > qnode.sd)
                return 1;
            if (this.sd < qnode.sd)
                return -1;

            return 0;
        }
    }


    //Queue node with id with source dist and lowest distance will be on top in priority queue or sort

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

    public void addEdge(int sid, int did, int pd) {

        GN snode = getNodeById(sid);
        GN dnode = new GN(did, pd);
        dnode.next = snode.next;
        snode.next = dnode;

    }

    public void printGraph() {
        for (GN gn : nodelist) {

            while (gn != null) {
                System.out.print(gn.id + "(" + gn.pd + ")-->");
                gn = gn.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    //adding node and edge is comeplete
    public void createGraph() {

        addNode(0);
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);


        addEdge(0, 1, 2);
        addEdge(0, 2, 1);
        addEdge(1, 2, 3);
        addEdge(2, 3, 5);
        addEdge(2, 6, 12);
        addEdge(3, 6, 6);
        addEdge(3, 5, 6);


    }

    public void updateQueue(PriorityQueue<QN> queue, int id, int newDist) {

        for (QN qn : queue) {

            if (qn.id == id) {
                qn.sd = newDist;
                return;
            }

        }

        queue.add(new QN(id, newDist));


    }

    public Integer[] getShrotestPathFromSource(int sid) {

        PriorityQueue<QN> queue = new PriorityQueue<>();

        Integer[] distance = new Integer[nodelist.size()];
        boolean[] visited = new boolean[nodelist.size()];

        Arrays.fill(distance, Integer.MAX_VALUE); //fill the array with infinity
        Arrays.fill(visited, false);   //fill visited array with false

        queue.add(new QN(sid, 0));
        distance[sid] = 0;

        while (!queue.isEmpty()) {


            QN qnode = queue.remove();
            visited[qnode.id] = true;

            GN gnode = getNodeById(qnode.id); //get graph node of that node
            GN cNode = gnode.next; // get connected node of graph node

            while (cNode != null) {

                if (!visited[cNode.id]) {

                    if ((qnode.sd + cNode.pd) < distance[cNode.id]) {
                        distance[cNode.id] = qnode.sd + cNode.pd;
                        updateQueue(queue, cNode.id, distance[cNode.id]); //update distance with new one ;

                    }

                }

                cNode = cNode.next; //get into all the neighbour

            }

        }

        return distance;
    }


    public static void main(String[] args) {

        GraphD graphD = new GraphD();
        graphD.createGraph();
        graphD.printGraph();

        Integer[] distance = graphD.getShrotestPathFromSource(0);


        for (int i = 0; i < distance.length; i++) {

            System.out.println("vertex is  " + i + "  minimum distance " + distance[i]);

        }


    }


}
