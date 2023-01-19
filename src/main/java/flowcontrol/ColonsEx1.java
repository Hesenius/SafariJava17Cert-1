package flowcontrol;

import java.time.LocalDate;

public class ColonsEx1 {
  public static void takeDate(LocalDate ld) {}

  public static void main(String[] args) {
    int x = 1;
    // line n1
    var d =
    switch(x) {
      case 1: yield LocalDate.of(2023, x, 1);
//        System.out.println("Odd"); // UNREACHABLE
      default: yield LocalDate.of(2022, 12, 1);
    };

    System.out.println(d);

//    var d1 =
    takeDate(switch(x) {
          case 1 -> {
            System.out.println("Odd");
            yield LocalDate.of(2023, x, 1);
          }
          default -> LocalDate.of(2022, 12, 1);
        });

  }
}
