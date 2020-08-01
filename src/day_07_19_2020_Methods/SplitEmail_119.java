package day_07_19_2020_Methods;

import java.util.Scanner;

public class SplitEmail_119 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        if (!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@")){
            System.out.println("invalid email");
        }
        else {
            String []emailInfo= email.split("@");
            System.out.println("Email id: "+emailInfo[0]);
            System.out.println("Email domain: "+emailInfo[1]);
        }




    }
}
