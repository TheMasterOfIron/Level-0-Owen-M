import javax.swing.JOptionPane;
	import java.awt.Color;
	import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
public class Turtle {
		public static void main(String[] args) {
				String color;
			color=JOptionPane.showInputDialog("What color do you want the fast turtle to poop out Red, Blue, Or green?");
			if(color.equalsIgnoreCase("red")){
			Tortoise.setPenColor(Color.red);
		}
		else if(color.equalsIgnoreCase("green")){
			Tortoise.setPenColor(Color.green);
		}
		else if(color.equals("blue")){
			Tortoise.setPenColor(Color.blue);
		}
		else{
			Tortoise.penUp();
			Tortoise.hide();
			Tortoise.explode();
		}
			
		
			Tortoise.setSpeed(5);
			Tortoise.setPenWidth(10);
			Tortoise.penDown();
Tortoise.move(200);
Tortoise.turn(-90);
Tortoise.move(200);
Tortoise.turn(-90);
Tortoise.move(200);
Tortoise.turn(-90);
Tortoise.move(200);
		}
}