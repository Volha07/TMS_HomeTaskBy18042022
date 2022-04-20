package HomeTaskBy20042022;

public class Task5 {
    public static void main(String[] args){

        int [][] arr = new int[][] {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};


        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

                if (i == j || j == arr.length - i -1){
                    arr[i][j] = arr[i][j];
                }
                else
                    arr[i][j] = 0; //не сообразила, чтобы пустое место было
                System.out.print(arr[i][j] + " ");
                }
            System.out.println();
        }
    }
}