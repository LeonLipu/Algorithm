import java.util.Arrays;

/**
 * Created by brahmanandakar on 09/07/17.
 */
public class mergeSort {

    public static void main(String[] args) {
        Integer [] a={12,32,34,33,54,34,35,26,43,88,45};


        mergeS(a,0,a.length-1);

        System.out.println(Arrays.asList(a));


    }

    private static void mergeS(Integer[] a, int i, int l) {

        if(i>=l)
            return;

        int m=(i+l)/2;
        mergeS(a,i,m);
        mergeS(a,m+1,l);
        merge(a,i,m,l);


    }

    private static void merge(Integer[] a, int i, int m, int l) {

        Integer [] na=new Integer[l-i+1];

        int fi=i;
        int fl=m;
        int si=m+1;
        int sl=l;
        int k=0;

        while(fi<=fl || si<=sl)
        {

            while(fi<=fl && si<=sl)
            {
                if(a[fi]>a[si]){
                    na[k++]=a[si++];
                }else
                    na[k++]=a[fi++];
            }

            if(fi<=fl)
            {
                na[k++]=a[fi++];
            }else
                na[k++]=a[si++];
        }

        int p=0;
        for(int j=i;j<=l;j++)
            a[j]=na[p++];


    }


}
