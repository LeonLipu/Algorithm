package july28fri;

public class LinearSearch {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(LinearS(a, 43));
        System.out.println(LinearS(a, 41));


    }

    private static boolean LinearS(Integer[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i]==n) {
                return true;
            }

        }
        return false;

    }
}
