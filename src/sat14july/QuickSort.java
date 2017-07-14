package sat14july;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 15/07/17.
 */
public class QuickSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         QuickS(a,0,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void QuickS(Integer[] a, int f, int r) {

        if (f>=r)
            return;

        int pivot=partition(a,f,r);
        QuickS(a,f,pivot-1);
        QuickS(a,pivot+1,r);

    }

    private static int partition(Integer[] a, int f, int r) {

        int pivot=f++;
        while(f<=r){

            if (a[f]<a[pivot])
                f++;
            else if(a[r]>a[pivot])
                r--;
            else{
                int temp=a[f];
                a[f]=a[r];
                a[r]=temp;
                f++;
                r--;
            }

        }



        int temp=a[--f];
        a[f]=a[pivot];
        a[pivot]=temp;

        return f;




    }
}
