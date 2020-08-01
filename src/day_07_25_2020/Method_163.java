package day_07_25_2020;

public class Method_163 {
    public static void main(String[] args) {


    }

    public static int  count_appearance(String[] arr,String t) {

        int count =0;
        for (String each : arr) {
            if (each == t) {
                count++;
            }
        }
        return count;
    } //end  count_appearance
}
