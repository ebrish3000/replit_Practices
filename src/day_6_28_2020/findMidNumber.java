package day_6_28_2020;

import java.util.Scanner;
/*
Steps to write a program:
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.

Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */
public class findMidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number.");
        int num1 = input.nextInt();
        System.out.println("Enter second number.");
        int num2 = input.nextInt();
        System.out.println("Enter third number.");
        int num3 = input.nextInt();
        input.close();
        boolean a1 = (num1>num2&& num1<num3)||(num1>num3&& num1<num2);
        boolean b1 = (num2>num1&& num2<num3)||(num2>num3&& num2<num1);
        boolean c1 = (num3>num2&& num3<num1)||(num3>num1&& num3<num2);

        if (a1){
            System.out.println("Medium value is: "+num1);
        }else if (b1){
            System.out.println("Medium value is: "+num2);
        }else {
            System.out.println("Medium value is: " + num3);
        }

    }
}
