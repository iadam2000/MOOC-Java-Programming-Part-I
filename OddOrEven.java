
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int input = Integer.valueOf(scan.nextLine());

        int modulo = input%2;
        if (modulo == 0) {
        System.out.println("Number " + input + " is even." );
        } else {
            System.out.println("Number " + input + " is odd.");
        }
       
    }
}
