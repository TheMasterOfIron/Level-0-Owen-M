import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class robotHouses{
	public static void main(String[] args) {

		Random randomNumberMaker = new Random();
		Robot houseclimber=new Robot();
		houseclimber.hide();

		Robot.setWindowColor(0, 0, 0);
		int height=houseclimber.getWindow().getHeight();
		houseclimber.setX(50);
		houseclimber.setY(height-50);
		houseclimber.penDown();
		houseclimber.setSpeed(10);
		for (int i = 0; i < 10; i++) {
		houseclimber.setRandomPenColor();
		int random=randomNumberMaker.nextInt(400)+100;
        houseclimber.move(random);
        houseclimber.turn(90);
        houseclimber.move(50);
        houseclimber.turn(90);
        houseclimber.move(random);
        houseclimber.turn(-90);
        houseclimber.setPenColor(Color.green);
        houseclimber.move(25);
        houseclimber.turn(-90);
        }
		}
	}

