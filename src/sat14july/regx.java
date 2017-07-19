package sat14july;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by brkar on 7/15/2017.
 */
public class regx {

    public static void main(String[] args) {

        // It is for extracting value
        Pattern p =Pattern.compile("br.*");
        Matcher match=p.matcher("brahma");

      if (match.find()){
          System.out.println(match.group(0));
      }


      // for Matches

        boolean flag =Pattern.matches(".s","as");
        System.out.println("match condition is "+flag);





    }

}
