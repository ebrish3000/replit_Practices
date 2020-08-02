package day_07_29_2020;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

    }
    public static boolean isSort(int[] nums)
    {  for(int i =0; i < nums.length-1; i++){
        if(nums[i] > nums[i+1]){
            return false;
        }
    }return true;

    }


    public static String[] reverse(String[] arr) {
        //write your codes here
        String[] reverseArr = new String[arr.length];
        int k=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[k] = arr[i];
            k++;
        }
return reverseArr;
    }

}
