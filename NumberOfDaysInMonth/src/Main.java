public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(9999));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(12,10000));

    }

    public static boolean isLeapYear(int year) {

        if (year <= 0 || year >= 9999) {
            return false;
        } else {

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        int endMonth = 0;

        if (month < 1 || month > 12 ) {
            endMonth = -1;
        } else {
            if (year < 1 || year > 9999) {
                endMonth = -1;
            } else {
                if (isLeapYear(year) == false){
                    switch (month) {
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                            endMonth = 31;
                            break;
                        case 2:
                            endMonth = 28;
                            break;
                        case 4: case 6: case 9: case 11:
                            endMonth = 30;
                            break;
                    }
                } else {
                    switch (month) {
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                            endMonth = 31;
                            break;
                        case 2:
                            endMonth = 29;
                            break;
                        case 4: case 6: case 9: case 11:
                            endMonth = 30;
                            break;
                    }
                }
            }
        }
        return endMonth;
    }

}
