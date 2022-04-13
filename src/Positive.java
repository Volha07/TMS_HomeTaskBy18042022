import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the positive number: ");
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(num = input.nextInt(); num != 0; num /= 10)        {
            sum += (num % 10);
        }
        System.out.println(sum + " ");
    }
}