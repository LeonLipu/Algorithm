package sunJuly16;

/**
 * Created by brahmanandakar on 16/07/17.
 */
public class BinarySearch {

    public static void main(String[] args) {

        Integer [] a = {1, 2, 3, 4, 5, 19, 17, 77};

        System.out.println(BinaryS(a, 0, a.length - 1, 19));
        System.out.println(BinaryS(a, 0, a.length - 1, 12));

    }

    private static boolean BinaryS(Integer[] a, int f, int r, int n) {

        if (f>=r)
            return false;

        int m=(f+r)/2;

        if (a[m]==n)
            return true;
        if(a[m]<n)
            return BinaryS(a,m+1,r,n);
        else
            return BinaryS(a,f,m-1,n);

    }
}
