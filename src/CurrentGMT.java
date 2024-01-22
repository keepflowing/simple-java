public class CurrentGMT {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        long totalSeconds = currentTime / 1000;
        long currentSecond = currentTime % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalSeconds % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("The current time is: " + currentHour + ":" +
                currentMinute + ":" + currentSecond + " GMT.");
    }
}
