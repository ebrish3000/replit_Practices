package day_07_25_2020;
/*
int[] arr = {1,1,2,3,3, 1 , 4 , 5, 6, 7, 8, 9};

        for(int b: arr){

            int count = 0; // for the frequency of num in the arr
            for( int each : arr ){ // for counting the frequency of num
                if(each == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(b);
            }

        }

 */
import java.util.Scanner;

public class UniqueNumber {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){



            //WRITE YOUR CODE HERE
            for(int b: nums){

                int count = 0; // for the frequency of num in the arr
                for( int each : nums ){ // for counting the frequency of num
                    if(each == b){
                        count++;
                    }
                }
                if(count == 1){
                    System.out.println(b);
                }

            }

        }
    }

