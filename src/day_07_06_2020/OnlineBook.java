package day_07_06_2020;

import java.util.Scanner;

public class OnlineBook {
    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        int free = 0;
        if (isPremiumCustomer){
            free= (nbooksPurchased/5)+(nbooksPurchased/7);
        }else {
            free = (nbooksPurchased/7)+(nbooksPurchased/12);
        }
        System.out.println(free);

    }
}
