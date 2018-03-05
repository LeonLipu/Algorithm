package mar05;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 06/03/18.
 */
public class BubbleSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         BubblesortM(a);
        System.out.println(Arrays.asList(a));
    }

    private static void BubblesortM(Integer[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i]>a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];

                }
            }


        }
    }
}
