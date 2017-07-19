package sat14july;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by brkar on 7/15/2017.
 */
public class sumofarr {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         int sum=54+43;
        System.out.println(sum);


        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <a.length ; i++) {

            if(map.containsKey(a[i])){

                System.out.println(a[i]+" and other number is "+(sum-a[i]));

            }

            map.put(sum-a[i],a[i]);



        }



    }


}
