package HW2_Arrays_Shooting_at_the_square;

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
        int row = random.nextInt(5);
        int column = random.nextInt(5);
        //My target i in the position target[row][column]
        System.out.println(row+1);
        System.out.println(column+1);
        //Game starts here
        System.out.println("All set. Get ready to rumble!");
        Scanner in = new Scanner(System.in);
        /*infinite loop start. Shooting will continue
        until finding target
        */

        while (true) {
            System.out.println("Enter row: ");
            if (!in.hasNextInt()) {
                System.out.println("Enter only number: Try again");
                in.next();
                continue;
            }
            int playerShotRow=in.nextInt();
            while (true) {
                //if entered out of scope 1-5 continue shooting
                if (playerShotRow < 1 || playerShotRow > 5) {
                    System.out.println("Out of scope. Try again: ");
                    System.out.println("Enter row: ");
                    playerShotRow = in.nextInt();
                } else {
                    break;
                }
            }

            System.out.println("Enter column: ");
            int playerShotColumn = 0;;
            while (true) {
                if (!in.hasNextInt()) {
                    System.out.println("Enter only number: Try again");
                    System.out.println("Enter column: ");
                    in.next();
                    continue;
                }
                playerShotColumn= in.nextInt();
                if (playerShotColumn < 1 || playerShotColumn > 5) {
                    System.out.println("Out of scope. Try again: ");
                    System.out.println("Enter column: ");
                    playerShotColumn = in.nextInt();

                } else {
                    break;
                }
            }

            if (row == (playerShotRow-1) && column == (playerShotColumn-1)) {
                System.out.println("You have won");
                target[row][column] = 'X';
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(target[i][j]);
                    }
                    System.out.println();
                }
                //if target found end of loop
                break;
            } else {
                target[playerShotRow-1][playerShotColumn-1] = '*';
                //if target missed continue shooting.
                System.out.println("You missed target. SHOOT AGAIN.");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(target[i][j]);
                    }
                    System.out.println();
                }

            }
        }
    }
}