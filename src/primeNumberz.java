import javax.swing.JOptionPane;

public class primeNumberz {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Put a number in if you are not sure if it is prime or not.");
		int number = Integer.parseInt(num);
		for (int n = 2; n < number; n++) {
			if (number % n == 0) {
				JOptionPane.showMessageDialog(null, number + " is not prime.");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, number + " is prime");
	}
}
