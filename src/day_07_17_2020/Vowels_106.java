package day_07_17_2020;

import java.util.Scanner;

public class Vowels_106 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char vowels = word.charAt(i);
            if (vowels == 'a' || vowels == 'o' || vowels == 'i'
                    || vowels == 'e' || vowels == 'u') {
                System.out.print(vowels);
            }
        }



    }
}
