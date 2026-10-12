import java.util.Scanner;

public class RotationPoint {


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

                if (arr[mid] > arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            System.out.println("Rotation index: " + left);
            System.out.println("Smallest element: " + arr[left]);

            sc.close();
        }
    }

