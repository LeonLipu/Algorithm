import java.util.Arrays;

/**
 * Created by brahmanandakar on 09/07/17.
 */
class selectionSort {

    public static void main(String[] args) {
        Integer [] arr={12,32,34,33,54,34,35,26,43,88,45};
        selection(arr);
    }

    private static void selection(Integer[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.asList(arr));

    }
}
