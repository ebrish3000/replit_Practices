package day_07_19_2020_Methods;

import java.util.Scanner;

public class ShortestString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortest = "";
        int min = 100;
        for (String each : str) {
            if (each.length() < min) {
                min = each.length();
                shortest = each;
            }
        }
        System.out.println(shortest);
    }
}
