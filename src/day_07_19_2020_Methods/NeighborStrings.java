package day_07_19_2020_Methods;

import java.util.Scanner;

public class NeighborStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below
        for (int i = 0; i < arr.length; i++) {

        }
      /*  System.out.print(arr[0]+ ", "+arr[1]+ ", " + arr[2]);
        System.out.println();
        System.out.print(arr[1]+ ", "+arr[2]+ ", " + arr[3]);
        System.out.println();
        System.out.print(arr[2]+ ", "+arr[3]+ ", " + arr[4]);
        System.out.println();
        System.out.print(arr[3]+ ", "+arr[4]+ ", " + arr[5]);*/
        for(int n= 0; n <= arr.length-3; n++){
            System.out.println(arr[n]+ " , "+arr[n+1]+" , "+arr[n+2]);
        }






    }
}
