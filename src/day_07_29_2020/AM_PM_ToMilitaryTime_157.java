package day_07_29_2020;

public class AM_PM_ToMilitaryTime_157 {
    public static void main(String[] args) {
        String s = "";

        if (s.equals("12:00:00AM")) {
            System.out.println("00:00:00");
        } else if (s.equals("12:00:00PM")) {
            System.out.println("12:00:00");
        } else if (s.endsWith("AM")) {
            System.out.println(s.replace("AM", ""));

        } else if (s.endsWith("PM")) {
            int hour = Integer.parseInt(s.substring(0,s.indexOf(":")));
            hour += 12;
            String newTime = hour+s.substring(s.indexOf(":")).replace("PM", "");
            System.out.println(newTime);
        }

    }
}
