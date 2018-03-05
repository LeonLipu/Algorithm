package mar05;

/**
 * Created by brahmanandakar on 06/03/18.
 */
public class BinarySearch {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 3, 4, 5, 19, 71, 77};

        System.out.println(BinarySM(a,0,a.length-1,71));
    }

    private static boolean BinarySM(Integer[] a, int f, int l, int n) {

        if(f>l)
            return false;

        int m=(f+l)/2;

        if(a[m]==n)
            return true;

        if (a[m]>n)
            return BinarySM(a,f,m-1,n);
        else
            return BinarySM(a,m+1,l,n);


    }


}
