package recordstuff;

public class Ex3 {
  public static void main(String[] args) {
    Customer c = new Customer("Fred", 1234);
    System.out.println(c);
    Customer c1 = new Customer("Fred", 1234);
    System.out.println(c.hashCode());
    System.out.println(c1.hashCode());
    System.out.println(c1.equals(c));
  }
}
record Customer(String name, int id) {
  // line n1

  Customer {
    if (name == null || name.length() == 0) {
      throw new IllegalArgumentException();
    }
//    this("X", 1); // NO
    // validate (potentially reject), perhaps standardize
    name = "Mx. " + name;
    name = "Dear " + name;
//    this.name = name; // NOPE, not in our shortform constructor
    // HERE we transfer control the body of the
    // canonical constructor
    // initilalize -- this would be very boilerplate code.
    // compiler builds "canonical constructor" by using "the above code"
    // and concatenating:
//    this.name = name;
//    this.id = id;
  }
}
//  Which are valid at line n1?
//    A)  Customer(String name, int id) {
//    this.name = "Mx. " + name;
//    }
//
//    B)  Customer {
//    this.name = name;
//    this.id = id;
//    }
//
//    C)  Customer {
//    if (name == null || name.length() == 0 || id < 1)
//    throw new IllegalArgumentException("Bad Customer values");
//    name = "Mr/Mrs/Ms " + name;
//    }
//
//    D)  static {}
//
//    E)  {}


record Thing(int x) {
  public Thing {
//    this.x = x; // this is placed in the real canonical constructor
  }
}
//class Thing {
//  int x;
//
//  public Thing(int x) {
//    this.x = x;
//  }
//}