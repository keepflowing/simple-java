public class CurrentGMT {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        int totalSeconds = (int)(currentTime / 1000);
        byte currentSecond = (byte)(totalSeconds % 60);
        int totalMinutes = totalSeconds / 60;
        byte currentMinute = (byte)(totalMinutes % 60);
        int totalHours = totalMinutes / 60;
        byte currentHour = (byte)(totalHours % 24);
        System.out.println("The current time is: " + currentHour + ":" +
                currentMinute + ":" + currentSecond + " GMT.");
    }
}
