import java.util.Arrays;

/**
 * Created by brahmanandakar on 10/07/17.
 */
public class quickSort {


    public static void main(String[] args) {
        Integer [] a={12,32,33,8,54,34,35,26,43,88,45};


        quick(a,0,a.length-1);
        System.out.println(Arrays.asList(a));
    }

    private static void quick(Integer[] a, int i, int l) {



        if(i>l)
            return;


        int pi=part(a,i,l);

        quick(a,i,pi-1);
        quick(a,pi+1,l);



    }

    private static int part(Integer[] a,int i,int l) {



        int pivot =i++;



        while(i<=l)
        {

            if(a[i]<a[pivot] )
                i++;
            else if(a[l]>a[pivot] )
                l--;
            else if(l>i)
            {
                int temp=a[i];
                a[i]=a[l];
                a[l]=temp;
                l--;
                i++;
            }


        }
        i--;


           int temp=a[i];
           a[i]=a[pivot];
           a[pivot]=temp;
           pivot=i;





        System.out.println("index"+pivot);

        return pivot;



    }
}
