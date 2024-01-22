public class Main2 {

    public static void main(String[] args) {

        double amount = 100.00;
        for (double i = 7.5; i <= 10.0; i += 0.25) {
            double interest = calculateInterest(amount, i);
            if (interest > 8.5) {
                break;
            }
            System.out.println("$" + amount + "0 at " + i + "% interest = $" + interest);
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }

}
