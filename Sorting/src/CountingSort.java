
import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int[] ages) {
        int[] count = new int[9];
        int[] output = new int[ages.length];

        // Count frequency of each age
        for (int i = 0; i < ages.length; i++) {
            count[ages[i] - 10]++;
        }

        // Calculate cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Place ages in correct positions
        for (int i = ages.length - 1; i >= 0; i--) {
            int index = ages[i] - 10;
            output[count[index] - 1] = ages[i];
            count[index]--;
        }

        // Copy sorted ages into original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter ages between 10 and 18:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();

            if (ages[i] < 10 || ages[i] > 18) {
                System.out.println("Invalid age. Enter again.");
                i--;
            }
        }

        countingSort(ages);

        System.out.println("Sorted student ages:");
        for (int i = 0; i < n; i++) {
            System.out.print(ages[i] + " ");
        }

        sc.close();
    }
}

