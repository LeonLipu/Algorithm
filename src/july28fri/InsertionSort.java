package july28fri;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         InterstionM(a);
         System.out.println(Arrays.asList(a));
    }

    private static void InterstionM(Integer[] a) {
        for (int i = 1; i < a.length; i++) {
            int j=i-1;
            int element=a[i];
            while(j>=0 && element<a[j])
            {
                a[j+1]=a[j];
                j--;
            }

            a[++j]=element;
        }
    }
}
