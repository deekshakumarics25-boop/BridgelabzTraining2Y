import java.util.Scanner;

public class SearchForTarget2D {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int target = sc.nextInt();

            int left = 0;
            int right = rows * cols - 1;
            boolean found = false;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                int row = mid / cols;
                int col = mid % cols;

                if (matrix[row][col] == target) {
                    found = true;
                    break;
                } else if (matrix[row][col] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(found);
            sc.close();
        }
    }

