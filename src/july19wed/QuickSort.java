package july19wed;

import java.util.Arrays;

/**
 * Created by brkar on 7/19/2017.
 */
public class QuickSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         QuickS(a,0,a.length-1);
        System.out.println(Arrays.asList(a));
    }

    private static void QuickS(Integer[] a, int i, int l) {

        if(i>=l)
            return;

        int p=partition(a,i,l);
        QuickS(a,i,p-1);
        QuickS(a,p+1,l);
    }

    private static int partition(Integer[] a, int i, int l) {

        int pivot =a[i];
        int n=i++;

        while(i<=l)
            if(a[i]<pivot)
                i++;
        else
            if(a[l]>pivot)
                l--;
        else
            {
                int t=a[i];
                a[i]=a[l];
                a[l]=t;
            }

        int t=a[--i];
        a[i]=a[n];
        a[n]=t;
        return i;
    }
}
