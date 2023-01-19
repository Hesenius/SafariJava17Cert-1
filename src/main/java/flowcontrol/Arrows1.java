package flowcontrol;

public class Arrows1 {
  public static void main(String[] args) {
    String s = "Hello";
    switch (s) {
      case "Hello" -> {
        int x = 99;
        System.out.print("Bonjour "); // line n1
        System.out.print("Guten Tag ");
      }
      default -> System.out.print("Bye");
    }
  }
}
