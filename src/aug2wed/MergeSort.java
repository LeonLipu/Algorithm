package aug2wed;

import java.util.Arrays;

/**
 * Created by brahmanandakar on 02/08/17.
 */
public class MergeSort {
    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         Merge(a,0,a.length-1);
         System.out.println(Arrays.asList(a));
    }

    private static void Merge(Integer[] a, int i, int l) {
        if (i>=l) {
            return;
        }

        int m=(i+l)/2;


        Merge(a,i,m);
        Merge(a,m+1,l);
        Mer(a,i,m,l);
    }

    private static void Mer(Integer[] a, int i, int m, int l) {

        int k=0;
        Integer [] na=new Integer[l-i+1];

        int fi=i;
        int fl=m;
        int si=m+1;
        int sl=l;

        while(fi<=fl || si<=sl){
            while(fi<=fl && si<=sl){
                if (a[fi]<a[si]) {
                    na[k++]=a[fi++];
                }
                else
                    na[k++]=a[si++];

            }


            if(fi<=fl)
                na[k++]=a[fi++];
            else
                na[k++]=a[si++];
        }


        for (int j = i; j <=l ; j++) {
            a[j]=na[j-i];

        }



    }
}
