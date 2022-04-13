public class Lesson4 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 15, 36, 86, 94, 102, 185};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Min is " + min);
    }

}