package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE 
	
	Robot Jack = new Robot();
Jack.setRandomPenColor();
		
Jack.penDown();	
for (int i = 0; i < 4; i++) {
	Jack.move(3);		
Jack.turn(-300);
}
	
	
	}
}