package flowcontrol;

public class Arrows1 {
  public static void main(String[] args) {
    String s = "Hello";
    switch (s) {
      case "Hello", "Goodbye" -> {
        int x = 99;
        System.out.print("Bonjour "); // line n1
        System.out.print("Guten Tag ");
      }
      default -> System.out.print("Bye");
    }

    switch (s) {
//      case "Hello":
//      case "Goodbye":
      case "Hello", "Goodbye":
        int x = 99;
        System.out.print("Bonjour "); // line n1
        System.out.print("Guten Tag ");
      default: System.out.print("Bye");
    }


  }
}
