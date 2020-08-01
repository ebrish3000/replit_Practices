package day_07_25_2020;

public class Methods_178 {
    public static void main(String[] args) {
        String couples = mergeStrings("Ebrahim", "Samira");
        System.out.print(couples);

    }

    public static String mergeStrings(String one, String two) {
        String ch1 = "";
        String ch2 = "";
        for (int i = 0; i < one.length(); i++) {
            ch1 = one.charAt(i)+"";

        }
        
            for (int k = 0; k < two.length(); k++) {
                ch2 = two.charAt(k)+"";

            }




        return ch1+ch2;
    }

}
