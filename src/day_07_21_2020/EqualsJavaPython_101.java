package day_07_21_2020;

import java.util.Scanner;

public class EqualsJavaPython_101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {
            String java = sentence.substring(i, i + 4);
            if (java.equals("java")) {
                countJava++;
            }
        }
        int countPhython = 0;
        for (int i = 0; i <= sentence.length() - 6; i++) {
            String python = sentence.substring(i, i + 6);
            if (python.equals("python")) {
                countPhython++;
            }
        }
        System.out.println(countJava==countPhython);
    }
}
