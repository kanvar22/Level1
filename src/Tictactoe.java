import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tictactoe implements ActionListener {
	JPanel panel;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	String buttonText = "O";

	public static void main(String[] args) {
		Tictactoe tic = new Tictactoe();
	}

	Tictactoe() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (b1.equals(e.getSource())) {
			b1.setText(buttonText);
			changeTextButton();
		}
		if (b2.equals(e.getSource())) {
			b2.setText(buttonText);
			changeTextButton();
		}
		if (b3.equals(e.getSource())) {
			b3.setText(buttonText);
			changeTextButton();
		}
		if (b4.equals(e.getSource())) {
			b4.setText(buttonText);
			changeTextButton();
		}
		if (b5.equals(e.getSource())) {
			b5.setText(buttonText);
			changeTextButton();
		}
		if (b6.equals(e.getSource())) {
			b6.setText(buttonText);
			changeTextButton();
		}
		if (b7.equals(e.getSource())) {
			b7.setText(buttonText);
			changeTextButton();
		}
		if (b8.equals(e.getSource())) {
			b8.setText(buttonText);
			changeTextButton();
		}
		if (b9.equals(e.getSource())) {
			b9.setText(buttonText);
			changeTextButton();
		}
	}

	private void changeTextButton() {
		if (buttonText.equals("O")) {
			buttonText = "X";
		} else {
			buttonText = "O";
		}
	}

}
