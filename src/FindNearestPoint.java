import java.util.Scanner;
public class FindNearestPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");

        for(int i = 0; i < numberOfPoints; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1], points[p2]);

        for(int i = 0; i < numberOfPoints; i++) {
            for(int j = i + 1; j < numberOfPoints; j++) {
                double distance = distance(points[i], points[j]);

                /*
                See what is happening in the comparisons:
                System.out.println("Points : (" +  points[i][0] + ", " +
                        points[i][1] + ") and (" + points[j][0] + ", " + points[j][1] + ")." +
                        "Distance: " + distance);
                 */

                if(distance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.print("The two closest points are (" + points[p1][0] + ", " +
                points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ").");
    }
    public static double distance(double[] x, double[] y) {
        return Math.sqrt((x[0]-y[0]) * (x[0]-y[0]) + (x[1]-y[1]) * (x[1]-y[1]));
    }
}
