import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class robotHouses {
	public static void main(String[] args) {

		Random randomNumberMaker = new Random();
		Robot houseclimber = new Robot();
		houseclimber.hide();
		Robot.setWindowColor(0, 0, 0);
		int height = houseclimber.getWindow().getHeight();
		houseclimber.setX(50);
		houseclimber.setY(height - 50);
		houseclimber.penDown();
		houseclimber.setSpeed(10);
		//27 is the max amount of houses on the screen.
		for (int i = 0; i < 27; i++) {
			houseclimber.setRandomPenColor();
			//Generates random number for building height between 100-500.
			int random = randomNumberMaker.nextInt(400) + 100;
			//Moves the random height
			houseclimber.move(random);
			//Peaked house
			if(random < 300){
				houseclimber.turn(45);
				houseclimber.move(25);
				houseclimber.turn(90);
				houseclimber.move(25);
				houseclimber.turn(45);
				houseclimber.move(random);
			}
			//Flat roofed houses
			else if(random > 475){
				houseclimber.turn(45);
				houseclimber.move(25);
				houseclimber.turn(-45);
				houseclimber.move(75);
				houseclimber.turn(180);
				houseclimber.move(75);
				houseclimber.turn(-45);
				houseclimber.move(25);
				houseclimber.turn(45);
				houseclimber.move(random);
			}
			//Skyscrapers(2 in one city is rare)
			else{
			houseclimber.turn(90);
			houseclimber.move(50);
			houseclimber.turn(90);
			houseclimber.move(random);
			}	
			houseclimber.turn(-90);
			houseclimber.setPenColor(Color.green);
			houseclimber.move(25);
			houseclimber.turn(-90);

			}
			
		}
}
