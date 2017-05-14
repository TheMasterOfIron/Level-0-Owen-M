import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		for (;;) {
			int randomNumber = new Random().nextInt(4);
			System.out.println(randomNumber);
			String answer = JOptionPane.showInputDialog("What would you like to know?");
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "Yes.");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "No.");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Maybe you should ask Google.");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "On second thought im too lazy to answer your question.");
			}
		}
	}
}