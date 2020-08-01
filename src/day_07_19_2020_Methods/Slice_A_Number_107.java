package day_07_19_2020_Methods;

import java.util.Scanner;

public class Slice_A_Number_107 {
    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        num = input.nextInt();


        System.out.println("===========version1============");
        digit1 = num % 100000 / 10000;
        System.out.println(digit1);

        digit2 = num % 10000 / 1000;
        System.out.println(digit2);

        digit3 = num % 1000 / 100;
        System.out.println(digit3);

        digit4 = num % 100 / 10;
        System.out.println(digit4);

        digit5 = num % 10;
        System.out.println(digit5);

        System.out.println("===========version2============");
        //this part can be used for any digit number simply by changing  5 to user entered number.

        System.out.println("Enter your number:");
        num = input.nextInt();
        for (int i = 5; i > 0; i--) {
            if (i - 1 != 0) {
                System.out.println((int) (num % Math.pow(10, i) / Math.pow(10, i - 1)));
            } else {
                System.out.println((int) (num % Math.pow(10, i)));
            }
        }

        System.out.println("===========version3============");

        System.out.println("Enter your number:");
        String nums = input.next();
        String[] numStr = nums.split("");
        for(String each : numStr){
            System.out.println(each);

        }


    }
}
