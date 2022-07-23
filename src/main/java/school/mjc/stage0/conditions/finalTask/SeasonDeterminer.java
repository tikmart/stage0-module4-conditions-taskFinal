package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public static void tellTheSeason(int monthNumber) {

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;


            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;


            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Wrong month number");
        }
    }

    public static void main(String [] args) {
        tellTheSeason(2);
        tellTheSeason(12);
        tellTheSeason(6);
        tellTheSeason(0);
    }
}
