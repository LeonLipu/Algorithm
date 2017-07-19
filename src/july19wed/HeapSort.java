package july19wed;

import java.util.Arrays;

/**
 * Created by brkar on 7/19/2017.
 */
public class HeapSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         HeapS(a,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void HeapS(Integer[] a, int l) {

        if(l<=0)
            return;
        for (int i = l/2 - 1; i >= 0; i--) {

            int k=2*i;
            int j=a[k+1]>a[k+2]?k+1:k+2;

            if (a[j]>a[i]) {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }

        int i=0;
        int t=a[l];
        a[l]=a[i];
        a[i]=t;

    }
}
