import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) System.out.println("Amar is the youngest.");
        else if (youngestAge == ageAkbar) System.out.println("Akbar is the youngest.");
        else System.out.println("Anthony is the youngest.");

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) System.out.println("Amar is the tallest.");
        else if (tallestHeight == heightAkbar) System.out.println("Akbar is the tallest.");
        else System.out.println("Anthony is the tallest.");
    }
}