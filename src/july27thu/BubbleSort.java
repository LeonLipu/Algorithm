package july27thu;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 27/07/17.
 */
public class BubbleSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         BubbleM(a);
         System.out.println(Arrays.asList(a));
    }

    private static void BubbleM(Integer[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length-1-i; j++) {

                if (a[j+1]<a[j]) {
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }

            }
        }
    }
}
