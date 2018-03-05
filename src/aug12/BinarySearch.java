package aug12;

import july24mon.BinaryS;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 12/08/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 3, 4, 5, 19, 71, 77};
        System.out.println(binaryM(a, 0, a.length - 1, 19));

        Arrays.fill(a,0);
        System.out.println(Arrays.asList(a));

    }

    private static boolean binaryM(Integer[] a, int i, int l, int n ) {

        if (i>l) {
            return false;
        }
        int m=(i+l)/2;
        if (a[m]==n) {
            return true;
        }

        if (a[m]>n) {
            return binaryM(a,i,m-1,n);
        }
        else
            return binaryM(a,m+1,l,n);
    }

}
