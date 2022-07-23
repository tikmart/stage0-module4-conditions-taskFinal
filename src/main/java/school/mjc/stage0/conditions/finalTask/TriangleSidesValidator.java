package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void validate(double firstSide, double secondSide, double thirdSide) {

        if(firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && thirdSide + firstSide > secondSide) {

            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }

    }

    public static void main(String [] args) {

        validate(1,4,4);
        validate(1,0,4);
        validate(1,-1,4);
        validate(1,7,4);
    }
}
