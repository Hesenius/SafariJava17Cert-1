package usingvar;

//class X {
//  var x = 99;
//}

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

  public static void main(String[] args) {
//    int [] ia = new int [] { 1, 3, 5 };
    int[] ia = {1, 3, 5};
    System.out.println(ia.getClass());
    showAll(new int[]{1, 2, 3});
//  showAll({1,2,3});
    showAll(new int[]{1, 2, 3});
  }
}
