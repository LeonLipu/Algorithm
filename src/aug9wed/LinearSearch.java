package aug9wed;

/**
 * Created by brahmanandakar on 09/08/17.
 */
public class LinearSearch {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(LinearM(a, 26));
    }

    private static boolean LinearM(Integer[] a, int n) {
        for (Integer num : a) {
            if (num==n) {
                return true;
            }

        }
        return false;
    }
}
