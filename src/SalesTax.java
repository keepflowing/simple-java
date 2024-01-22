public class SalesTax {
    public static void main(String[] args) {
        double purchaseAmount = 1550;
        double igv = 0.18;
        double tax = purchaseAmount * igv;
        System.out.print("The sales tax is: " + (int)(tax * 100)/100.0);
    }
}
