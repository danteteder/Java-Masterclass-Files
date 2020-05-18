public class Main {

    public static void main(String[] args) {
	calcFeetAndInchesToCentimeters(6, 0);
	calcFeetAndInchesToCentimeters(5, 11);

	calcFeetAndInchesToCentimeters(100);
	sum(5, 7);
	sum(5, 7, 10, 12);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if((feet <0) || (inches <0 && inches >12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
       if(inches < 0) {
           return -1;
       }
       double feet = (int) inches / 12;
       double remainingInches = (int) inches % 12;
        System.out.println(inches +  " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    //another example of method overloading
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
