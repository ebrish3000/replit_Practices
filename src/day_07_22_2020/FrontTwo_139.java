package day_07_22_2020;

import java.util.Arrays;
import java.util.Scanner;

public class FrontTwo_139 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] arrResult = new int[2];
        if (size > 1) {
            for (int i =0; i<num.length; i++) {
                int num1 = num[0];
                int num2 = num[1];
                arrResult[0] = num1;
                arrResult[1] = num2;

            }
            System.out.println(Arrays.toString(arrResult));

        } else {
            System.out.println(Arrays.toString(num));
        }


    }
}
