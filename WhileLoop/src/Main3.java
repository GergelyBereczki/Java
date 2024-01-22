public class Main3 {

    public static void main(String[] args) {

        System.out.println(sumDigits(1324));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));

    }

    public static int sumDigits(int num) {

        if (num < 0) {
            return -1;
        }

        int sum = 0;

        while (num > 9 ) {
            sum += (num % 10);
            num = num /10;
        }

        sum += num;

        return sum;
    }

}
