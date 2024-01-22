import java.util.Scanner;

public class RoundUpDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a double: ");
        double d = input.nextDouble();

        int toInt = (int)(d);
        int roundedUp = toInt;
        if (d - toInt > 0) roundedUp++;
        System.out.println(roundedUp);
    }
}
