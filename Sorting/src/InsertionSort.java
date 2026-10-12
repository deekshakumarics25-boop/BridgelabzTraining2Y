
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }

        System.out.println("Sorted employee IDs:");
        for (int i = 0; i < n; i++) {
            System.out.print(ids[i] + " ");
        }

        sc.close();
    }
}

