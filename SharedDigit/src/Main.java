public class Main {

    public static void main(String[] args) {


        System.out.println(hasSharedDigit(51, 55));


    }


    public static boolean hasSharedDigit(int firstNum, int secondNum) {

        int firstNumber = firstNum;
        int secondNumber = secondNum;

        int result1 = 0;
        int result2 = 0;

        if (firstNum < 10 || secondNum < 10 || firstNum > 99 || secondNum > 99 ) {
            return false;
        } else {
            while (firstNumber > 0) {
                result1 = firstNumber % 10;
                while (secondNumber > 0) {
                    result2 = secondNumber % 10;
                    if (result1 == result2) {
                        return true;
                    }
                    secondNumber = secondNumber / 10;
                }
                firstNumber = firstNumber / 10;
                secondNumber = secondNum;
            }
            return false;
        }
    }

}
