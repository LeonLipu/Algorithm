package July20Thus;

/**
 * Created by brahmanandakar on 20/07/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 3, 4, 5, 19, 33, 77};

        System.out.println(BinearyS(a, 0, a.length - 1, 19));
        System.out.println(BinearyS(a, 0, a.length - 1, 20));


    }

    private static boolean BinearyS(Integer[] a, int i, int l, int n) {
        if (i>=l) {
            return false;
        }

        int m=(i+l)/2;
        if (a[m]==n) {
            return true;
        }

        if (a[m]>n) {
            return  BinearyS(a,i,m-1,n);
        }else
            return BinearyS(a,m+1,l,n);
    }
}
