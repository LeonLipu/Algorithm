package july31mon;

/**
 * Created by brahmanandakar on 31/07/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 3, 4, 5, 19, 71, 77};
        System.out.println(BinaryM(a, 0, a.length - 1, 19));
        System.out.println(BinaryM(a, 0, a.length - 1, 20));

    }

    private static boolean BinaryM(Integer[] a, int i, int l, int n) {
        if (i>l) {
            return false;
        }

        int m=(i+l)/2;

        if (a[m]==n) {
            return true;
        }

        if (a[m]>n) {
            return BinaryM(a,i,m-1,n);
        }
        else
            return BinaryM(a,m+1,l,n);
    }
}
