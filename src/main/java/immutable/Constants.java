package immutable;

class X {
  static String h = "Hello";
}

public class Constants {
  public static void main(String[] args) {
    String s1 = "hello";
    // bizarre corner case
//    String s4 = s1.toLowerCase();
//    System.out.println("s1 == s4? " + (s1 == s4));

    String s2 = new StringBuilder("hello").toString();
    String s3 = s2.intern();
//    System.out.println(s1 == s2);
//    System.out.println(s2 == s3);
    System.out.println(s1 == s3);
//    System.out.println(X.h == s1);

    System.out.println("---------------");
    Object o1 = 1; // pooling "small" values of Integer (-128 -> +127)
    Object o2 = 1;
    Object o5 = new Integer(1);
    Object o3 = 128;
    Object o4 = 128;
    System.out.println("o1 == o2? " + (o1 == o2));
    System.out.println("o1 == o5? " + (o1 == o5));
    System.out.println("o3 == o4? " + (o3 == o4));

    System.out.println(Double.parseDouble("NaN"));
    System.out.println(Double.parseDouble("Infinity"));
    System.out.println(Double.parseDouble("-Infinity"));
  }

}
