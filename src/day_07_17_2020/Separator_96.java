package day_07_17_2020;

import java.util.Scanner;

public class Separator_96 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String result = "";
        for(int i = 1; i < count; i++){
            result += word + separator;
        }
        result += word;
        System.out.println(result);


    }
}
