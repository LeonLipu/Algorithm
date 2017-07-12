package wedjuly;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 12/07/17.
 */
public class InsertionSort {


    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         InserS(a);

        System.out.println(Arrays.asList(a));
    }

    private static void InserS(Integer[] a) {

        for (int i = 1; i <a.length ; i++) {

            int e=a[i];
            int k=i;

            while(k>0 && e<a[k-1]){

                a[k]=a[k-1];
                k--;
            }

            a[k]=e;

        }


    }
}
