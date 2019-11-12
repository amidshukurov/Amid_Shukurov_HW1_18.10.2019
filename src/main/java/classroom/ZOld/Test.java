package classroom.ZOld;

import java.io.IOException;

public class Test {


    /**
     * Calculates the greatest common divisor for two numbers.
     * <p>
     * Based on the fact that the gcd from p and q is the same as the gcd from p and
     * p % q in case p is larger than q
     *
     * @author Lars Vogel
     *
     */
/*    public static class GreatestCommonDivisor {
        public  static int gcd(int p, int q) {
            if (q == 0) {
                return p;
            }
            return gcd(q, p % q);
        }

        // Test enable assert check via -ea as a VM argument

        public static void main(String[] args) {
            System.out.println(gcd(15,65));
        }
    }*/
    public static void main(String[] args) throws IOException {
        if ('9'<'1') System.out.println("True");
        else System.out.println("False");

        if ('9'>'7') System.out.println("True");
        else System.out.println("False");

        if ('9'!='q') System.out.println("True");
        else System.out.println("False");
    }
}
