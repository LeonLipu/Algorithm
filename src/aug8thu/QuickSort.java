package aug8thu;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 08/08/17.
 */
public class QuickSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         QuickM(a,0,a.length-1);
         System.out.println(Arrays.asList(a));

    }

    private static void QuickM(Integer[] a, int i, int l) {
        if (i>=l) {
            return;
        }
        int p=partion(a,i,l);
        QuickM(a,i,p-1);
        QuickM(a,p+1,l);

    }

    private static int partion(Integer[] a, int i, int l) {

        int j=i+1;
        int element=a[i];

        while(j<=l)
            if(a[j]<element)
                j++;
        else
            if(a[l]>element)
                l--;
        else {
            int t=a[j];
            a[j]=a[l];
            a[l]=t;
            j++;
            l--;
            }

            a[i]=a[--j];
        a[j]=element;
        return j;


    }
}
