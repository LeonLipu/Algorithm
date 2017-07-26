package july27thu;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 27/07/17.
 */
public class QuickSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         QuickM(a,0,a.length-1);

         System.out.println(Arrays.asList(a));
    }

    private static void QuickM(Integer[] a, int i, int l) {

        if (i>=l) {
            return;
        }
        int p=partiontion(a,i,l);
        QuickM(a,i,p-1);
        QuickM(a,p+1,l);


    }

    private static int partiontion(Integer[] a, int i, int l) {

        int j=i;
        int p=a[i++];


        while(i<=l){
            if (a[i]<p) {
                i++;
            }
            else
                if(a[l]>p)
                    l--;
            else
                {
                    int t=a[i];
                    a[i]=a[l];
                    a[l]=t;
                    i++;
                    l--;
                }

        }

        int t=a[--i];
        a[i]=p;
        a[j]=t;
        return i;


    }
}
