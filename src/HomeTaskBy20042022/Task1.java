package HomeTaskBy20042022;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][][] threeArray = new int[][][]{
                {{1, 5, 3}, {6, 9, 7}},
                {{5, 3, 7}, {8, 2, 10}}
        };

        print(threeArray);
    }

    public static void  print(int[][][] threeArray) {
        Scanner in = new Scanner(System.in);
        System.out.println("Add a number: ");
        int a = in.nextInt();
        for (int i = 0; i < threeArray.length; i++) {
            for (int j = 0; j < threeArray[i].length; j++) {
                for (int k = 0; k < threeArray[i][j].length; k++) {
                    threeArray[i][j][k] += a;
                    System.out.print(threeArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
