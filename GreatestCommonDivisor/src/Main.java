public class Main {

    public static void main(String[] args) {


        System.out.println(getGreatestCommonDivisor(1010, 10));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        } else {
            int remaind = 0;
            int remaind2 = 0;

            for (int i = 1; i <= first; i++) {
                if (first % i == 0) {
                    for (int j = 1; j <= second; j++) {
                        if (second % j == 0) {
                            remaind = j;
                        }
                        if (remaind == i) {
                            remaind2 = remaind;
                        }
                    }
                }
            }
            return remaind2;
        }
    }

}
