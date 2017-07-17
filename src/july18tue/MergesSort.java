package july18tue;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 17/07/17.
 */
public class MergesSort {

    public static void main(String[] args) {
        
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         MergeS(a,0,a.length-1);
        System.out.println(Arrays.asList(a));;
        
    }

    private static void MergeS(Integer[] a, int i, int l) {

        if (i>=l) {
            return;
        }
        
        int m=(i+l)/2;
        MergeS(a,i,m);
        MergeS(a,m+1,l);
        Merge(a,i,m,l);
        
        
        
        
    }

    private static void Merge(Integer[] a, int i, int m, int l) {

      int fi=i;
      int fl=m;
      int si=m+1;
      int sl=l;
      int k=0;
      Integer[] na=new Integer[l-i+1];

      while(si<=sl || fi<=fl){


          while(si<=sl && fi<=fl) {
              if (a[fi] < a[si])
                  na[k++] = a[fi++];
              else
                  na[k++] = a[si++];
          }

              if(si<=sl)
                  na[k++]=a[si++];
               else
                  na[k++]=a[fi++];
      }


      k=0;
        for (int j = i; j <=l ; j++) {

            a[j]=na[k++];
        }



    }

}
