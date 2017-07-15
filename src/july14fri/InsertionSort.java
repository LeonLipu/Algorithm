package july14fri;

import java.util.Arrays;

/**
 * Created by brkar on 7/14/2017.
 */
public class InsertionSort {


    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

         InserS(a);
        System.out.println(Arrays.asList(a));

    }

    private static void InserS(Integer[] a) {

        for (int i = 1; i <a.length ; i++) {

            int j=i-1;
            int key=a[i];
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[++j]=key;

        }

    }
}
