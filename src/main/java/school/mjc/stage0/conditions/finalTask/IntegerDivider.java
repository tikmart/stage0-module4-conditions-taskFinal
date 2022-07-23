package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {


        if(divider == 0){
            System.out.println("division by zero");
        } else {
            int result = dividend / divider;
            result = result * divider;

           if (result == dividend) {
            System.out.println("can be divided completely");
        }
            
           else {
            System.out.println("cannot be divided completely");
        }

        }

    }

    public static void main(String[] args) {
        printCompletelyDivided(25,5);
        printCompletelyDivided(25,15);
        printCompletelyDivided(25,0);
    }
}
