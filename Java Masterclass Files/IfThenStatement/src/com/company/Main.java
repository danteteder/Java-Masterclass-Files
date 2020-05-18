
public class Main {

    public static void main(String[] args) {
	boolean isAlien = false;
	if (isAlien == false) {
        System.out.println("It is not an alien!");
    }

	int topScore = 80;
	if (topScore < 100) {
        System.out.println("You got the high score!");
    }

	int secondTopScore = 60;
	//CHECKS IF 1 STATEMENT _AND_ SECOND STATEMENT IS TRUE
	if ((topScore > secondTopScore) && (topScore < 100)) {
        System.out.println("Greated than second top score and less than 100");
    }

	if ((topScore > 90) || (secondTopScore <= 90)) {
        System.out.println("Either or both of the conditions are true");
    }

	int newValue = 50;
	if (newValue == 50) {
        System.out.println("This is an error");
    }

	boolean isCar = false;
	if (isCar) {
        System.out.println("This is not supposed to happen");
    }

	boolean wasCar = isCar ? true : false;
	if (wasCar) {
        System.out.println("wasCar is true");
    }
    }
}
