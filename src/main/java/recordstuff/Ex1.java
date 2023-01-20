package recordstuff;

public class Ex1 {
  public static void main(String[] args) {
    SalesItem si = new SalesItem("Candy", 10);
    si.price(); // NOT getPrice()!!!
//    SalesItem.ourStore = "MyShop";
//    SalesItem.ourStore = "YourShop";
  }
}

// record fields are implicitly private & final
// each field gets an accessor method using the
// raw name of the field (doens't prefix with "get")
record SalesItem(String description, int price)
// subclass of java.lang.Record , but must NOT use extends
{
  // line n1
//  private int stockOnHand;
  // Not "really" an override--more of a replacement
  // uses @Override to verify "I'm trying to replace
  // one of the implicitly created methods"
//  @Override public int price() { return price; }
  // Nope, because it's not really "overriding" there
  // is no super in this case :)
//  @Override public int price() { return super.price() + 10; }
//  public static String ourStore;
//  public int getDiscount() { return price / 10; }
}

