package day_07_21_2020;

import java.util.Scanner;

public class GetSandwich_100 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.contains("bread")) {
            int first = str.indexOf("bread");
            int last = str.lastIndexOf("bread");
            if (first == last) {
                System.out.println("nothing");
            } else {
                System.out.println(str.substring(first+5, last));
            }


        } else {
            System.out.println("nothing");
        }


    }
}
