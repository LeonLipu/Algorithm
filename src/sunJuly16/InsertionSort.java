package sunJuly16;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 16/07/17.
 */
public class InsertionSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         InsertionS(a);
         System.out.println(Arrays.asList(a));

    }

    private static void InsertionS(Integer[] a) {


        for (int i = 1; i <a.length ; i++) {


            int j=i-1;

            int key=a[i];

            while(j>=0 && a[j]>key){

                a[j+1]=a[j];
                j--;

            }

            a[++j]=key;



        }
    }
}
