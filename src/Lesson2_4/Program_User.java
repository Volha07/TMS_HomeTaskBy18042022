package Lesson2_4;

import java.util.Scanner;

public class Program_User {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}