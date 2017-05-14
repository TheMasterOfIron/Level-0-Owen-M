import javax.swing.JOptionPane;

public class XGeekssuperpowers {
	public static void main(String[] args) {
		String owensSuperpower = "video gaming";
		String elijahsSuperpower = "math";
		String jackiesSuperpower = "dancing";
		for (;;) {
			String answer = JOptionPane.showInputDialog("What is your first name?");
			if (answer.equalsIgnoreCase("Jackie")) {
				JOptionPane.showMessageDialog(null, "Your superpower is " + jackiesSuperpower + ".");
			} 
			else if (answer.equalsIgnoreCase("Owen")) {
				JOptionPane.showMessageDialog(null, "Your superpower is " + owensSuperpower + ".");
			}
			else if (answer.equalsIgnoreCase("Elijah")) {
				JOptionPane.showMessageDialog(null, "Your superpower is " + elijahsSuperpower + ".");
			} 
			else {
				JOptionPane.showMessageDialog(null,
						"Sorry you're not on my lists. If you want to be on my list please ask Owen.");
			}
		}
	}
}
