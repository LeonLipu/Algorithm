package wedjuly;

import java.util.Arrays;

/**
 * Created by brkar on 7/12/2017.
 */
public class quicksort {


    public static void main(String[] args) {

 Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

        quickS(a,0,a.length-1);

        System.out.println(Arrays.asList(a));


    }

    private static void quickS(Integer[] a, int i, int l) {


        if(i>=l)
            return;
        int pivot=partition(a,i,l);
        quickS(a,i,pivot-1);
        quickS(a,pivot+1,l);
    }

    private static int partition(Integer[] a, int i, int l) {


        int p =i++;


        while(i<=l){


            if(a[i]<a[p])
                i++;
            else
                if (a[l]>a[p])
                    l--;
                            else
                                if(i<l)
                                {

                                    System.out.println(" intial index "+i +" and end index is "+l);
                                    int temp=a[i];
                                    a[i]=a[l];
                                    a[l]=temp;
                                    i++;
                                    l--;
                                }

        }

        i--;

        int temp=a[p];
        a[p]=a[i];
        a[i]=temp;
return  i;

    }
}
