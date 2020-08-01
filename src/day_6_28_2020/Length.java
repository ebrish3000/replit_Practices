package day_6_28_2020;

import java.util.Scanner;
/*
Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */
public class Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text:");
       String text = input.nextLine();
        // length() ==> int
       int l =   text.length();

       System.out.println(l);


        String txt = "foo bar";
        //your code here
        int x  = txt.indexOf("b");
        int y = txt.indexOf("foo");
        System.out.println(x);
        System.out.println(y);







    }
}
