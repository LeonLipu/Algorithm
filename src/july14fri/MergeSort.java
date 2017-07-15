package july14fri;

import java.util.Arrays;

/**
 * Created by brkar on 7/14/2017.
 */
public class MergeSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         MergeS(a,0,a.length-1);
        System.out.println(Arrays.asList(a));
    }

    private static void MergeS(Integer[] a, int b, int e) {

   if(b>=e)
       return;

   int m=(b+e)/2;
   MergeS(a,b,m);
   MergeS(a,m+1,e);
   Merge(a,b,m,e);

    }

    private static void Merge(Integer[] a, int b, int m, int e) {

    Integer [] na=new Integer[e-b+1];

    int bf=b;
    int ef=m;
    int bs=m+1;
    int es=e;

    int k=0;

    while(bf<=ef || bs<=es){

        while(bf<=ef && bs<=es){

            if(a[bf]<a[bs])
            na[k++]=a[bf++];
            else
                na[k++]=a[bs++];
        }
        if(bf<=ef)
            na[k++]=a[bf++];
        else
            na[k++]=a[bs++];
    }
    k=0;
        for (int i = b; i <=e ; i++) {
            a[i]=na[k++];
        }



    }
}
