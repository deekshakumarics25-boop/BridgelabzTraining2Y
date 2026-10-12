
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[min]) {
                    min = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[min];
            scores[min] = temp;
        }

        System.out.println("Sorted exam scores:");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
        }

        sc.close();
    }
}

