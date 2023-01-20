package enums;

enum Suit { HEARTS(1), DIAMONDS, CLUBS,
  SPADES {
    boolean isTrumps() { return false; }
  };
  private int num = 0;
  private Suit() {}
  private Suit(int x) { num = x; }
  /*final */boolean isTrumps() { return this == HEARTS; }
}

class X {
  /*static */interface Y {}
  /*static */enum Z {}
}
