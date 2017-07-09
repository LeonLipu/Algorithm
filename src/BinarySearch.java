/**
 * Created by brahmanandakar on 09/07/17.
 */
public class BinarySearch {

    public static void main(String[] args) {
        Integer []  arr={2, 4, 6, 8, 10, 12, 14, 16};

        boolean flag=biSearch(arr,0,arr.length-1,1);

        if(flag)
            System.out.println("number is found ");
        else
            System.out.println("number is not found ");
    }

    private static boolean biSearch(Integer[] arr,int i,int l, int n) {

    int mid =(l+i)/2;

        System.out.println(arr[mid]);

        System.out.println("the initall "+i +" and last index is "+ l);

    if(i>l)
        return false;
    if(n==arr[mid])
        return true;
    if(n>arr[mid])
       return biSearch(arr,mid+1,l,n);
    else
       return biSearch(arr,i,mid-1,n);


    }



}
