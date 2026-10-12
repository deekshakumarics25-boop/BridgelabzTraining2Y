import java.util.Scanner;

public class PeakPoint {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            System.out.println("Peak element: " + arr[left]);
            System.out.println("Peak index: " + left);

            sc.close();
        }
    }

