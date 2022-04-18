package HomeTaskBy18042022;

import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size array");
        int N = in.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter number in array");
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }

        int num = 0;
        System.out.println("Enter number");
        int n = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                num = arr[i];
                }
            }
            if (num != n) {
                System.out.println("The number doesn't enter to array!");
            }
            else {
                System.out.println("The number enters to array!");
            }
        }
}