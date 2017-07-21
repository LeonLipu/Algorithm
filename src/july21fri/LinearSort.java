package july21fri;

public class LinearSort {


    public static void main(String[] args) {

         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(Linears(a, 34));
    }

    private static boolean Linears(Integer[] a, int i) {
        for (int j = 0; j < a.length; j++) {
            if (a[j]==i) {
                return true;
            }

    }
        return false;
}


}
