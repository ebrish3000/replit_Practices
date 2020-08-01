package day_07_19_2020_Methods;

import java.util.Scanner;

public class UniqueNumber_122 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        for (int i = 0; i <= nums.length - 1; i++) {
            int num1 = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                int element = nums[j];
                if (element == num1) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println(num1);
            }
        }


    }
}
