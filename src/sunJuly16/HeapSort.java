package sunJuly16;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 16/07/17.
 */
public class HeapSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         HeapS(a,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void HeapS(Integer[] a, int l) {

        if (l<=0)
            return;

        for (int j = l/2-1; j >=0 ; j--) {

            int index=a[2*j+1]>a[2*j+2]?2*j+1:2*j+2;

            if(a[index]>a[j]){
                int temp=a[index];
                a[index]=a[j];
                a[j]=temp;
            }
        }

        int temp=a[0];
        a[0]=a[l];
        a[l]=temp;

        HeapS(a,l-1);


    }
}
