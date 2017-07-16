package mon17july;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 17/07/17.
 */
public class HeapSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         heapS(a,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void heapS(Integer[] a, int l) {
        if (l<=0) {
            return;
        }

        for (int i = l/2-1; i >= 0; i--) {

            int j=a[2*i+1]>a[2*i+2]?2*i+1:2*i+2;

            if (a[j]>a[i]) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        int temp=a[0];
        a[0]=a[l];
        a[l]=temp;
        heapS(a,l-1);
    }

}
