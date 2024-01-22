public class Main {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }

    public static void printDayOfWeek(int day) {

        String printDayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("The number of the day: " + day);
        System.out.println("The day: " + printDayOfWeek);

    }

    public static void printWeekDay(int day) {

        String printDayOfWeek;

        if (day == 0) {
            printDayOfWeek = "Sunday";
        } else if (day == 1) {
            printDayOfWeek = "Monday";
        } else if (day == 2) {
            printDayOfWeek = "Tuesday";
        } else if (day == 3) {
            printDayOfWeek = "Wednesday";
        } else if (day == 4) {
            printDayOfWeek = "Thursday";
        } else if (day == 5) {
            printDayOfWeek = "Friday";
        } else if (day == 6) {
            printDayOfWeek = "Saturday";
        } else {
            printDayOfWeek = "Invalid Day";
        }

        System.out.println("The number of the day: " + day);
        System.out.println("The day: " + printDayOfWeek);

    }

}
