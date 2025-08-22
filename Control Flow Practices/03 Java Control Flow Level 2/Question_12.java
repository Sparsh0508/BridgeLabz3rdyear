import java.util.Scanner;
public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        if (number < 1 || power < 0) {
            System.out.println("Invalid input.");
            return;
        }
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Result = " + result);
    }
}