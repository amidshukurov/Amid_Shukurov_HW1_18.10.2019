import java.io.Console;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        Random random = new Random();
        int program_number = random.nextInt(100);

        System.out.println(program_number);
        System.out.println("Let the game begin!");
        System.out.print("Enter your name please: ");
        Scanner in = new Scanner(System.in);
        String nameOfPlayer = in.nextLine();
        int[] playerNumberArray = new int[100];
        System.out.println("Enter your number to begin gambling: ");
        int playerNumber = in.nextInt();
        playerNumberArray[0]=playerNumber;
        for (int i = 1; ; i++) {

            if (playerNumber < program_number) {
                System.out.println("Your number is too small. Please, try again. ");
                System.out.println("Enter another number: ");
                playerNumber = in.nextInt();
                playerNumberArray[i]=playerNumber;
            } else if (playerNumber > program_number) {
                System.out.println("Your number is too big. Please, try again. ");
                System.out.println("Enter another number: ");
                playerNumber = in.nextInt();
                playerNumberArray[i]=playerNumber;

            } else {
                System.out.println("Congratulations " + nameOfPlayer);
                System.out.println(Arrays.toString(playerNumberArray));
                break;
            }
            System.out.println(Arrays.toString(playerNumberArray));

        }
    }


}
