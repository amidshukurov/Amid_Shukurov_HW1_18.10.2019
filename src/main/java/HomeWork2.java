import javax.swing.text.MutableAttributeSet;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //setting the 5X5 square
        char[][] target = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                target[i][j] = '-';
            }
        }
        // randomly selection of target
        Random random = new Random();
        int first = random.nextInt(5);
        int second = random.nextInt(5);
        System.out.println(first);
        System.out.println(second);
        target[first][second] = 'o';
        //Game starts here
        System.out.println("All set. Get ready to rumble!");
        Scanner in = new Scanner(System.in);
        /*infinite loop start. Shooting will continue
        until finding target
        */
        while (true) {
            System.out.println("Enter row: ");
            int playerShotRow=in.nextInt();
            while (true) {
                //if entered out of scope 0-4 continue shooting
                if (playerShotRow < 0 || playerShotRow > 4) {
                    System.out.println("Out of scope. Try again for row: ");
                    playerShotRow = in.nextInt();
                } else {
                    break;
                }
            }

            System.out.println("Enter column: ");
            int playerShotColumn = in.nextInt();
            while (true) {
                if (playerShotColumn < 0 || playerShotColumn > 4) {
                    System.out.println("Out of scope. Try again for column: ");
                    playerShotColumn = in.nextInt();

                } else {
                    break;
                }
            }

            if (playerShotRow < 0 & playerShotRow > 4) {
                System.out.println("Out of scope. Try again: ");
                playerShotRow = in.nextInt();
            }
            if (first == playerShotRow & second == playerShotColumn) {
                System.out.println("You have won");
                target[first][second] = 'X';
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(target[i][j]);
                    }
                    System.out.println();
                }
                //if target found end of loop
                break;
            } else {
                target[playerShotRow][playerShotColumn] = '*';
                //if target missed continue shooting.
                System.out.println("You missed target. Shoot again.");

            }
        }
    }
}