package day_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie_2_170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        //TODO. Write you code below this line.
        int day = 0;        // [3, 6, 0, 4, 3, 2, 7, 0]
        int[] cities = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            cities[i]  = inhabitants[i];
        }

        int[] extinct = new int[8];
        System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
        while (!Arrays.equals(inhabitants, extinct)) {
            if (inhabitants[1]==0){
                inhabitants[0] = inhabitants[0] / 2;
            }
            for (int i = 1; i < inhabitants.length - 1; i++) {
                if(cities[i - 1] != 0 && cities[i+1] != 0) {
                    continue;
                }
                if(cities[i - 1] == 0 || cities[i+1] == 0) {
                    if (inhabitants[i - 1] == 0 || inhabitants[i + 1] == 0) {
                        inhabitants[i] = inhabitants[i] / 2;
                    }
                }
            }
            if (inhabitants[6]==0){
                inhabitants[7] = inhabitants[7] / 2;
            }
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length; i++) {
                cities[i]  = inhabitants[i];
            }
        }
        System.out.println("---- EXTINCT ----");

    }
}
