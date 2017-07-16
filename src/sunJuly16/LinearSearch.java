package sunJuly16;

/**
 * Created by brahmanandakar on 16/07/17.
 */
public class LinearSearch {

    public static void main(String[] args) {


         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};


        System.out.println(LinearS(a, 33));
        System.out.println(LinearS(a, 31));


    }

    private static boolean LinearS(Integer[] a, int i) {

        for (int j = 0; j < a.length; j++) {


            if(a[j]==i)
                return true;
        }

        return false;
    }


}
