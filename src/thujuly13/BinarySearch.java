package thujuly13;

/**
 * Created by brkar on 7/13/2017.
 */
public class BinarySearch {


    public static void main(String[] args) {

         Integer [] a={1,3,5,7,9,11,33,55};

        System.out.println(BinaryS(a, 0,a.length-1,33));
        System.out.println(BinaryS(a, 0,a.length-1,12));

    }

    private static boolean BinaryS(Integer[] a,int b,int e, int i) {

        if(b>=e)
            return false;
        int mid =(b+e)/2;
        if(a[mid]==i)
            return true;
        else
            if(a[mid]<i)
                return  BinaryS(a,mid+1,e,i);
        else
            return BinaryS(a,b,mid-1,i);
    }
}
