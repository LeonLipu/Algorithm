package july21fri;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};     System.out.println(Arrays.asList(a));
         HeapS(a,a.length-1);
        System.out.println(Arrays.asList(a));
    }

    private static void HeapS(Integer[] a, int l) {
       //exit crateria

        if (l<=0) {
            return;
        }
        for (int i = l/2- 1; i >= 0; i--) {

            int j=2*i;
       //     System.out.println("parent is "+a[i]+"and children is "+a[j+1]+"and other is "+a[j+2]);
            j=a[j+1]>a[j+2]?j+1:j+2;

            if (a[i]<a[j]) {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }

        }

        int t=a[0];
        a[0]=a[l];
        a[l]=t;
        HeapS(a,l-1);
    }
}
