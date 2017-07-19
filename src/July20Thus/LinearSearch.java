package July20Thus;

/**
 * Created by brahmanandakar on 20/07/17.
 */
public class LinearSearch {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(LinearS(a, 43));
        System.out.println(LinearS(a, 430));


    }

    private static boolean LinearS(Integer[] a, int i) {
        for (int j = 0; j < a.length; j++) {
            if (a[j]==i) {
                return true;
            }

        }
        return false;
    }
}
