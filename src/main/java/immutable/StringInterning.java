package immutable;

public class StringInterning {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "He";
//    s2 += "llo";
    s2 = s2 + "llo";
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    String s3 = "Hello";
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));

    String s4 = new String("Hello");
    System.out.println(s1 == s4);
    System.out.println(s1.equals(s4));

  }
}
