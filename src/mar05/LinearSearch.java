package mar05;

/**
 * Created by brahmanandakar on 06/03/18.
 */
public class LinearSearch {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};


        System.out.println(LinearSearchM(a,54));

    }

    private static boolean LinearSearchM(Integer[] a, int i) {

        for (Integer n : a) {
            if(i==n)
                return true;

        }
        return false;
    }


}
