package mon17july;

/**
 * Created by brahmanandakar on 17/07/17.
 */
public class LinearSearch {


    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(LinearS(a, 33));
        System.out.println(LinearS(a, 11));
    }

    private static boolean LinearS(Integer[] a, int i) {
        for (int i1 = 0; i1 < a.length; i1++) {
            if (a[i1]==i) {
                return true;
            }
        }
        return false;
    }
}
