package mon17july;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 17/07/17.
 */
public class QuickSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         QuickS(a,0,a.length-1);
         System.out.println(Arrays.asList(a));

    }

    private static void QuickS(Integer[] a, int i, int l) {

        if (i>=l) {
            return;
        }

        int pivot=partition(a,i,l);
        QuickS(a,i,pivot-1);
        QuickS(a,pivot+1,l);

    }

    private static int partition(Integer[] a, int i, int l) {

        int pi=i++;
        int p =a[pi];

        while(i<=l)
        {

            if(a[i]<p)
                i++;
            else if (a[l]>p) {
                l--;
            }else
            {
                int temp=a[i];
                a[i]=a[l];
                a[l]=temp;
                i++;
                l--;
            }



        }

        int temp=a[--i];
        a[i]=a[pi];
        a[pi]=temp;


        return i;

    }

}
