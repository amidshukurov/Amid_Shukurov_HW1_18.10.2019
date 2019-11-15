package athomepractise.others;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][]arr = new int[4][5];
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=(j+1+i)*2;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            int j=0;
            int k = 0;
            if(i%2!=0) j=arr[i].length-1;
            for (; k < arr[i].length;k++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
                if(i%2!=0) j--; else j++;
            }
            System.out.println();
        }
    }
}
