package day_07_21_2020;

import java.util.Scanner;

public class HTML_102 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        if (html.contains("<html>")) {
            int indexOfId = html.indexOf("id=");
            int bIndex = indexOfId + 4;
            int eIndex = html.indexOf("\"", bIndex);
            System.out.println(html.substring(bIndex, eIndex));
        } else {
            System.out.println("Invalid input!");
        }

    }
}
