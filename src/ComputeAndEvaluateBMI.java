import java.util.Scanner;

public class ComputeAndEvaluateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Input height in centimeters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height / 10000);

        double roundedBmi = (double)(int)(bmi * 100) / 100;

        System.out.print("Your BMI is " + roundedBmi + ", which means that you are ");
        if(bmi > 30) System.out.println("Obese.");
        else if(bmi > 25) System.out.println("Overweight.");
        else if(bmi > 18.5) System.out.println("Normal weight.");
        else System.out.println("Underweight.");

    }
}
