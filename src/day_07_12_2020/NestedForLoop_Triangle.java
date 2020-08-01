package day_07_12_2020;

import java.util.Scanner;

public class NestedForLoop_Triangle {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (i = 0; i < j; i++) {
            for (j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }
}
