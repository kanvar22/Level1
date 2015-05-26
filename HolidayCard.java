// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {

	/* VARIATIONS: 
	 * 6. Add a red light at the top of the tree. */
	
	TurtlePanel programWindow;
	double widthOfTree;

	/* 1. Implement this method to draw the body of the tree */
	void drawTreeBody() {
		// Make a variable for turnAmount and set it to 175

		// Make a variable that sets the scale to 1.1

		// Do the following 11 times

			// Turn the tortoise the current turnAmount to the right
	
			// Set the widthOfTree to the current widthOfTree times the scale
	
			// Move the tortoise the width of a tree
	
			// Turn the tortoise the current turn amount to the left
	
			// Set the widthOfTree to the current widthOfTree times the scale again
	
			// Move the tortoise the tree width
	
			// Decrease turnAmount by 1
		
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	HolidayCard() {
		programWindow = Tortoise.getBackgroundWindow();
		Tortoise.setSpeed(10);
		
		/* 2. Only draw trees when the mouse is clicked. */
		// Add a mouse listener to the program window
		
		// Remove the call to drawTree 
		drawTree(200, 200);
	}

	/* 3. When the right mouse is clicked draw a tree or play music for the right mouse button. */
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("mouse click!");
		
		// If the left mouse button is down - SwingUtilities.isLeftMouseButton(mouseEvent)
		
			// draw a tree
		
		// Otherwise,
		
			// Call the method: drawGreetingAndSing()
		
	}

	/* 4. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the playMusic() method to play it
		
		// Use the writeGreeting() method to add a Christmas message

	}

	private void writeGreeting(String greeting) {
		Tortoise.getBackgroundWindow().getGraphics().drawString(greeting, 270, 50);
	}

	private void playMusic(String soundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		sound.play();
	}

	void drawTree(int x, int y) {
		drawTreeTop(x, y);
		drawTreeBody();
		drawTreeTrunk();
	}

	/* 5. Make the trees in the center smaller than those at the edges. */
	void drawTreeTop(int xPosition, int yPosition) {
		// Make a variable for the width of the programWindow
		
		// Make variable that holds the distance of the mouse from the center of the window. 
		
		// Make sure distance is always a positive number
		
		// Set tree width to the current distance divided by 10
		
		// Remove the line that sets the tree width to 15.

		// Set the length variable to 15
		widthOfTree = 15;
		// Set the orientation of the Tortoise so that it is pointing straight down
		Tortoise.setOrientation(xPosition, yPosition, 180);
		// Change the color of the line the tortoise draws to forest green
		Tortoise.setPenColor(Colors.Greens.ForestGreen);
		// Change the width of the line to the current length divided by 5
		Tortoise.setPenWidth((int) (widthOfTree / 5));
		// Move the tortoise half the current length
		Tortoise.move(widthOfTree / 2);
		// Turn the tortoise to the left (90 degrees)
		Tortoise.turn(-90);
		// Move the tortoise half of the current length
		Tortoise.move(widthOfTree / 2);

	}

	void drawTreeTrunk() {
		// ' Turn the tortoise 180 degrees to the right
		Tortoise.turn(180);
		// ' Move the tortoise half of the current length
		Tortoise.move(widthOfTree / 2);
		// ' Change the tortoise so that it is pointing straight down
		Tortoise.turn(270);
		// ' Change the width of the line to the current length divided by 10
		Tortoise.setPenWidth((int) (widthOfTree / 10));
		// ' Change the color of the line the tortoise draws to brown
		Tortoise.setPenColor(Colors.Browns.Brown);
		// ' Move the tortoise a quarter the current length
		Tortoise.move(widthOfTree / 4);
	}

}



