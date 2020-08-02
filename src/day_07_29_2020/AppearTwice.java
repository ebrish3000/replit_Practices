package day_07_29_2020;

public class AppearTwice {
    public static void main(String[] args) {



    }
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes
        String[] arr = sentence.split(" ");
        int count = 0;
        for (String each : arr) {
            if (each.equals(target)) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }


    }
}
