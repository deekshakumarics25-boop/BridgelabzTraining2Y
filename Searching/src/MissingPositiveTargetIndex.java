import java.util.Arrays;
import java.util.Scanner;

public class MissingPositiveTargetIndex {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            
            int missing = 1;
            boolean found;

            while (true) {
                found = false;

                for (int i = 0; i < n; i++) {
                    if (arr[i] == missing) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    break;
                }

                missing++;
            }

            System.out.println("First missing positive: " + missing);

            Arrays.sort(arr);

            System.out.print("Enter target: ");
            int target = sc.nextInt();


            int left = 0;
            int right = n - 1;
            int index = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    index = mid;
                    break;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println("Target index: " + index);

            sc.close();
        }
    }

