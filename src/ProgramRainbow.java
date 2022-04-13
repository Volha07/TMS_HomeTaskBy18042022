import java.util.Scanner;

public class ProgramRainbow {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the colour's number: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("The colour doesn't exist");
        }



    }

}
