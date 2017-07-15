package july14fri;

import java.util.Arrays;

/**
 * Created by brkar on 7/14/2017.
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
        for (int i = l/2-1; i >=0 ; i--) {

            int index=a[2*i+1]>a[2*i+2]?2*i+1:2*i+2;
            if(a[index]>a[i])
            {
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }

        }

        int temp=a[0];
        a[0]=a[l];
        a[l]=temp;
        HeapS(a,l-1);


    }
}
