package lambdasetc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {
  public static Predicate<String> getOne(int x) {
    return new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() >= x + 1;
      }
    };
  }

  public static void main(String[] args) {
    System.out.println(new ArrayList<>(List.of("Fred", "Jim", "Sheila"))
        .removeIf(getOne(3)));
  }}

