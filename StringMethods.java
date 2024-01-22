public class StringMethods {

    public static void main(String[] args) {
        String sampleString = "denver";
        System.out.println("length of the string: "+ sampleString.length());
        System.out.println("length of the string: "+ sampleString.toUpperCase());
        System.out.println("length of the string: "+ sampleString.toLowerCase());
        System.out.println("length of the string: "+ sampleString.charAt(0));
        System.out.println("length of the string: "+ sampleString.charAt(sampleString.length() - 1));
        System.out.println("length of the string: "+ sampleString.substring(1,5));
    }   
}


/*
    1. Find and print the length of the string.
    2. Convert the string to uppercase and print it.
    3. Convert the string to lowercase and print it.
    4. Print the first character of the string.
    5. Print the last character of the string.
    6. Print the substring starting from the second character to the fifth character of the string

 */