package aug3thus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brahmanandakar on 03/08/17.
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
    }// declaration of node


    class QN implements Comparable{
        int id ;
        int sd;


        @Override
        public int compareTo(Object o) {

            QN queuenode =(QN) o;

            if (queuenode.sd>this.sd) {
                return -1;
            }
            if (queuenode.sd<this.id)
                return 1;
            return 0;
        }
    }//declaration of node


    List<GN> nodelist;
    public GraphD(){
        nodelist=new ArrayList<>();
    }


    public GN getNodebyId(int id ) {
        for (GN gn : nodelist) {

            if (gn.id == id) {
                return gn;
            }

        }
        return null;
    }


        public void addNode(int id){
        nodelist.add(new GN(id));

       }

       public void addEdge(int sid,int did ,int dist){

       }



}
