import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double radius, area;
        final double PI = 3.1415926535;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a new radius: ");

        radius = input.nextDouble();
        area = radius * radius * PI;

        System.out.println("The area for the circle of radius "
                + radius + " is " + area);
    }
}
