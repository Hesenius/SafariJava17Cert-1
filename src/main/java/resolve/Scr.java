package resolve;

public class Scr {
  static int x = -1;

  public static void main(String[] args) {
    new ScrSub().doStuff();
  }
}

class ScrSub extends Scr {
  int x = 99;

  void doStuff() {
    System.out.print(x + ","); // line n1
    int x = 100;
    System.out.print(x + ",");
    System.out.print(x + ",");
  }
}