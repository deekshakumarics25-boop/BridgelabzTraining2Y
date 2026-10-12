import java.util.Scanner;

public class WordContains {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of sentences: ");
            int n = Integer.parseInt(sc.nextLine());

            String[] sentences = new String[n];

            for (int i = 0; i < n; i++) {
                sentences[i] = sc.nextLine();
            }

            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            String result = "Not Found";

            for (int i = 0; i < n; i++) {
                if (sentences[i].contains(word)) {
                    result = sentences[i];
                    break;
                }
            }

            System.out.println(result);
            sc.close();
        }
    }

