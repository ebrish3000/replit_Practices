package day_07_17_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int i = word.indexOf("java");
        int count = 0;
        while(i>=0){
            count++;
            i = word.indexOf("java",i+1);
        }
        System.out.println(count);
    }
}
