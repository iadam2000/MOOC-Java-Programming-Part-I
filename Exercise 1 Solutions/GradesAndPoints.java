
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int input = Integer.valueOf(scan.nextLine());
        String result;
        if (input < 0) {
            result = "impossible!";
        } else if (input < 50) {
            result = "failed";
        } else if (input < 60) {
            result = "1";
        } else if (input < 70) {
            result = "2";
        } else if (input < 80) {
            result = "3";
        } else if (input < 90) {
            result = "4";
        } else if (input <= 100) {
            result = "5";
        } else {
            result = "incredible!";
        }

        System.out.println("Grade: " + result);


    }
}
