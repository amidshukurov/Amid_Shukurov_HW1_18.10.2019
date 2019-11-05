package classroom.Old;

import java.util.Arrays;
import java.util.Random;

public class Classwork {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfRandom = new int[20];
        for (int i = 0; i < 20; i++) {
            arrayOfRandom[i] = random.nextInt(20) - 10;
        }
        //print array
        System.out.print("< ");
        for (int i = 0; i < 20; i++) {
            System.out.print(arrayOfRandom[i]);
            if (i == arrayOfRandom.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println(" >" + "\n");
        //reverse array
        /*for (int i = 0; i < arrayOfRandom.length / 2; i++) {
            int temp = arrayOfRandom[i];
            arrayOfRandom[i] = arrayOfRandom[19 - i];
            arrayOfRandom[19 - i] = temp;
        } */
        int p=arrayOfRandom.length;
        for (int i = 0; i < p/2; i++) {
            arrayOfRandom[p-i-1]=arrayOfRandom[i]+arrayOfRandom[p-i-1];
            arrayOfRandom[i]=arrayOfRandom[p-i-1]-arrayOfRandom[i];
            arrayOfRandom[p-i-1]=arrayOfRandom[p-i-1]-arrayOfRandom[i];
        }

        //print reversed array
        System.out.print("< ");
        for (int i = 0; i < 20; i++) {
            System.out.print(arrayOfRandom[i]);
            if (i == arrayOfRandom.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println(" >");
        System.out.println("\n\n\n");
        //Negative, OddPositive, EvenPositive
        int lenghtOfNeqative = 0;
        int lenghtOfPositiveOdd = 0;
        int lenghtOfPositiveEven = 0;
        for (int i = 0; i < arrayOfRandom.length; i++) {
            if (arrayOfRandom[i] < 0) {
                lenghtOfNeqative++;
            } else if (arrayOfRandom[i] % 2 == 0) {
                lenghtOfPositiveEven++;
            } else {
                lenghtOfPositiveOdd++;
            }
        }
        int[] arrayOfNegative = new int[lenghtOfNeqative];
        int[] arrayOfPositiveEven = new int[lenghtOfPositiveEven];
        int[] arrayOfPositiveOdd = new int[lenghtOfPositiveOdd];

        System.out.println(lenghtOfNeqative);
        System.out.println(lenghtOfPositiveOdd);
        System.out.println(lenghtOfPositiveEven);
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < arrayOfRandom.length; i++) {

            if (arrayOfRandom[i] < 0) {
                arrayOfNegative[a] = arrayOfRandom[i];
                a++;
            } else if (arrayOfRandom[i] % 2 == 0) {
                arrayOfPositiveEven[b] = arrayOfRandom[i];
                b++;
            } else {
                arrayOfPositiveOdd[c] = arrayOfRandom[i];
                c++;

            }
        }
        System.out.println(Arrays.toString(arrayOfNegative));
        System.out.println(Arrays.toString(arrayOfPositiveOdd));
        System.out.println(Arrays.toString(arrayOfPositiveEven));
        }
    }
