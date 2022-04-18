package HomeTaskBy18042022;

import java.util.Scanner;

public class Task2 {

    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Size array is ");
        int n = in.nextInt();

        double[] randoms = new double[n];
        for (int i = 0; i < n; i++) {
            randoms[i] = Math.random();
            System.out.println(randoms[i]);
        }
        double max = randoms[0];
        double min = randoms[0];
        double avg = 0;
        for (int i = 0; i < randoms.length; i++) {
            if(max < randoms[i])
                max = randoms[i];
            if(min > randoms[i])
                min = randoms[i];
            avg += randoms[i]/randoms.length;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + avg);
    }
}