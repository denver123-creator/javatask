
import java.util.Scanner;

public class VowelsOrConsonants {

    public static void main(String[] args) {
        
        Scanner inputLetters = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        
        if (inputLetters.hasNext()) {
            String letter = inputLetters.nextLine().toLowerCase();

            if (letter.length() == 1 && Character.isLetter(letter.charAt(0))) {
                switch (letter) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                        System.out.println(letter + " is VOWEL");
                        break;
                    default:
                        System.out.println( letter + " is CONSONANT");
                        break;
                }
            } else {
                System.out.println("Please enter a valid single letter.");
            }
        } else {
            System.out.println("Enter a letter only.");
        }

        inputLetters.close();
    }
}
