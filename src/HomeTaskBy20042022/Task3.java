package HomeTaskBy20042022;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int m = matrix1.length;
        int n = matrix2[0].length;
        int a = matrix2.length;
        int[][] result = new int[m][n];

        System.out.println("First matrix: ");
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println("Second matrix: ");
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(" ");
        System.out.println("New matrix:");


        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < a; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
        System.out.println();
    }
}