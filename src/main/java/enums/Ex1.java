package enums;

public class Ex1 {
}
enum Day {
  MONDAY(1), TUESDAY;
  // enums can only have private constructors
  /*public */Day(int d) {}
  /*public */Day() {}
}
//    sout(Day.MONDAY)
