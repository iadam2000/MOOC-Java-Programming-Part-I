
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {

            int i = Integer.valueOf(scanner.nextLine());
            if (i == 0) {
                break;
            } else if (i < 0) {
                continue;
            }
            count++;
            sum += i;

        }
        if (sum <= 0) {
            System.out.println("Cannot calculate the avearage");
        } else {
            double average = 1.0 * sum / count;
            System.out.println(average);
        }
    }
}
