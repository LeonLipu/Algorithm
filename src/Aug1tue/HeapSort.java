package Aug1tue;

import java.util.Arrays;

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

            int j=2*i+1;
            j=a[j]>a[j+1]?j:j+1;
            if (a[j]>a[i]) {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;

            }

        }

        int j=0;
        int t=a[j];
        a[j]=a[l];
        a[l]=t;
        HeapS(a,l-1);
    }
}
