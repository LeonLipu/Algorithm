package thujuly13;

/**
 * Created by brkar on 7/13/2017.
 */
public class linearSearch {


    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

        System.out.println(LinearSearch(a, 33));
        System.out.println(LinearSearch(a, 89));
    }

    private static boolean LinearSearch(Integer[] a, int i) {

        for (int j = 0; j <a.length ; j++) {

            if(a[j]==i)
                return true;

        }
        return false;
    }

}
