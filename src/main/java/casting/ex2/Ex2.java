package casting.ex2;

public class Ex2 {
  public static void main(String[] args) {
    Base b = new Sub();
//    ((StringBuilder) b) // line n1
//        .length();      // line n2
  }
}

class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}
class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void length() { System.out.println("doLengthStuff"); }
}
