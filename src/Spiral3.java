
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Spiral3 {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		JOptionPane.showInputDialog("Would you like a square, triangle, or pentagon spiral?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		for (int i = 0; i < 90000000; i=i+1) {
			Tortoise.move(i);
			Tortoise.turn(90);
		}
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		/*Tortoise.move(90);
		Tortoise.turn(120);*/
	}

}



