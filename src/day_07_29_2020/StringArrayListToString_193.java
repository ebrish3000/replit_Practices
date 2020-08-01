package day_07_29_2020;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class StringArrayListToString_193 {

  public static String combineRs(String[] r1,String[] r2)
  {
      ArrayList<String> names = new ArrayList<>();

      for (String each : r1) {
          names.add(each);
      }
      for (String each : r2) {
          names.add(each);
      }

      String result = "";
      for (String eachItem : names) {
          result += eachItem;
      }
      return result;



  }
}
