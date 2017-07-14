package sat14july;

/**
 * Created by brahmanandakar on 15/07/17.
 */
public class LinearSearch {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
        System.out.println(LinearS(a, 33));
        System.out.println(LinearS(a, 39));


    }

    private static boolean LinearS(Integer[] a, int i1) {

        for (int j = 0; j <a.length ; j++) {

            if (a[j]==i1)
                return true;
        }

return false;
    }

}
