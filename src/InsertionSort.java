import java.util.Arrays;

/**
 * Created by brahmanandakar on 09/07/17.
 */
public class InsertionSort {

    public static void main(String[] args) {
        Integer [] arr={12,32,34,33,54,34,35,26,43,88,45};

        InserSort(arr);

    }

    private static void InserSort(Integer[] a) {


        for(int i=1;i<a.length;i++){

             int key=a[i];
             int j=i-1;


             if(j>=0 && a[j]>key){

                 while(j>=0 && a[j]>key){

                     a[j+1]=a[j];
                     j--;
                 }
                 j++;

                 a[j]=key;

             }





        }


        System.out.println(Arrays.asList(a));





    }


}
