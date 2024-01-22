public class Main {

    public static void main(String[] args) {

        numberToWords(123);

    }

    public static void numberToWords(int number) {
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            int result = 0;
            int num = number;

            while (num > 0) {
                result = num % 10;
                switch (result) {
                    case 0 -> System.out.print("Zero ");
                    case 1 -> System.out.print("One ");
                    case 2 -> System.out.print("Two ");
                    case 3 -> System.out.print("Three ");
                    case 4 -> System.out.print("Four ");
                    case 5 -> System.out.print("Five ");
                    case 6 -> System.out.print("Six ");
                    case 7 -> System.out.print("Seven ");
                    case 8 -> System.out.print("Eight ");
                    case 9 -> System.out.print("Nine ");
                }
                num /=  10;
            }


        }
    }




}
