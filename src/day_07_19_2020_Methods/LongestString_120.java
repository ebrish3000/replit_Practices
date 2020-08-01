package day_07_19_2020_Methods;

import java.util.Scanner;

public class LongestString_120 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        String longest="";
        int max=0;
        for (String each: words){
            if (each.length()>max){
                max=each.length();
                longest=each;
            }
        }
        System.out.print(longest);



    }
}
