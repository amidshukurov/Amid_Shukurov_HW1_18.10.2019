
import javax.crypto.spec.PSource;
import java.util.Random;

class TestPurpose {
    public static String gen_random(int lenght){
        if(lenght==0) return "Lenght can not be 0";
        String letter = "";
        Random random= new Random();
        int minUp = 65;
        int maxUp = 90;
        int minLow = 97;
        int maxLow = 122;
        for (int i =0; i < lenght; i++) {
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
          if(i<lenght-1)  {letter = letter + charUpper + ",";
          } else {
              letter = letter + charUpper;
          }
        };
        letter = "[" +letter+ "]";
        return letter;
    }
    public static void main(String[] args){


        String s1 = gen_random(5);
        System.out.println(s1);
    }
}