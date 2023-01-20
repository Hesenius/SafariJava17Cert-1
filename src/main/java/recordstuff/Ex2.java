package recordstuff;

public class Ex2 {
  public static void main(String[] args) {
    Client c1 = new Client("Fred", 1000);
    Client c2 = new Client();
    System.out.println(c1);
    System.out.println(c2);
  }
}

record Client(String name, int creditLimit) {
  // line n1
  Client {}

  private Client(String name) {
    this(name, 10);
    System.out.println("after");
  }

  public Client() {
    this("Unknown");
  }
//  public Client(String name, int creditLimit) {
//    super(); // NOPE
//    this.name = name; // can/must in this case
//    this.creditLimit = creditLimit;
//  }
}
//record SpecialClient(String name, int creditLimit, String greeting)
//    extends Client(name, creditLimit) {}

