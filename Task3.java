package HomeTaskBy18042022;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{7, 9, 3, 1, 8};
        int[] arr2 = new int[]{3, 8, 1, 5, 9};
        int sum1 = 0;
        int sum2 = 0;
        double avg1, avg2;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        System.out.println();
        avg1 = (double) sum1 / 5;
        avg2 = (double) sum2 / 5;
        System.out.println("Average (Arr1) =" + avg1);
        System.out.println("Average (Arr2) =" + avg2);
        if (avg1 < avg2) {
            System.out.println("The average of Arr1 less than the average of Arr2");
        }
        else if(avg2<avg1) {
            System.out.println("The average of Arr2 less than the average of Arr1");
        }
        else {
            System.out.println("The averages of Arr1 and Arr2 are equal");
        }
    }
}