package day_07_26_2020;

import java.util.Arrays;

public class ExtractNumber {
    public static void main(String[] args) {
       String by= extractNum("ebr3ahim1989");
        System.out.println(by);
    }

    public static String extractNum(String s) {


        String [] arr = s.split("");
        String num = "";
        for (String each : arr) {
            if (each.equals("0") || each.equals("1") || each.equals("2") || each.equals("3") || each.equals("4")
                    || each.equals("5") || each.equals("6") || each.equals("7")
                    || each.equals("8") || each.equals("9")) {
                num += each;
            }
            }


        return num;
    }

}
