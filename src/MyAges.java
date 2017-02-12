import javax.swing.JOptionPane;

public class MyAges {
public static void main(String[] args) {
	String age;
	age=JOptionPane.showInputDialog("How old are you?");
	System.out.println(age);
	int ten=Integer.parseInt(age);
	for(int i=0;i<ten; i++){
		System.out.println("You have been "+i+" years old");
}
}
}