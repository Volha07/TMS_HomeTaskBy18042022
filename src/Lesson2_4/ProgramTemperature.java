package Lesson2_4;

import java.util.Scanner;

public class ProgramTemperature {

    public static void main(String[] args) {
        int t;
        System.out.println("Enter the temperature: ");

        Scanner input = new Scanner(System.in);
        t = input.nextInt();

        if (t > -5) {
            System.out.println("Warm");
        }
        else if (t <= -5 && t > -20) {
                System.out.println("Normal");
        }
                else {
                     if (t >= -20) {
                     System.out.println("Cold");
                     }

                }
    }
}

