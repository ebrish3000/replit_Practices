package day_07_12_2020;

import java.util.Scanner;

public class ThreeChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items,  char[] ch = str.toCharArray();

        //write your code below:
        for(String each : arr){
            System.out.println(each.substring(0,3));
        }







    }
}
