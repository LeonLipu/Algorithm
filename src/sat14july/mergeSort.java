package sat14july;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 15/07/17.
 */
public class mergeSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         MergeS(a,0,a.length-1);

        System.out.println(Arrays.asList(a));
    }

    private static void MergeS(Integer[] a, int f, int r) {

        if(f>=r)
            return;

        int m=(f+r)/2;
        MergeS(a,f,m);
        MergeS(a,m+1,r);
        Merge(a,f,m,r);


    }

    private static void Merge(Integer[] a, int f, int m, int r) {

        Integer [] na=new Integer[r-f+1];

        int ff=f;
        int rf=m;
        int fs=m+1;
        int rs=r;

        int k=0;


        while(ff<=rf || fs<=rs){

            while(ff<=rf && fs<=rs){

                if (a[ff]<a[fs])
                    na[k++]=a[ff++];
                else
                    na[k++]=a[fs++];

            }

            if(ff<=rf)
                na[k++]=a[ff++];
            else
                na[k++]=a[fs++];


        }
        k=0;

        for (int i = f; i <= r; i++) {
            a[i]=na[k++];

        }






    }
}
