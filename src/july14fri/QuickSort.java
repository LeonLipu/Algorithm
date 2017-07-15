package july14fri;

import java.awt.geom.QuadCurve2D;
import java.util.Arrays;

/**
 * Created by brkar on 7/14/2017.
 */
public class QuickSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         QuickS(a,0,a.length-1);

        System.out.println(Arrays.asList(a));
    }

    private static void QuickS(Integer[] a, int b, int e) {


        if(b>=e)
            return;

        int pivot=partition(a,b,e);
        QuickS(a,b,pivot-1);
        QuickS(a,pivot+1,e);
    }

    private static int partition(Integer[] a, int b, int e) {

        int pivot=a[b];
        int i=b+1;
        int l=e;

        while(i<=l){

            if(a[i]<pivot)
                i++;
            else
                if(a[l]>pivot)
                    l--;
            else
                {
                    int temp=a[i];
                    a[i]=a[l];
                    a[l]=temp;
                    l--;
                    i++;
                }
        }

        a[b]=a[--i];
        a[i]=pivot;
        return i;



    }
}
