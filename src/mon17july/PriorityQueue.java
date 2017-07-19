package mon17july;

import java.util.Queue;

/**
 * Created by brkar on 7/17/2017.
 */
public class PriorityQueue {


    public static void main(String[] args) {


        System.out.println("Nothing but which need to have something ");

        Queue<String> names=new java.util.PriorityQueue<>();
        names.add("A");
        names.add("B");
        names.add("F");
        names.add("L");
        names.add("P");
        names.add("U");
        names.add("C");
      ;

        System.out.println(names.element());
        System.out.println(names.peek());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());




        }
    }
