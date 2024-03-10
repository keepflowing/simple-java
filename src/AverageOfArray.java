import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * This class asks the user to create an integer array of n values.
 * It then asks them to input those n values.
 * After that it calculates the average and amount of unique values in the array.
 */
public class AverageOfArray {
    /**
     * The main method first asks the user how many numbers they want to input,
     * then it creates an array of that length and fills it with user input.
     * <br>
     * Then it calculates the number of uniques and the average.
     * Finally, it prints the number of integers, uniques and average.
     * @param args is not used.
     */
    public static void main(String[] args) {
        int numberOfIntegers = getInteger("How many integers do you want to input? ");
        int[] numbers = new int[numberOfIntegers];
        fillArray(numbers);
        int uniques = getAmountOfUniques(numbers);
        int average = getAverageOfArray(numbers);
        System.out.println("You input " + numberOfIntegers + " numbers.");
        System.out.println("Of those, " + uniques + " were unique.");
        System.out.println("The average value was " + average + ".");
    }

    /**
     * This function tries to read an input until it succeeds.
     * @param msg is the message that will repeated every time it asks again.
     * @return the number once the input is successfully read.
     */
    public static int getInteger(String msg) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(msg);
                return input.nextInt();
            }
            catch(InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * This method takes an array as an input and calls the getInteger-method
     * until it has successfully filled every spot in the array with a value.
     * @param array is the previously array which will be "filled".
     */
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getInteger("Ange heltal " + (i+1) + ": ");
        }
    }

    /**
     * This method sorts the array, then iterates over it checking the "neighbours",
     * if they are not the same, the number of uniques is incremented.
     * @param array the array to be sorted and checked for uniques.
     * @return the number of unique values.
     */
    public static int getAmountOfUniques(int[] array) {
        // If the array only has one element, we can return 1
        if (array.length == 1) return 1;
        Arrays.sort(array);
        // If index 0 and index 1 have different values,
        // we start uniques at 1 instead of 0.
        int uniques = array[0] != array[1] ? 1 : 0;
        for (int i = 1; i < array.length; i++) {
            // If it is the last value, only check with the previous value.
            if(i == array.length - 1) {
                if(array[i] != array[i-1]) uniques++;
            }
            // Otherwise, check both neighbours.
            else if (array[i] != array[i-1] && array[i] != array[i+1]) {
                uniques++;
            }
        }
        return uniques;
    }

    /**
     * Add up all values in the array and divide them by the amount of values.
     * @param array the array to be checked for an average.
     * @return the average value (integer division).
     */
    public static int getAverageOfArray(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total/array.length;
    }
}
