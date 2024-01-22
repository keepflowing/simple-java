import java.util.Scanner;

public class RoundUpDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a double: ");
        double d = input.nextDouble();

        int toInt = (int)(d + 0.999999999999);
        System.out.println(toInt);
    }
}
