package july29sat;

/**
 * Created by brahmanandakar on 29/07/17.
 */
public class LinearSearch {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         LinearM(a,54);
    }

    private static boolean LinearM(Integer[] a, int n) {
        for (Integer element : a) {
            if (element==n) {
                return true;
            }

        }
        return false;
    }
}
