import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;

        while (number != 0) {

            int digit = number % 10;
            result += digit * digit * digit;
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
