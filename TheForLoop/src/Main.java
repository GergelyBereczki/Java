public class Main {

    public static void main(String[] args) {

        for (int counter = 0; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000,rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));
    }

}
