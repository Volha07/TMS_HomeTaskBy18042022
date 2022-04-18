package HomeTaskBy18042022;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 96, 74, 112, 352, 116, 6, 78, 23};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
