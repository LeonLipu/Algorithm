package aug3thus;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 03/08/17.
 */
public class Insetionsort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         InsetionM(a);
         System.out.println(Arrays.asList(a));
    }

    private static void InsetionM(Integer[] a) {
        for (int i = 1; i < a.length; i++) {
            int j=i-1;
            int element =a[i];
            while(j>=0 && element<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[++j]=element;

        }
    }
}
