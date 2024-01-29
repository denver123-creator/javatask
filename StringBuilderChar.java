    interface StrMethods{
        public void stringTenMethods(StringBuilder xx);
    }

public class StringBuilderChar{

    public static void main(String[] args) {
        
        StrMethods anyWords = (StringBuilder xx) -> {

            System.out.println("1 The length of the string: " + xx.length());
            System.out.println(" 2 The first character of the string: " + xx.charAt(0));
            System.out.println("3 The last character of the string "+ xx.charAt(xx.length() - 1));
            System.out.println("4 " + xx.indexOf("a"));
            System.out.println("5 " + xx.substring(3,6));
            System.out.println("6 " + xx.append("123"));
            System.out.println("7 " + xx.insert(4, "xyz")); 
            System.out.println("8 " + xx.delete(2, 4));
            System.out.println("9 " + xx.deleteCharAt(8));
            System.out.println("10 " + xx.reverse());

            
        };

        StringBuilder www = new StringBuilder("denver a. publico");
        anyWords.stringTenMethods(www);

    }

}
