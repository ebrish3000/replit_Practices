package day_07_25_2020;

public class Reverse {
    public static void main(String[] args) {
        String name = reverse("ebrahim");
        System.out.println(name);
    }
    public static String reverse(String input) {
        String reversed = "";
        for (int i =input.length()-1; i>=0; i--){
            char ch = input.charAt(i);
            reversed+=ch;
        }
        return reversed;
    }
}
