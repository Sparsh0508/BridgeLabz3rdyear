import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();
        height /= 100; // convert to meter
        double bmi = weight / (height * height);
        String status;
        if(bmi < 18.5) status = "Underweight";
        else if(bmi < 25) status = "Normal";
        else if(bmi < 40) status = "Overweight";
        else status = "Obese";
        System.out.println("BMI: " + bmi + " Status: " + status);
    }
}