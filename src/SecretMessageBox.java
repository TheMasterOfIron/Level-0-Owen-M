import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String Name = "";
		String Passcode = JOptionPane.showInputDialog("What do you want the password to be.");
		String Message = JOptionPane.showInputDialog("Give me a message to store in the super secure safe.");
		String Nickname = JOptionPane.showInputDialog("Enter the nickname you want(for extra security).");
		String Pass = JOptionPane.showInputDialog("Enter passcode to read secret message.");
		if (Pass.equals(Passcode)) {
			Name = JOptionPane.showInputDialog(null, "Correct passcode now enter your username.");
		}
		if (Name.equals(Nickname)) {
			JOptionPane.showMessageDialog(null, "Message:" + Message);
		} else {
			JOptionPane.showMessageDialog(null,
					"Intruder detected deleting secret message  ...  Secret message deleted.\nYou Better run "
							+ Nickname + " is coming");
		}
	}
}