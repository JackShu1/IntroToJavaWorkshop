package day3;

import javax.swing.JOptionPane;

public class Greeting {
public static void main(String[] args) {
String ans=JOptionPane.showInputDialog("Hello, what is your name?");	
JOptionPane.showMessageDialog(null, "Hello "+ans);	


String answer=JOptionPane.showInputDialog("What is your favorite food?");	
JOptionPane.showMessageDialog(null, "I like "+answer+" too!" );	
		
	
String answer1=JOptionPane.showInputDialog("What is your favorite sport?");	
JOptionPane.showMessageDialog(null, "I heard that "+answer1+" is fun!" );		
	

String answer11=JOptionPane.showInputDialog("What is your favorite book?");	
JOptionPane.showMessageDialog(null, "Mine is Harry Potter!" );		
	


}
}
