package day_07_06_2020;

import java.util.Scanner;
/*  Display message: Select screen size:             input: 13.3
Display message: Select CPU type:                 input: i7
Display message: Select RAM size:                     input: 8
Display message: Select storage type:             input: SSD
Display message: Enter memory size:               input: 1000
Display message: Enter screen resolution:            input: 4K
Display message: Laptop price is: $1050.0                  */
public class LaptopPrice {
    public static void main(String[] args) {

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        int memorySize=0;

        System.out.println("Select screen size: ");
        double screenSize = scan.nextDouble();

        if(screenSize==13.3){
            price+=200;
        }else if (screenSize==15.0){
            price+=300;
        }else if (screenSize==17.3){
            price+=400;
        }

        System.out.println("Select CPU type: ");
        cpu = scan.next();
        if(cpu.equalsIgnoreCase("i3")){
            price+=150;
        }else if (cpu.equalsIgnoreCase("i5")){
            price+=250;
        }else if (cpu.equalsIgnoreCase("i7")){
            price+=350;
        }

        System.out.println("Select RAM size: ");
        ram=scan.nextInt();
        price+=(ram/4)*50;

        System.out.println("Select storage type: ");
        storageType=scan.next();
        System.out.println("Enter memory size: ");
        memorySize = scan.nextInt();


        if(storageType.equalsIgnoreCase("HDD")){
            price+=(memorySize/500)*50;

        }else if(storageType.equalsIgnoreCase("SSD")){
            price+=(memorySize/500)*100;
        }


        System.out.println("Enter screen resolution: ");
        screenType=scan.next();
        if (screenType.equalsIgnoreCase("FULLHD")){
            price+=100;
        }else if (screenType.equalsIgnoreCase("4K")){
            price+=200;
        }
        System.out.println("Laptop price is: $"+price);









    }
}
