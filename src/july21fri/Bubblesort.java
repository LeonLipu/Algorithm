package july21fri;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         BubbleSort(a);
         System.out.println(Arrays.asList(a));
    }

    private static void BubbleSort(Integer[] a) {


        for (int i = 1; i < a.length; i++) {

            for (int j = 0; j < a.length-i; j++) {

                if (a[j+1]<a[j]) {
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }

        }
    }


}
