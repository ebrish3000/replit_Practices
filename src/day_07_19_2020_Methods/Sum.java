package day_07_19_2020_Methods;

import java.util.Scanner;

public class Sum {


    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number");
        int num1 = scan.nextInt();
        System.out.print("Enter your second number");
        int num2 = scan.nextInt();
        System.out.println(num1+num2);


    }




}
