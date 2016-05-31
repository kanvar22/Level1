import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		TypingTutor typing = new TypingTutor();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public TypingTutor() {
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("" + currentLetter);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();
	}

	char currentLetter = generateRandomLetter();

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("" + currentLetter);
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			frame.setBackground(Color.GREEN);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = e.getKeyChar();
		label.setText("" + currentLetter);
	}

}
