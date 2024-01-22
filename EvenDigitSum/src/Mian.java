public class Mian {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {

        int num = number;
        int evenDigit = 0;
        int evenDigitSum = 0;

        if (number >= 0) {
            while (num > 0) {
                evenDigit = (num % 10);
                if (evenDigit % 2 == 0) {
                    evenDigitSum += evenDigit;
                }
                num = num / 10;
            }

            return evenDigitSum;
        }
        else return -1;
    }


}
