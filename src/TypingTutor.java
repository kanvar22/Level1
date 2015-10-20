import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor
{
	public static void main(String[] args)
	{
		TypingTutor typing = new TypingTutor();
	}

	public TypingTutor()
	{
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("" + currentLetter);
		frame.setVisible(true);
		frame.pack();
	}

	char currentLetter = generateRandomLetter();

	char generateRandomLetter()
	{
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

}
