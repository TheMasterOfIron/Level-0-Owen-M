import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
 
import javax.swing.JOptionPane;
 
import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;
 
/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/
 
public class TortoiseTreasureHunt implements KeyEventDispatcher {
 
	int tortoiseSpeed = 20;
 
	private void goUp() {
		// 1. Make the tortoise move up the screen
 Tortoise.move(5);
	}
 
	private void goDown() {
		// 2. make the tortoise move down the screen
 Tortoise.turn(180);
 Tortoise.move(1);
	}
 
	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		Tortoise.turn(-90);
		// Hint: the turn() method lags more than setAngle()
 
	
	
	}
 
	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.turn(90);
	}
 
	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
 System.out.println(tortoiseLocationX);
 System.out.println(tortoiseLocationY);
		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
 if (tortoiseLocationX == 500&&tortoiseLocationY == 300) {
	 JOptionPane.showMessageDialog(null, "Girl: Here is a clue for you, go to the dead giants skull and go to the eye of the giant that has not been impaled by the tree. listen for the echo it will tell you. I can not show you because im tied up so use my clue for help.");
}
 else if (tortoiseLocationX == 140&& tortoiseLocationY == 40)
	 JOptionPane.showMessageDialog(null, "Echo: There are rumors of a boy with dynomite in this forest ask him he might know. I cannot tell you because sound cannot hear sound can oly hear hear ear ar ar r ...");
		// 6. If tortoise is at same location as the little girl,
		// 			make a pop-up tell the Tortoise where to go next
 
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
 
		
	}
 
	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest for treasure. Controls:Press the space bar to ask for a clue, press k for suicide, press up arrowkey to move up, down arrowkey to move down, left arrowkey to move left, and right arrowkey to move right.");
	}
 
	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
			else if (e.getKeyCode() == KeyEvent.VK_K){
					Tortoise.explode();
			JOptionPane.showMessageDialog(null, "Good job you killed yourself!");
			}

		}
		return false;
	}
 
	public static void main(String[] args) throws MalformedURLException {
		new TortoiseTreasureHunt().go();
	}
}
 
