package july18tue;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 17/07/17.
 */
public class InsertionSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         InsertionS(a);
         System.out.println(Arrays.asList(a));
    }

    private static void InsertionS(Integer[] a) {

        for (int i = 1; i < a.length; i++) {

            int key=i-1;
            int value=a[i];

            while(key>=0 && a[key]>value){
                a[key+1]=a[key];
                key--;
            }

            a[key+1]=value;

        }
    }
}
