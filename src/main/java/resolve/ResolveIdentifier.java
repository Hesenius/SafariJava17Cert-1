package resolve;

public class ResolveIdentifier {
  static int x = 99;

//  static void showIt(ResolveIdentifier ri) {
////    int x = 98;
//    System.out.println("x is " + ri.x);
//  }
  void showIt(ResolveIdentifier this) {
    System.out.println("x is " + ResolveIdentifier.x);
    System.out.println("x is " + this.x);
    System.out.println("x is " + x);
  }

  public static void main(String[] args) {
    new ResolveIdentifier().showIt();
//    showIt(new ResolveIdentifier());
  }
}