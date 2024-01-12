import java.util.Scanner;

public class Palindrome {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter words");
            String aaa = scanner.nextLine();
            StringBuilder xxx = new StringBuilder(aaa);
            String result = "Palindrome";

            for(int i = 0; i < xxx.length() / 2; i++){
                result = xxx.charAt(i) != xxx.charAt(xxx.length() - 1 - i) ? "Not Palindrome" : result;
                    }

                    System.out.println(result);
                    scanner.close();
            }

}
