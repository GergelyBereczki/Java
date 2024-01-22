public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number) {

        int newNumber = number;
        int firstDigit = 0;
        int lastDigit = number % 10;

        if (number >= 0) {
            while (newNumber > 0) {
                firstDigit = (newNumber % 10);
                newNumber = newNumber / 10;
            }
        } else return -1;



        return firstDigit + lastDigit;
    }


}
