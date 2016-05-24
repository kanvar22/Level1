import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryC implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField question = new JTextField(20);
	JTextField answer = new JTextField(20);

	public static void main(String[] args) {
		BinaryC Binary = new BinaryC();
	}

	BinaryC() {
		frame.add(panel);
		button.addActionListener(this);
		panel.add(question);
		panel.add(button);
		panel.add(answer);
		frame.setVisible(true);
		frame.pack();
		button.setText("Convert");
	}

	int convert1(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("[01]{8}", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String decimal = convert(question.getText());
		answer.setText(decimal + "");
	}
}
