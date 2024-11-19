import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberUtilities {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Prime Number Utility!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check if a number is prime");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check: ");
                    int number = scanner.nextInt();
                    if (isPrime(number)) {
                        System.out.println(number + " is a prime number.");
                    } else {
                        System.out.println(number + " is not a prime number.");
                    }
                    break;
                case 2:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
