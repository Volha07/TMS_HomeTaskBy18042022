package HomeTaskBy18042022;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 14, 42, 61, 94, 121, 192, 207};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 1){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
