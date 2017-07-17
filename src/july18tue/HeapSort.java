package july18tue;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 18/07/17.
 */
public class HeapSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         HeapS(a,a.length-1);

         System.out.println(Arrays.asList(a));
    }

    private static void HeapS(Integer[] a, int l) {

        if (l<=0) {
            return;
        }

        int p=0;
        for (int i = l/2 - 1; i >= 0; i--) {

            int n=a[2*i+1]>a[2*i+2]?2*i+1:2*i+2;

            if (a[n]>a[i]) {
                int t=a[i];
                a[i]=a[n];
                a[n]=t;
            }

        }

        int t=a[p];
        a[p]=a[l];
        a[l]=t;

        HeapS(a,l-1);




    }
}
