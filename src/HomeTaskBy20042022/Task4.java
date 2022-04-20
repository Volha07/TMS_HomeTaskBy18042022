package HomeTaskBy20042022;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {7, 1, 1}, {4, 3, 0}};
        int sum = 0;

//        for (int x : arr)
//            sum += x;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum +=arr[i][j];
            }
        }
        System.out.println("Sum of all array elements  = "+sum);
    }
}
