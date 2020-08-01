package day_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Shortest_126 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");
        String result="";
        int min = words[0].length();

        for(String each : words){
            if(each.length() < min){
                min = each.length();
            }
        }
        for(String each : words){
            if(each.length()==min){
                result += each +",";
            }
        }
        String[] resultStr = result.split(",");
        Arrays.sort(resultStr);
        System.out.println(Arrays.toString(resultStr));
    }
}
