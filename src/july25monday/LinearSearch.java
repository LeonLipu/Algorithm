package july25monday;

public class LinearSearch {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(LinearS(a, 34));
    }

    private static boolean LinearS(Integer[] a, int n) {
        for (Integer i : a) {
            if (i==n) {
                return true;
            }

        }
        return false;
    }
}
