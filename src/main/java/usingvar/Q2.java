package usingvar;

import java.io.FileReader;
import java.io.FileWriter;

public class Q2 {
  // getters and setters here.

  public static void main(String[] args) {

//    int x = 10, y = 100;
//    var x = 10, y = 100; // NO
//    var x = 10; var y = 100; //

//    for (int x = 99, y = 6, z, ia[] = {1,2,3} ; ; ) {}

//    for (var x = 99 ; ; ) {
//      System.out.println(x);
//    }

//  for (var x = 0; x < 3; x++)
//      System.out.println(x);
//
//      try (var in = new FileReader("");
//           var out = new FileWriter("")) {
//      }
//      catch (Throwable t) {}
//

//    int var = 99;
    // new features do not add new keywords,
    // they add "context sensitive special identifiers"
    var var = "var";
//  int goto = 99;
//    int const = 100;

    var x = true ? "99" : 99;
//    x.

    /*final */boolean b = false;
    if (b) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    while (b) {
      System.out.println("really");
    }
  }
}

//class var {}
