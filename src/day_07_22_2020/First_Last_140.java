package day_07_22_2020;

import java.util.Arrays;
import java.util.Scanner;

public class First_Last_140 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        String[]arr = new String[words.length];
        for(int i=0;i<=words.length-1;i++){
            arr[i] = (words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
        }
        System.out.print(Arrays.toString(arr));


    }
}
