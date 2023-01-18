package bitwise;

public class DoesntShortCircuit {
  public static boolean getValue() {
    System.out.println("Getting value");
    return true;
  }

  public static void main(String[] args) {
    boolean b1 = false;
    System.out.println(b1 & getValue());

  }
}
