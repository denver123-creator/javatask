import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence or a string: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }

    private static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}