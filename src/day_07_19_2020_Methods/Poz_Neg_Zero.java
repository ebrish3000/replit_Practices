package day_07_19_2020_Methods;

import java.util.Scanner;

public class Poz_Neg_Zero {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
    public static void plus_minus(int [] arr) {
        int countP = 0;
        int countN = 0;
        int countZ = 0;
        for (int each : arr) {
            if (each == 0) {
                countZ++;
            } else if (each > 0) {
                countP++;
            } else {
                countN++;
            }
        }
        System.out.println(countZ);
        System.out.println(countP);
        System.out.println(countN);
    }






}