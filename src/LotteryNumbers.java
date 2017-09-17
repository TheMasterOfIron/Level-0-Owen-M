import javax.swing.JOptionPane;
import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random random = new Random();
		int r1 = random.nextInt(101);
		int r2 = random.nextInt(551) + 5;
		int r3 = random.nextInt(43) + 7;
		int r4 = random.nextInt(716) + 33;
		int r5 = random.nextInt(41) + 11;
		JOptionPane.showMessageDialog(null,
				"The lottery nubers are " + r1 + ", " + r2 + ", " + r3 + ", " + r4 + ", and " + r5 + ".");
	}
}