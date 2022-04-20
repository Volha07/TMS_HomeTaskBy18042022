package Lesson2_4;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        System.out.println("Enter the positive number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1;  i <= n; i++) {
            sum += i;
        }
        System.out.println(sum + " ");
    }
}