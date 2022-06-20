
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int price = Integer.valueOf(scan.nextLine());
        double tax = 0;

        if (price < 5000) {
            System.out.println("No tax!");
        } else if (price <= 25000) {
            tax = tax(price, 100, 5000, 0.08);
            System.out.println(tax);
        } else if (price <= 55000) {
            tax = tax(price, 1700, 25000, 0.1);
            System.out.println(tax);
        } else if (price <= 200000) {
            tax = tax(price, 4700, 55000, 0.12);
            System.out.println(tax);
        } else if (price <= 1000000) {
            tax = tax(price, 22100, 200000, 0.15);
            System.out.println(tax);
        } else {
            tax = tax(price, 142100, 1000000, 0.17);
            System.out.println(tax);
        }

    }

    // Formula: (Flat fee + (Price of good - Lower price range) * Tax Rate)
    public static double tax(int cost, int fee, int lower, double rate) {
        return (fee + (cost - lower) * rate);
    }
}
