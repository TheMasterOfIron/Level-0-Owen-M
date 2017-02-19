import javax.swing.JOptionPane;

public class MadLibs {
public static void main(String[] args) {
String noun="";
String verb="";
String adjective="";
noun=JOptionPane.showInputDialog("noun");
verb=JOptionPane.showInputDialog("verb");
adjective=JOptionPane.showInputDialog("adjective");
JOptionPane.showMessageDialog(null, adjective+" "+noun+" "+verb+".");
}
}
