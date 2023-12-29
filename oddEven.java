public class oddEven {

        static int check_number = 10;
        static String message;

    public static void main(String[] args) {

        for(int i = 1; i <= check_number; i++){
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            System.out.println(message);
        }  
    }
    
}
