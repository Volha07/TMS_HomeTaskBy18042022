package HomeTaskBy18042022;

import java.util.Scanner;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n = in.nextInt();
        while (n > 5  && n <= 10) {
            if(in.hasNextInt()){
                n = in.nextInt();
                if(n < 5  || n > 10){
                    System.out.println("The number doesn't suit the condition! Repeat the entry:");
                }
            }
        }
        int [] arr1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            arr1[i] = (int)(Math.random()*(n+1));
            if(arr1[i]%2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(arr1));
        int [] arr2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(arr1[i]%2 == 0){
                arr2[index] = arr1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}



 /*      int n = in.nextInt();
 if (n > 5  && n <= 10) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * (n + 1));
            }
            System.out.println(Arrays.toString(arr));
        }else if (n < 5  || n > 10) {
            System.out.println("The value doesn't suit the condition!");
            System.out.println("Please, enter the correct array size");
            int n1 = in.nextInt();
            int[] arr1 = new int[n1];
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = (int) (Math.random() * (n1 + 1));
            }

            int [] arr3 = new int[n1];
            int evenNums = 0;

            for (int x = 0; x < n; x++) {
                arr3[x] = (int) (Math.random() * (n + 1));
                if (arr3[x] % 2 == 0) {
                    evenNums++;
                }
            }
            System.out.println(Arrays.toString(arr1));
            int [] arr4 = new int[evenNums];
            int index = 0;
            for (int y = 0; y < n; y++) {
                if(arr3[y]%2 == 0){
                    arr4[index] = arr4[y];
                    index++;
                }
            }
            System.out.println(Arrays.toString(arr4));*/
