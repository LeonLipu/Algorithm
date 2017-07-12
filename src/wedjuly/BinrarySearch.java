package wedjuly;

/**
 * Created by brahmanandakar on 12/07/17.
 */
public class BinrarySearch {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 3, 4, 5, 19, 78, 88};

        System.out.println(BinaryS(a, 0,a.length-1 ,19));

    }

    private static boolean BinaryS(Integer[] a,int i, int l,int e) {

        int m=i+l;
        m=m/2;


        System.out.println(a[m]);
        if(a[m]==e)
            return true;

        if(i>l)
            return false;

        if(a[m]>e)
       return BinaryS(a,i,m-1,e);
        return  BinaryS(a,m+1,l,e);

    }
}
