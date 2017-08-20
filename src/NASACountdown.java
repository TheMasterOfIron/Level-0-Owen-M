import javax.swing.JOptionPane;

public class NASACountdown {
public static void main(String[] args) {
	
	String answer=JOptionPane.showInputDialog("What number do we start at?");
	int a=Integer.parseInt(answer);
	for (int c = a; c > 0; c--) {
speak("t minus"+Integer.toString(c));
	}
speak("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiimmmmmmmmmmmmmmmmmmmmmmmmmmmmmm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaannnnnnnnnnnnnnnnnnnnnnnnnnnnnnoooooooooooooooooooooooooooyyyyyyyyyyyyyyyyyyyyyyyyiiiiiiiiiiiiiiiiiiiiiiiiinnnnnnnnnnnnnnnnnnnnnnnngggggggggggggggggggggg");
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
 }

}
 