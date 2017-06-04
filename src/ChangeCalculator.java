// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;
 
/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {
 
	public static void main(String[] args) {
		String stringPennies=JOptionPane.showInputDialog("How many pennies do you have?");
		int intPennies=Integer.parseInt(stringPennies);
	// Ask the user how many nickels they have
String stringNickels=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int intNickels=Integer.parseInt(stringNickels);
		// Ask the user how many dimes they have, and convert their answer
String stringDimes=JOptionPane.showInputDialog("How many dimes do you have?");
int intDimes=Integer.parseInt(stringDimes);
		// Ask the user how many quarters they have, and convert their answer
String stringQuarters=JOptionPane.showInputDialog("How many quarters do you have?");
int intQuarters=Integer.parseInt(stringQuarters);
		// Calculate how much money the user has and save it in a double variable 
 double money=intPennies*0.01;
 money+=intNickels*0.05;
 money+=intDimes*0.10;
 money+=intQuarters*0.25;
		// Tell the user how much money they have
 JOptionPane.showMessageDialog(null, "You have $"+money);
 if (true){
	 money=0.41000000000000003-0.00000000000000003;
	  }

 }
	}

 
