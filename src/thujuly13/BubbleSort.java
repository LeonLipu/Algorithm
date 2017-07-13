package thujuly13;

import java.util.Arrays;

/**
 * Created by brkar on 7/13/2017.
 */
public class BubbleSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         BubbleS(a);

        System.out.println(Arrays.asList(a));
    }

    private static void BubbleS(Integer[] a) {

        for (int i = 0; i <a.length-1 ; i++) {

            for (int j = i+1; j <a.length ; j++) {

                if(a[i]>a[j]){

                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }



        }
    }
}
