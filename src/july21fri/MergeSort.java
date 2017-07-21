package july21fri;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
         Integer [] a={12,32,33,8,54,34,35,26,43,88,45};
         MergeS(a,0,a.length-1);
         System.out.println(Arrays.asList(a));

    }

    private static void MergeS(Integer[] a, int i, int l) {

        //exiting criteraia
        if (i>=l) {
            return;
        }
        //getting mid
        int mid =(i+l)/2;
        MergeS(a,i,mid);
        MergeS(a,mid+1,l);
        Merge(a,i,mid,l);
    }

    private static void Merge(Integer[] a, int i, int mid, int l) {

        int k=0;
        Integer[] na=new Integer[l-i+1];

        int fi=i;
        int fl=mid;
        int si=mid+1;
        int sl=l;

        while(fi<=fl || si<=sl){
            while(fi<=fl && si<=sl){

                if (a[fi]<a[si]) {
                    na[k++]=a[fi++];
                }
                else{
                    na[k++]=a[si++];
                }

            }

            if (fi<=fl) {
                na[k++]=a[fi++];
            }
            else
                na[k++]=a[si++];
        }

        for (int j = i; j <=l ; j++) {
            a[j]=na[j-i];
        }

    }
}
