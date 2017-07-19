package july19wed;

import java.util.Arrays;

/**
 * Created by brkar on 7/19/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
    Integer [] a= {1,2,3,4,19,20,77};

        System.out.println(BinaryS(a, 0, a.length - 1, 19));
    }

    private static boolean BinaryS(Integer[] a, int i, int l, int n) {

        if (i>l) {
            return false;
        }

        int m=(i+l)/2;
        System.out.println(Arrays.asList(a));
        if (a[m]==n) {
            return true;
        }

        if (a[m]>n) {
            return BinaryS(a,i,m-1,n);
        }
        return BinaryS(a,m+1,l,n);
    }
}
