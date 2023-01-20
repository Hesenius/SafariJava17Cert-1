package usesealed;

interface ArbInter {}
final class Y implements X {}
sealed interface X /* point x */{}
// line n1
non-sealed abstract class Z implements X permits Q {}
final class Q extends Z {}