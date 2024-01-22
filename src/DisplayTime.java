import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an int in seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds/60;
        int remainingSeconds = seconds%60;

        System.out.println(seconds + " seconds is equal to " +
                minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}
