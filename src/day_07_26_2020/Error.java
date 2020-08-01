package day_07_26_2020;

public class Error {

    public static boolean isError(String line)
    {
        boolean  isError = line.substring(0, 5).equalsIgnoreCase("error");

        return isError;
    }

}
