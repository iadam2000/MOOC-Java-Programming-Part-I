
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {

            System.out.println("Give a number: ");
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 0) {
                break;
            } else if (i < 0) {
                sum++;
            }
        }

        System.out.println("Number of negative numbers: " + sum);

    }
}
