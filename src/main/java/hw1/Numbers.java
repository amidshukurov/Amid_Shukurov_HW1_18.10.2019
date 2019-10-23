package hw1;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Numbers {
    public static int checkForNumber() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
                System.out.println("Enter only number: Try again");
                System.out.println("Enter number: ");
                in.next();
            }
            return in.nextInt();
        }
    public static void main(String[] args) {
        Random random = new Random();
        int programNumber = random.nextInt(100);

        System.out.println("Let the game begin!");
        System.out.print("Enter your name please: ");
        Scanner in = new Scanner(System.in);
        String nameOfPlayer = in.nextLine();
        int[] playerNumberArray = new int[100];
        System.out.println("Enter your number to begin gambling: ");

        int playerNumber = checkForNumber();
        playerNumberArray[0] = playerNumber;
        int countOfArray=0;
        for (int i = 1; ; i++) {
            countOfArray++;
            int[] printArray = new int[countOfArray];
            System.arraycopy(playerNumberArray,0,printArray,0,countOfArray);
            if (playerNumber < programNumber) {
                System.out.println("Your number is too small. Please, try again. ");
                System.out.println("You entered this numbers till now: " + Arrays.toString(printArray));
                System.out.println("Enter another number: ");
                playerNumber = checkForNumber();
                playerNumberArray[i] = playerNumber;
            } else if (playerNumber > programNumber) {
                System.out.println("Your number is too big. Please, try again. ");
                System.out.println("You entered this numbers till now: " + Arrays.toString(printArray));
                System.out.println("Enter another number: ");
                playerNumber = checkForNumber();
                playerNumberArray[i] = playerNumber;

            } else {
                System.out.println("Congratulations, " + nameOfPlayer);
                System.out.println(Arrays.toString(printArray));
                break;
            }

        }
    }
}