package july28fri;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         Heap(a,a.length-1);
         System.out.println(Arrays.asList(a));

    }

    private static void Heap(Integer[] a, int l) {
        if (l<=0) {
            return;
        }

        for (int i =l/2 - 1; i >= 0; i--) {
            int j=2*i+1;
            j=a[j]>a[j+1]?j:j+1;
            if (a[i]<a[j]) {
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
            }
        }
        int j=0;

        int t=a[j];
        a[j]=a[l];
        a[l]=t;

        Heap(a,l-1);
    }
}
