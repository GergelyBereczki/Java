public class Main {

    public static void main(String[] args) {

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
        System.out.println(hasSameLastDigit (14, 22, 71));

    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {

        if (firstNum < 10 || firstNum > 1000 || secondNum < 10 || secondNum > 1000 || thirdNum < 10 || thirdNum > 1000){
            return false;
        } else {
            int lastNum1 = firstNum % 10;
            int lastNum2 = secondNum % 10;
            int lastNum3 = thirdNum % 10;
            if (lastNum1 == lastNum2 || lastNum1 == lastNum3 || lastNum2 == lastNum3) {
                return true;
            }
            return false;
        }
    }

    public static boolean isValid(int number) {

        if (number < 10 || number > 1000){
            return false;
        } else {
            return true;
        }
    }

}
