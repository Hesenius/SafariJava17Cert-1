package usesealed;

sealed /*abstract class*/ interface Transporter
    permits Bicycle, Car, Truck, Hovercraft {
  public abstract int payload();
}

final class Car /*extends*/ implements Transporter {
  @Override
  public int payload() {
    return 200;
  }
}

sealed class Truck /*extends*/ implements Transporter permits BigTruck {
  @Override
  public int payload() {
    return 10_000;
  }
}

final class BigTruck extends Truck {}

record Hovercraft() implements Transporter {
  @Override
  public int payload() {
    return 0;
  }
}

public class Example {
  public static void main(String[] args) {
    // WARNING, THIS IS ***NOT*** IN THE Java 17 exam
    // IT'S PREVIEW in Java 19!!!!
    // but it's a key reason for the existence of
    // sealed types
    Transporter t = new Car();
    switch (t) {
      case Car x -> System.out.println("It's a car");
      case Truck x -> System.out.println("it's a truck");
      case Bicycle b -> System.out.println("it's a bike");
      case Hovercraft h -> System.out.println("hover...");
    }
  }
}
