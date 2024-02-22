import java.util.Scanner;
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a full year (e.g. 2024): ");
        int year = input.nextInt();

        System.out.print("Enter a month as a number between 1 - 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("        " + getMonthTitle(month) + " " + year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    }

    public static String getMonthTitle(int month) {
        String[] names = {"January", "February", "Mars", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return names[month - 1];
    }

    public static void printMonthBody (int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDays = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i < numberOfDays; i++) {
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static int getStartDay (int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        return (getDaysSince1Jan1800(year, month)
                + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getDaysSince1Jan1800 (int year, int month){
        int total = 0;
        for (int i = 1800; i < year; i++) {
            total += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }
        return total;
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        int[] days = {31, (isLeapYear(year) ? 29 : 28), 31,
                        30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[month - 1];
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
