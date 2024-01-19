public class ByteOverflow {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Input a value between -128 and 127: ");
        byte var = input.nextByte();
        System.out.println(var);
    }
}
