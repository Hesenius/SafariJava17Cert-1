package immutable;

import java.util.ArrayList;
import java.util.List;

public class UseString {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    s1.concat(" world");
    String s2 = s1.concat(" world");
    System.out.println(s1);
    System.out.println(s2);

    List<String> names = new ArrayList<>();
    names.add("Fred"); // "statement expression"
    int x = 99;
    x++;
//    x + 2; // Expression but NOT statement-expression
    boolean success = names.add("Fred");

//    for (int p = 0, q = 20;;)
    for (System.out.println("Hello"), names.add("bad");
        ;
        System.out.println("Hello"), names.add("bad"))
      ;
  }
}
