package day_07_19_2020_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumArray_124 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        for (int i = nums.length - 1; i >= 0; i--) {
           // System.out.println(nums[i]);
        }
        int seven=  nums[0];
        nums[0] = nums[6];
        nums[6] = seven;

        int six = nums[1];
        nums[1] = nums[5];
        nums[5] = six;

       int fife = nums[2];
        nums[2] = nums[4];
        nums[4] = fife;




        //Do not change below statement:
        System.out.println(Arrays.toString(nums));


    }
}
