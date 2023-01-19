package flowcontrol;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {
  void doStuff() throws IOException {
  }
  void doStuff2() throws SQLException {
  }

  void tryStuff() {
    try {
      doStuff();
      doStuff2();
    } catch (IOException | SQLException ioe) {
      // handle both exceptions
    }
  }
//  void doStuff() throws IOException {
//  }
//  void doStuff2() throws FileNotFoundException {
//  }
//
//  void tryStuff() {
//    try {
//      doStuff();
//      doStuff2();
//    } catch (IOException | FileNotFoundException ioe) {
//      // handle both exceptions
//    }
//  }
}
