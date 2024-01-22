public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " can be divided by both 3 and 5.");
                sum += i;
                count++;
                if (count == 5) {
                    System.out.println("  We found 5 numbers - Exit");
                    break;
                }
            }
        }

        System.out.println(" ");
        System.out.println("The sum of the numbers: " + sum);

    }



}
