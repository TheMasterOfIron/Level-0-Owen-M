import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String Passcode = "Shadow Wolf";
		String Message = JOptionPane.showInputDialog("Give me a message to store in the super secure safe.");
		String Pass = JOptionPane.showInputDialog("Enter passcode to read secret message.");
		if (Pass.equals(Passcode)) {
			JOptionPane.showMessageDialog(null, Message + "");
		}
		else{JOptionPane.showMessageDialog(null, "I thought point was to break into it not fail horribly while trying.");
		}
}
}
// 0. Make a main method and put steps 1-5 inside it

// 1. Set the passcode in a String variable

// 2. Using a pop-up, ask for a secret message and store it in a variable

// 3. Ask your friend for the passcode and store it in a variable

// 4. If the passcode matches, show the secret message

// 5. If the passcode does not match, pop-up "INTRUDER!!"

// [optional] 6. Have your friend also enter a username, and make sure it is
// correct before releasing the secret message.