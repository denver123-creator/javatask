import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;


public class NumberToMonth {

    public void numberofMonth(int month){
           Year currentYear = Year.now();
           int yearValue = currentYear.getValue();
           LocalDate date = LocalDate.of(yearValue, month, 1);
           int numberDaysOftheMonth =  date.lengthOfMonth();

        switch(month){
            case 1: System.out.println("The Month is January Number of days is: " + numberDaysOftheMonth); break;
            case 2: System.out.println("The Month is February Number of days is: " + numberDaysOftheMonth); break;
            case 3: System.out.println("The Month is March Number of days is: " + numberDaysOftheMonth); break;
            case 4: System.out.println("The Month is April Number of days is: " + numberDaysOftheMonth); break;
            case 5: System.out.println("The Month is May Number of days is: " + numberDaysOftheMonth); break;
            case 6: System.out.println("The Month is June Number of days is: " + numberDaysOftheMonth); break;
            case 7: System.out.println("The Month is July Number of days is: " + numberDaysOftheMonth); break;
            case 8: System.out.println("The Month is August Number of days is: " + numberDaysOftheMonth); break;
            case 9: System.out.println("The Month is September Number of days is: " + numberDaysOftheMonth); break;
            case 10: System.out.println("The Month is October Number of days is: " + numberDaysOftheMonth); break;
            case 11: System.out.println("The Month is November Number of days is: " + numberDaysOftheMonth); break;
            case 12: System.out.println("The Month is December Number of days is: " + numberDaysOftheMonth); break;
            default:System.out.println("invalid month" + month);
        }
    }
    public static void main(String[] args){

        NumberToMonth theMonth = new NumberToMonth();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month number:");
        if (scanner.hasNextInt()) {
            int numberofMonth = scanner.nextInt();
            if (numberofMonth >= 1 && numberofMonth <= 12) {
                theMonth.numberofMonth(numberofMonth);
            } else {
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close();
    }
}



