package day_6_28_2020;

import java.util.Scanner;

/*
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items


 */
public class OnlineShopping_100$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        if (item.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equalsIgnoreCase("Charger")){
            System.out.println("Your current balance is: 85$");
        }else if(item.equalsIgnoreCase("USB cable")){
            System.out.println("Your current balance is: 90$");
        }else if(item.equalsIgnoreCase("Headphones")){
            System.out.println("Your current balance is: 70$");
        }else if(item.equalsIgnoreCase("Pants")) {
            System.out.println("Your current balance is: 50$");
        }else if(item.equalsIgnoreCase("Hat")){
            System.out.println("Your current balance is: 75$");
        }else if(item.equalsIgnoreCase("Socks")) {
            System.out.println("Your current balance is: 95$");
        }else if(item.equalsIgnoreCase("Blanket")){
            System.out.println("Your current balance is: 40$");
        }else if(item.equalsIgnoreCase("Pillow")) {
            System.out.println("Your current balance is: 60$");
        }else{
            System.out.println("Invalid item!");
        }



    }
}
