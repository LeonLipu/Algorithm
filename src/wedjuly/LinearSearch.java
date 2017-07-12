package wedjuly;

/**
 * Created by brahmanandakar on 12/07/17.
 */
public class LinearSearch {

    public static void main(String[] args) {
 Integer [] a={12,32,33,8,54,34,35,26,43,88,45};

        System.out.println(Search(a, 88));
    }

    private static boolean Search(Integer[] a, int i) {


        for (int k=0;k<a.length;k++){
            if (a[k]==i)
                return true;
        }

        return false;


    }

}
