package day_07_25_2020;

public class CoverMe_180 {
/*
 if(main.contains(coverME)){
    main = main.replace(coverME,"["+coverME+"]");
   }else{
     main = "["+main+"]";
   }
return main;

 */
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        if (main.contains(coverME)) {
            main= main.replace(coverME, "[" + coverME + "]");
        } else {
            main = "[" + main + "]";
        }

        return main;

    }

}
