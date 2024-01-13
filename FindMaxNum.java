public class Main { 
 public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        for(int i = 0; i < 3; i++){
            int x = scanner.nextInt();
            nums.add(x);
        }
        int largest = nums.get(0);
        for (int num : nums){
            if (largest < num) {
                largest = num;
            }
        }

        System.out.println("The largest number is: " + largest);
 }
}
