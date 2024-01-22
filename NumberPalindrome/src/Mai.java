public class Mai {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(1654561));
        System.out.println(isPalindrome(1546448431));
        System.out.println(isPalindrome(545464545));

    }

    public static boolean isPalindrome(int number) {

        int num = number;
        int reverse = 0;
        if (number > 0) {
            while (num > 0) {
                int lastDigit = num % 10;
                reverse = reverse * 10;
                reverse = reverse + lastDigit;
                num = num / 10;
            }
        } else {
            while (num < 0) {
                int lastDigit = num % 10;
                reverse = reverse * 10;
                reverse = reverse + lastDigit;
                num = num / 10;
            }
        }
        if (reverse == number) {
            return true;
        } else return false;
    }


}
