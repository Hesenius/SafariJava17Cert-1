package immutable;

public class Loops {
  public static void main(String[] args) {
    for (int x = 0; x < 3; x++) {
      final int y = 2 * x;
//      final Integer y = 2 * x;
      final int[] ia = {0};
      int z = 10;
      System.out.println(y);
      System.out.println(z);
      System.out.println(ia[0]);
      ia[0] = 100;
      System.out.println(ia[0]);
    }
  }
}
