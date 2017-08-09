package aug9wed;

import java.util.*;

/**
 * Created by brahmanandakar on 09/08/17.
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
    }// declaration node


    class QN {
        int id;
        int sd;

        public QN(int id, int sd) {
            this.id = id;
            this.sd = sd;
        }
    }

    List<GN> nodelist;

    public GraphD() {
        nodelist = new ArrayList<>();
    }

    public GN getNodeById(int id) {
        for (GN gn : nodelist) {
            if (gn.id == id) {
                return gn;
            }

        }
        return null;
    }

    public void addNode(int id) {
        nodelist.add(new GN(id));
    }

    public void addEdge(int sid, int did, int dist) {
        GN snode = getNodeById(sid);
        GN dnode = new GN(did, dist);
        dnode.next = snode.next;
        snode.next = dnode;
    }

    public void printGraph() {
        for (GN gn : nodelist) {
            while (gn != null) {
                System.out.print(gn.id + "<" + gn.pd + ">-");
                gn = gn.next;
            }
            System.out.print("null");
            System.out.println();

        }
    }

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

    public Integer[] singleSourcepath(int id) {
        Queue<QN> queue = new PriorityQueue<>(new Comparator<QN>() {
            @Override
            public int compare(QN o1, QN o2) {
                if (o1.sd > o2.sd) {
                    return 1;
                }
                if (o1.sd < o2.sd)
                    return -1;
                return 0;
            }
        });

        Boolean[] visited = Arrays.stream(new Boolean[nodelist.size()]).map(e -> false).toArray(Boolean[]::new);
        Integer[] distance = Arrays.stream(new Integer[nodelist.size()]).map(e -> Integer.MAX_VALUE).toArray(Integer[]::new);

        queue.add(new QN(id, 0));
        visited[id] = true;
        distance[id] = 0;

        while (!queue.isEmpty()) {

            QN qn = queue.remove();
            GN gn = getNodeById(qn.id);
            GN nn = gn.next == null ? null : gn.next;
            while (nn != null) {

                if (!visited[nn.id]) {
                    int newdist = nn.pd + distance[gn.id];
                    if (newdist < distance[nn.id]) {
                        visited[nn.id] = true;
                        distance[nn.id] = newdist;
                        updateQ(queue, nn.id, newdist);
                    }
                }

                nn = nn.next;
            }
        }
        return distance;
    }

    private void updateQ(Queue<QN> queue, int id, int newdist) {

        for (QN qn : queue) {
            if (qn.id == id) {
                qn.sd = newdist;
                return;
            }

        }
        queue.add(new QN(id, newdist));
    }


    public static void main(String[] args) {
        GraphD graphD = new GraphD();
        graphD.createGraph();
        graphD.printGraph();
        Integer[] distance=graphD.singleSourcepath(0);

        for (int i = 0; i < distance.length; i++) {
            System.out.println(i+" node distance from source 0 is "+distance[i]);

        }

    }

}
