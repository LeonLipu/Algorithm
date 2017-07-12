package wedjuly;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 12/07/17.
 */
public class BubbleSort {

    public static void main(String[] args) {


         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         BobbleSort(a);


        System.out.println(Arrays.asList(a));

    }

    private static void BobbleSort(Integer[] a) {

        for (int i = 0; i <a.length-1 ; i++) {

            for (int j = 0; j <a.length-1-i ; j++) {


                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }

            }


        }
    }
}
