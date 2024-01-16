import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you wish to convert kilometers to miles (1)" +
                ", or the other way around? (2): ");
        int mode = input.nextInt();
        final double KM_PER_MILE = 1.609;
        if(mode == 2) {
            System.out.print("How many miles?: ");
            double miles = input.nextDouble();
            System.out.print(miles + " miles is equal to " +
                    (miles*KM_PER_MILE) + " kilometers.");
        }
        else{
            System.out.print("How many kilometers?: ");
            double kilometers = input.nextDouble();
            System.out.print(kilometers + " kilometers is equal to " +
                    (kilometers/KM_PER_MILE) + " miles.");
        }
    }
}
