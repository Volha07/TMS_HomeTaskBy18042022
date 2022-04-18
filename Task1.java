package HomeTaskBy18042022;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = new int[] {12, 15, 36, 86, 94, 102, 185};
        int[] newArr = null;

        Scanner in = new Scanner(System.in);
        System.out.println("Deleting element is ");
        int del = in.nextInt();

        System.out.println("Original Array is: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == del){
                newArr = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
                break;
            }
            else {
                    System.out.println("Deleting element doesn't exist!");
            } // при таком расположении выводится на печать 6 раз
        }
        System.out.println("New Array is: "+ Arrays.toString(newArr));
    }
}