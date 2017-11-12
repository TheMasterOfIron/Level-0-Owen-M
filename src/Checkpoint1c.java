import javax.swing.JOptionPane;

public class Checkpoint1c {
public static void main(String[] args) {
	String animal = JOptionPane.showInputDialog(null, "What animal do you want?");
	if(animal .equals("Dog")) {
		System.out.println("Dogs go woof.");
		}
	else if (animal .equals("Cat")){
		System.out.println("Cat goes meow.");
	}
	else if (animal.equals("Fox")){
		System.out.println("Foxes go woof.");
	}
	else if (animal.equals("Snake")){
		System.out.println("Snakes go hiss.");
	}
	else if (animal.equals("Wolf")){
		System.out.println("Wolves go woof.");
	}
	else{
		System.out.println("I dont know that animal.");
	}
}
}
