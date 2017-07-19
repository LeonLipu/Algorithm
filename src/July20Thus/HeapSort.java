package July20Thus;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 20/07/17.
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

        for (int i = l/2 - 1; i >= 0; i--) {

            int k=2*i;

            k=a[k+1]>a[k+2]?k+1:k+2;

            if (a[k]>a[i]) {
                int t=a[k];
                a[k]=a[i];
                a[i]=t;
            }


        }

        int t=a[0];
        a[0]=a[l];
        a[l]=t;
        HeapS(a,l-1);

    }
}
