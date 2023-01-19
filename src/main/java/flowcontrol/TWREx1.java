package flowcontrol;

import java.io.FileReader;
import java.io.FileWriter;

public class TWREx1 {
  public static void main(String[] args) throws Throwable {

    /*final */ var in = new FileReader(""); // line n1
    try (

//        final// line n2
        in; // in will be definitely closed
         FileWriter out = new FileWriter("");
        FileReader fr2 = new FileReader("");
    ) {
//      out = null;
    }
    // line n3
//    in = null;
    in.getClass();

  }
}
