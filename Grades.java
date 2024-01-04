import java.util.*;

public class Grades {

    public void enterGrade(int score){

        if(score >= 90 ){
            System.out.println("Your Grade is A");
        }else if(score >= 80){
            System.out.println("Your Grade is B");
        }else if(score >= 70){
            System.out.println("Your Grade is C");
        }else if(score >= 60){
            System.out.println("Your Grade is D");
        }else {
            System.out.println("Your Grade is F");
        }

    }

    public static void main(String[] args) {
        
        Grades grades = new Grades();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");

        // to prevent string inputs
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid grade:");
            scanner.next(); 
        }
        int gr = scanner.nextInt();
        if (gr >= 0 && gr <= 100) {
            grades.enterGrade(gr);
        }else {
            System.out.println("Grade ranges between 0 and 100 only.");
        }
            scanner.close();
    }
    
}