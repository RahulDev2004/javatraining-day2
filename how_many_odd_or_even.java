import java.util.Scanner;

public class EvenOddNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers:");

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();

            if (isEven(number)) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("The number of even numbers: " + evenCount);
        System.out.println("The number of odd numbers: " + oddCount);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
