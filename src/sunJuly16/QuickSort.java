package sunJuly16;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 16/07/17.
 */
public class QuickSort {
    public static void main(String[] args) {

         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         QuickS(a,0,a.length-1);

         System.out.println(Arrays.asList(a));

    }

    private static void QuickS(Integer[] a, int i, int l) {

        if(i>=l)
            return;

        int pivot=partition(a,i,l);

        QuickS(a,i,pivot-1);
        QuickS(a,pivot+1,l);

    }

    private static int partition(Integer[] a, int i, int l) {

        int pivot=a[i];
        int pivotIndex=i;

        int j=i+1;

       while(j<=l)
       {

           if(a[j]<pivot)
               j++;
           else if (a[l]>pivot)
               l--;
           else{

               int temp=a[j];
               a[j]=a[l];
               a[l]=temp;
               j++;
               l--;
           }

       }

       a[pivotIndex]=a[--j];
       a[j]=pivot;

       return j;




    }
}
