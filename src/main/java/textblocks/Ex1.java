package textblocks;

public class Ex1 {
  public static void main(String[] args) {
    String message = """
      Hello "" ""  \\ ""\"""\"
          Java 17 World!
      """;
    System.out.println(message + "XXX");

    String m2 = """
                
        X""";
    System.out.println(m2.length()); // still 2, despite indented (hidden) line
  }
}
