package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void printDays(int year, int month) {


        if (year > 0 && (year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))){

            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;

                case 2:
                    System.out.println(29);
                    break;

                default:
                    System.out.println("invalid date");
                    break;
            }

        } else if (year > 0) {
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;

                case 2:
                    System.out.println(28);
                    break;

                default:
                    System.out.println("invalid date");
                    break;
            }


        } else {
            System.out.println("invalid date");
        }


    }

    public static void main(String[] args) {
        printDays(2001, 2);
        printDays(2001, 6);
        printDays(2000, 2);
        printDays(1900, 2);
        printDays(2004, 2);
        printDays(2000, 13);
        printDays(-2000,13);
    }
}
