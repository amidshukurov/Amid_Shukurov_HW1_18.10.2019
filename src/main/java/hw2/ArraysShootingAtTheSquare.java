package hw2;

import java.util.Random;
import java.util.Scanner;

public class ArraysShootingAtTheSquare {
    public static int checkForNumber() {
        Scanner in = new Scanner(System.in);
        int result=0;
        while (true) {
            while (!in.hasNextInt()) {
                System.out.println("Enter only number: Try again");
                System.out.println("Enter number: ");
                in.next();
            }
            result=in.nextInt();
            if (result <1 || result > 5) {
                System.out.println("Out of scope [1-5]. Try again: ");
                System.out.println("Enter row: ");
                continue;
            }
            return result;
        }
    }
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
        System.out.println(row + 1);
        System.out.println(column + 1);

        System.out.println("All set. Get ready to rumble!");
        Scanner in = new Scanner(System.in);
        //infinite loop start. Shooting will continue until finding target
        while (true) {
            System.out.println("Enter row: ");
            int playerShotRow = checkForNumber();
            System.out.println("Enter column: ");
            int playerShotColumn = checkForNumber();
            if (row == (playerShotRow - 1) && column == (playerShotColumn - 1)) {
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
                target[playerShotRow - 1][playerShotColumn - 1] = '*';
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