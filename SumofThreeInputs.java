import java.util.Scanner;
import java.util.Arrays;

public class SumofThreeInputs {

    public static void main(String[] args) {

        int[] inputs = new int[3];
        int results = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add three numbers separated by space: ");
        
        for(int i = 0; i < inputs.length; i++){
            int input = scanner.nextInt();
            inputs[i] = input;
            results +=input;     
        }

        System.out.println("The three inputs are: " + Arrays.toString(inputs));
        System.out.println( "the sum of all inputs: " + results);
        scanner.close();
   
    
        
    }
    
}
