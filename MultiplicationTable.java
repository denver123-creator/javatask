public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int mul = i * j;
                System.out.print(j + "x" + i + "=" + mul + "\t");
            }
            System.out.println();
            //comment
        }
    }
}
