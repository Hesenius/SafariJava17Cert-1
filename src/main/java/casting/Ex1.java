package casting;

public class Ex1 {
  public static void main(String[] args) {
    Base b = new Base();
    ((Sub)b).doOtherStuff();
  }
}

class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}
class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

