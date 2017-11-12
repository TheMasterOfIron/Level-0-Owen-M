import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog(null, "What is your favorite color?");
	JOptionPane.showMessageDialog(null, "Oh " + color + " is my favorite color too.");
	Robot Dave = new Robot();
	Dave.penDown();
	Dave.turn(-90);
	Dave.move(100);
	Dave.turn(120);
	Dave.move(100);
	Dave.turn(120); 
	Dave.move(100);
	
}

}
