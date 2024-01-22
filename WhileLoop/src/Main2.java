public class Main2 {

    public static void main(String[] args) {

        int totalOdd = 0;
        int totalEven = 0;
        int i = 5;
        while (i <= 20) {
            if (isEvenNumber(i) == true){
                System.out.print(i + "_");
                totalEven++;
            } else {
                totalOdd++;
            }
            if (totalEven == 5){
                break;
            }
            i++;
        }
        System.out.println();
        System.out.println("Total of the even numbers: " + totalEven);
        System.out.println("Total of the even numbers: " + totalOdd);


    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else return false;
    }

}
