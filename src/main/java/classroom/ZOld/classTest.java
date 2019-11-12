package classroom.ZOld;

import java.util.Random;
public class classTest {

    public static String gen_random(int lenght) {
        if (lenght <= 0) return "Lenght can not be 0";
        String letter = "";
        Random random = new Random();
        int minUp = 'A';
        int maxUp = 'Z';
        int minLow = 'a';
        int maxLow = 'z';
        for (int i = 0; i < lenght; i++) {
            int randomNumberUpper = random.nextInt(maxUp + 1 - minUp) + minUp;
            int randomNumberLower = random.nextInt(maxLow + 1 - minLow) + minLow;
            int lastRandom = 0;
            boolean isOne = random.nextBoolean();
            if (isOne) {
                lastRandom = randomNumberLower;
            } else {
                lastRandom = randomNumberUpper;
            }
            char charUpper = (char) lastRandom;
            if (i < lenght - 1) {
                letter = letter + charUpper + ",";
            } else {
                letter = letter + charUpper + ",";
            }
        }
        ;
        letter = "[" + letter + "]";
        return letter;
    }

    public static boolean string_check(String string) {
        boolean result = false;
        for (int i = 0; i < string.length(); ) {
            for (int j = i + 1; j <= i + 1; ) {
                System.out.println(string.substring(j, j + 1));
                j = j + i + 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        String s1 = gen_random(6);
        System.out.println(s1);
        //System.out.println(s1.substring(0,1));
        String s2 = s1.substring(1, s1.length() - 1).replaceAll(",", "");
        System.out.println(s2);
        // System.out.println(s1);
        // System.out.println(gen_random2(0));
    }
}
