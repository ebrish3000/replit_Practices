package day_07_21_2020;

import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int count = 0;
        for (int each : nums) {
            if (each % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
