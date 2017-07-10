import java.util.Arrays;

/**
 * Created by brahmanandakar on 09/07/17.
 */
public class SelectionSort {

    public static void main(String[] args) {


        Integer [] arr={12,32,34,33,54,34,35,26,43,88,45};

        BubbleSort(arr);


    }

    private static void BubbleSort(Integer[] arr) {


        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    //swap
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.asList(arr));
    }
}
