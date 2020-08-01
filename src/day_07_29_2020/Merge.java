package day_07_29_2020;

import java.util.Arrays;

public class Merge {

    public static int[] mergR(int[] a,int[] b) {

        int[] merge = new int[a.length + b.length];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            merge[k] = a[i];
            k++;
        }
        for (int j = 0; j < b.length; j++) {
            merge[k] = b[j];
            k++;
        }
        return merge;


    }//end mergR

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int [] arr3 = mergR(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

}
