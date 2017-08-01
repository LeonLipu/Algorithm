package Aug1tue;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         QuickM(a,0,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void QuickM(Integer[] a, int i, int l) {
        if (i>=l) {
            return;
        }
        int p=partition(a,i,l);
        QuickM(a,i,p-1);
        QuickM(a,p+1,l);
    }

    private static int partition(Integer[] a, int i, int l) {
        int p=i;
        int element=a[i++];
        while(i<=l){

            if(a[i]<element)
                i++;
            else if(a[l]>element)
                l--;
            else
            {
                int t=a[i];
                a[i]=a[l];
                a[l]=t;
                i++;
                l--;
            }

        }

        int t=a[p];
        a[p]=a[--i];
        a[i]=t;
        return i;

    }
}
