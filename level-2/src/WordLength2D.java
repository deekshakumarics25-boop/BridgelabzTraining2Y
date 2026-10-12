import java.util.Scanner;

public class WordLength2D {
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int n = findLength(text);
        String[] temp = new String[n + 1];
        int count = 0;
        int start = 0;

        for (int i = 0; i <= n; i++) {
            if (i == n || text.charAt(i) == ' ') {
                if (start < i) {
                    String word = "";

                    for (int j = start; j < i; j++) {
                        word = word + text.charAt(j);
                    }

                    temp[count] = word;
                    count++;
                }

                start = i + 1;
            }
        }

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = temp[i];
        }

        return words;
    }

    public static String[][] wordLength2D(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = wordLength2D(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t"
                    + Integer.parseInt(result[i][1]));
        }

        sc.close();
    }
}
