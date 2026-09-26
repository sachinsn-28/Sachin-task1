import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum = " + sum);

        sc.close();
    }
}