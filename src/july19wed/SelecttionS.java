package july19wed;

import java.util.Arrays;

/**
 * Created by brkar on 7/19/2017.
 */
public class SelecttionS {

    public static void main(String[] args) {

         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         SelectionS(a);
         System.out.println(Arrays.asList(a));
    }

    private static void SelectionS(Integer[] a) {

        for (int i = 0; i < a.length-1; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i]>a[j]) {

                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;

                }

            }
        }
    }
}


