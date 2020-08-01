package day_07_22_2020;

import java.util.Scanner;

public class AverageTemp_128 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (k = 0; k <= temps.length - 1; k++) {
            total += temps[k];
            avgTemp = total / (k+1);
        }
        System.out.println(avgTemp);
    }

}
