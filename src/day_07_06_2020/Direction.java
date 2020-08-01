package day_07_06_2020;

import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if (start.equalsIgnoreCase(end)){
            System.out.println(start +  " found");
        }else if( start.equalsIgnoreCase("A")){
            if (end.equalsIgnoreCase("B")){
                System.out.println("right: "+end+" found");
            }else if (end.equalsIgnoreCase("C")){
                System.out.println("right > down: "+end+" found");
            }else if (end.equalsIgnoreCase("D")){
                System.out.println("right > down > left: "+end+" found");
            }
        }else if (start.equalsIgnoreCase("B")){
            if (end.equalsIgnoreCase("C")){
                System.out.println("down: "+end+" found");
            }else if (end.equalsIgnoreCase("D")){
                System.out.println("down > left: "+end+" found");
            }else if (end.equalsIgnoreCase("A")){
                System.out.println("down > left > up: "+end+" found");
            }

        }else if (start.equalsIgnoreCase("C")){
            if (end.equalsIgnoreCase("D")){
                System.out.println("left: "+end+" found");
            }else if (end.equalsIgnoreCase("A")){
                System.out.println("left > up: "+end+" found");
            }else if (end.equalsIgnoreCase("B")){
                System.out.println("left > up > right: "+end+" found");
            }

        }else if (start.equalsIgnoreCase("D")){
            if (end.equalsIgnoreCase("A")){
                System.out.println("up: "+end+" found");
            }else if (end.equalsIgnoreCase("B")){
                System.out.println("up > right: "+end+" found");
            }else if (end.equalsIgnoreCase("C")){
                System.out.println("up > right > down: "+end+" found");
            }

        }

    }
}
