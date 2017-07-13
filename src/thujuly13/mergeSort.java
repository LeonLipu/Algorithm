package thujuly13;

import java.util.Arrays;

/**
 * Created by brkar on 7/13/2017.
 */
public class mergeSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         mergeS(a,0,a.length-1);
        System.out.println(Arrays.asList(a));

    }

    private static void mergeS(Integer[] a, int b, int e) {

    if(b>=e)
        return;

    int mid=(b+e)/2;
    mergeS(a,b,mid);
    mergeS(a,mid+1,e);
    merge(a,b,mid,e);


    }

    private static void merge(Integer[] a, int b, int mid, int e) {

        Integer [] na=new Integer[e-b+1];
        int k=0;
        int b1=b;
        int e1=mid;
        int b2=mid+1;
        int e2=e;



        while(b1<=e1 || b2<=e2){


            while(b1<=e1 && b2<=e2)
                if(a[b1]<a[b2])
                na[k++]=a[b1++];
                        else
                            na[k++]=a[b2++];


            if(b1<=e1)
                na[k++]=a[b1++];
            else
                na[k++]=a[b2++];

        }

        k=0;
        for (int i = b; i <=e ; i++) {

            a[i]=na[k++];
        }


    }


}
