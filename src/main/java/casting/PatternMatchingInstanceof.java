package casting;

import java.time.LocalDate;

public class PatternMatchingInstanceof {
  public static void main(String[] args) {
    Object obj = null;//LocalDate.now();
//    if (obj instanceof String) {
//      String str = (String) obj;
//    if (obj instanceof String str) {
//      if (str.length() > 3) {
//        System.out.println(str);
//      } else {
//        System.out.println("Too short");
//      }
//    } else {
//      System.out.println(str);
    System.out.println(
        obj instanceof String str && str.length() > 3 ? str : "Too short");

    String s2 = (String)null;

  }
}

