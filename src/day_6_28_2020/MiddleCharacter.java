package day_6_28_2020;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int l = word.length();
        char ch = word.charAt(0);
        int oddMid = (l-1)/2;//for odd
        char oddMidChar = word.charAt(oddMid);
        int evenMid1 = l/2;
        int evenMid2 = l/2+1;
        char evenMidChar1 = word.charAt(evenMid1);
        char evenMidChar2 = word.charAt(evenMid2);


        //char lastChar = name.charAt(lastIndexNumber);
        if (l == 1){
            System.out.println(word+word+word);
        }else if (l==2){
            System.out.println(word+word);
        }else if (l>=3 && l%2!=0){
            System.out.println(oddMidChar);

        }else{
            System.out.println(evenMidChar1+ ""+evenMidChar2);

        }




    }
}
