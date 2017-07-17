package july18tue;

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

        if(i>l)
            return;

        int p=partion(a,i,l);
        QuickS(a,i,p-1);
        QuickS(a,p+1,l);


    }

    private static int partion(Integer[] a, int i, int l) {

        int n=i++;

        while(i<=l)
        {
            if(a[i]<a[n])
                i++;
            else if(a[l]>a[n])
                l--;
            else
            {
                int t=a[i];
                a[i]=a[l];
                a[l]=t;
            }

        }

        i--;

        int t=a[n];
        a[n]=a[i];
        a[i]=t;


return i;

    }
}
