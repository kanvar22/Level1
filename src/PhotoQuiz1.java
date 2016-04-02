
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz1 {
	// Component photo;
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		quizWindow.setSize(300, 300);
		Component photo;
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String url = "file:///Users/league/Desktop/Pony.png";

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component
		photo = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(photo);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equals("Pony")) {
			JOptionPane.showMessageDialog(null, "You are Correct?");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Your INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(photo);
		// 10. find another image and create it (might take more than one line
		// of code)
		String url1 = "https://s-media-cache-ak0.pinimg.com/736x/f2/91/c9/f291c96a436b892f883fa41c4b8fdfc1.jpg";
		// 11. add the second image to the quiz window
		photo = createImage(url1);
		quizWindow.add(photo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String ans1 = JOptionPane.showInputDialog("What is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (ans1.equals("Cool Car")) {
			JOptionPane.showMessageDialog(null, "Your correct");
		} else {
			JOptionPane.showMessageDialog(null, "Your Incorrect");
		}
		quizWindow.remove(photo);
		String url2 = "http://orig14.deviantart.net/1069/f/2011/092/a/2/mudkips_by_rooty_the_hazard-d2zh7pg.png";
		photo = createImage(url2);
		quizWindow.add(photo);
		quizWindow.pack();
		String ans2 = JOptionPane.showInputDialog("What pokemon is this?");
		if (ans2.equals("Mudkip")) {
			JOptionPane.showMessageDialog(null, "Your Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Your Incorrect");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
