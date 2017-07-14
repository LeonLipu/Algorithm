package sat14july;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 15/07/17.
 */
public class HeapSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         HeapS(a,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void HeapS(Integer[] a, int i) {

        if(i<=0)
            return;
        for (int j = (i/2)-1; j >=0 ; j--) {


            int l=2*j+1;
            int r=2*j+2;
            int n=a[l]>a[r]?l:r;

            if (a[n]>a[j]){
                int temp=a[j];
                a[j]=a[n];
                a[n]=temp;
            }

        }
        int temp=a[0];
        a[0]=a[i];
        a[i]=temp;

        HeapS(a,--i);

    }
}
