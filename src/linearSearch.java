/**
 * Created by brahmanandakar on 09/07/17.
 */
public class linearSearch {

    public static void main(String[] args) {


        Integer []  arr={2, 4, 6, 8, 10, 12, 14, 16};

        boolean r=linearSearch(arr,12);
       if(r)
           System.out.println("number found successfully ");
       else
           System.out.println("the number is not found ");

    }

   public static boolean linearSearch(Integer [] arr,int b){
        boolean flag=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==b)
            {
                flag=true;
                break;

            }


        }

        return flag;
    }



}
