import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}