package july22sat;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 22/07/17.
 */
public class SelectionSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         SelectionS(a);
         System.out.println(Arrays.asList(a));
    }

    private static void SelectionS(Integer[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i]>a[j]) {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }

            }
        }
    }
}
