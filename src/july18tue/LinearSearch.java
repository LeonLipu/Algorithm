package july18tue;

/**
 * Created by brahmanandakar on 17/07/17.
 */
public class LinearSearch {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

        System.out.println(BinaryS(a, 32));
        System.out.println(BinaryS(a, 31));
    }

    private static boolean BinaryS(Integer[] a, int n) {

        for (int i = 0; i < a.length; i++) {
            if (a[i]==n) {
                return true;
            }

        }
        return false;

    }

}
