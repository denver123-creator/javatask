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
        }else if(score >= 50){
            System.out.println("Your Grade is F");
        }else{
            System.out.println("Invalid Grade");
        }  
    }

    public static void main(String[] args) {
        
        Grades grades = new Grades();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int gr = scanner.nextInt();
        grades.enterGrade(gr);
        scanner.close();

    }
    
}
