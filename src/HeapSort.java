import java.util.Arrays;

/**
 * Created by brahmanandakar on 12/07/17.
 */
public class HeapSort {
    public static void main(String[] args) {
        Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

        Heapsort(a,0,a.length-1);



    }

    private static void Heapsort(Integer[] a, int i, int l) {


        heapify(a,l);
        System.out.println(Arrays.asList(a));



    }

    private static void heapify(Integer[] a, int l) {

     if(l<=0)
         return;

        for(int i=(l/2)-1;i>=0;i--){

            int left=a[2*i+1];
            int right =a[2*i+2];

            int bigIndex=left>right? 2*i+1:2*i+2;

            if(a[bigIndex]>a[i]){
                int temp =a [bigIndex];
                a[bigIndex]=a[i];
                a[i]=temp;
            }

        }

        int temp=a[0];
        a[0]=a[l];
        a[l]=temp;


       heapify(a,--l);




    }
}
