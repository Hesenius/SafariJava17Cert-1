package enums;

enum X1 {
  A, B;

//  public static String name(X1 x) {
//    return x.name().toUpperCase();
//  }

  public static void main(String[] args) {
//    String s = X1.name(X1.A);
    String s2 = X1.A.name();
    X1 x1 = X1.valueOf("A");
//    X1.valueOf("BBBB");
    X1 x11 = Enum.valueOf(X1.class, "A");
    System.out.println(x1 == x11);
  }
}