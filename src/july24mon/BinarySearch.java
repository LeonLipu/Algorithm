package july24mon;

/**
 * Created by brahmanandakar on 24/07/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(LinearM(a, 8));
        System.out.println(LinearM(a, 18));

    }

    private static boolean LinearM(Integer[] a, int n) {
        for (Integer e : a) {
            if (e==n) {
                return true;
            }


        }
        return false;
    }
}
