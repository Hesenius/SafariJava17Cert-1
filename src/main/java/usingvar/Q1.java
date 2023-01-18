package usingvar;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

//class X {
//  var x = 99;
//}

import java.util.Map;

public class Q1 {
  public static void showAll(int[] ia) {
  }

//  void doStuff(var x) { }

//  void doStuff() {
//    var x;
//    x = 100;
//  }

//  void doStuff() {
//    var x = 100;
//  }

  void doStuff() {
    var x = new Number[]{1, 2, 3};
  }

  public static Optional<Stream<Map.Entry<Long, String>>> getIt() {return null;}

  public static void main(String[] args) {
    var thing = getIt();
//    int [] ia = new int [] { 1, 3, 5 };
    int[] ia = {1, 3, 5};
    System.out.println(ia.getClass());
    showAll(new int[]{1, 2, 3});
//  showAll({1,2,3});
    showAll(new int[]{1, 2, 3});
  }
}
