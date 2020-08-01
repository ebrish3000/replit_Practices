package day_07_26_2020;

public class Method_184 {

    public static String at3(String target,String word)
    {
        String first = target.substring(0, 3);
        String second = target.substring(3);
        target = first+word+second;
       return target;


    }

}
