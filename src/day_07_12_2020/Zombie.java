package day_07_12_2020;

import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day = 0 ;
        for (inhabitants=inhabitants; inhabitants>0; ){

            System.out.println("Day "+ day++ + " ["+inhabitants +"]"  );
            inhabitants=inhabitants/2;
        }
        System.out.println("---- EXTINCT ----");
       /* while(inhabitants>0){
            System.out.println("Day "+ day++ + " ["+inhabitants +"]"  );
            inhabitants = inhabitants /2 ;
        }
        System.out.println("---- EXTINCT ----");*/


    }
}
