package classroom._31_10_2019.fraction;

import java.util.function.Function;

public class Simplify implements Function<Fraction, Fraction> {

  private int gcd(int one, int two) {

      if (two == 0) {
        return two;
      }
      return gcd(two, one % two);

  }

  @Override
  public Fraction apply(Fraction origin) {
    int num = origin.num();
    int den = origin.den();
    int gcd = gcd(num, den);
    if (gcd != 1) {
      return new Fraction(num/gcd, den/gcd);
    }
    return origin;
  }
}
