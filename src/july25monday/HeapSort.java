package july25monday;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 25/07/17.
 */
public class HeapSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         HeapM(a,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void HeapM(Integer[] a, int l) {
        if (l<=0) {
            return;
        }

        for (int i = l/2 - 1; i >= 0; i--) {

            int j=2*i;
            j=a[j+1]>a[j+2]?j+1:j+2;
            if(a[j]>a[i])
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }

        }

        int t=a[0];
        a[0]=a[l];
        a[l]=t;
        HeapM(a,l-1);

    }
}
