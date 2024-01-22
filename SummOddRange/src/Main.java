public class Main {

    public static void main(String[] args) {

//        sumOdd(1,100);
//        sumOdd(-1,100);
//        sumOdd(100,100);
//        sumOdd(13,13);
//        sumOdd(100,-100);
//        sumOdd(100,1000);

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));


    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else {
            if (number % 2 == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        } else {
            int lol = start;
            for (int i = lol; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum = sum + i;
                }
            }
        }
        return sum;
    }



}
