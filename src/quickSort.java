import java.util.Arrays;

/**
 * Created by brahmanandakar on 10/07/17.
 */
public class quickSort {


    public static void main(String[] args) {
        Integer [] a={12,32,34,33,54,34,35,26,43,88,45};


        quick(a,0,a.length-1);
        System.out.println(Arrays.asList(a));
    }

    private static void quick(Integer[] a, int i, int l) {



        if(i>=l)
            return;


        int pi=part(a,i,l);

        quick(a,i,pi-1);
        quick(a,pi+1,l);



    }

    private static int part(Integer[] a,int i,int l) {

        int pivot =a[i];

        while(i<l)
        {

            while(a[i]<pivot)
                i++;
            while(a[l]>pivot)
                l--;

            if(l>i)
            {
                int temp=a[i];
                a[i]=a[l];
                a[l]=temp;
                l--;
                i++;
            }


        }

        System.out.println("index"+i);

        return i;



    }
}
