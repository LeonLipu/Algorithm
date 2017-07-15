package july14fri;

/**
 * Created by brkar on 7/14/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
         Integer [] a={12,32,33,78,88,99};
        System.out.println(BiraryS(a, 0, a.length - 1, 88));

    }

    private static boolean BiraryS(Integer[] a, int b, int e,int n) {
        if(b>=e)
            return false;
        int mid=(b+e)/2;
        if(a[mid]==n)
            return true;
        if(a[mid]>n)
            return BiraryS(a,mid+1,e,n);
        else
            return BiraryS(a,b,mid-1,n);

    }
}
