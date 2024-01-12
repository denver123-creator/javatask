import java.util.Scanner;

public class NumberToDay {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days;
        while (true) {
            System.out.println("Enter number of day:");

            if (scanner.hasNextInt()) {
                days = scanner.nextInt();
                break; 
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }
  
        switch(days){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println("invalid input");
        }

        scanner.close();

    }
}
