package day_07_12_2020;

import java.util.*;

public class Max {
    public static void main(String[] args) {
/*
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
        }
        System.out.println("The sum of the numbers is: "+sum);
        double average = sum / (double) arr.length;
        System.out.println("Average number is: "+ average);
 */
        Scanner
                input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and get the sum of the numbers

        //TODO: Write your code below
        int max = 237900000;
        for (int i = nums.length - 1; i > 0; i--) {

            if (nums[i] > max) {
                max = nums[i];
            }


        }
        System.out.println(max);
    }
}
