package casting.ex2;

public class Ex2 {
  public static void main(String[] args) {
    Base b = null;//new Sub();
//    ((StringBuilder) b) // line n1
//        .length();      // line n2
    ((Runnable)b).run();
  }
}

class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

final class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void length() { System.out.println("doLengthStuff"); }
}

//class Sub2 extends Base implements Runnable {
//
//  @Override
//  public void run() {
//    System.out.println("Hahah! I'm Runanble");
//  }
//}