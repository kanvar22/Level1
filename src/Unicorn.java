import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Unicorn implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bt1 = new JButton("");
	JButton bt2 = new JButton("");
	JButton bt3 = new JButton("");
	JLabel text = new JLabel();
	String font;
	int qnumber = 0;
	TextOption color = new TextOption("Blue", "Red", "Green", "Color");
	TextOption textSize = new TextOption("Small", "Medium", "Large", "textSize");
	TextOption backgroundColor = new TextOption("blue", "red", "green", "backgroundColor");

	public static void main(String[] args) {
		Unicorn corn = new Unicorn("blue", 21, "Arial", "Red");
	}

	public Unicorn(String color, int textSize, String font, String backgroungColor) {
		frame.add(panel);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(text);
		bt1.setText(this.color.gO1());
		bt2.setText(this.color.gO2());
		bt3.setText(this.color.gO3());
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		this.font = font;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (qnumber == 0) {

			if (buttonPressed == bt1) {
				text.setText("You hit blue");
				text.setForeground(Color.BLUE);
			} else if (buttonPressed == bt2) {
				text.setText("You hit red");
				text.setForeground(Color.red);
			} else if (buttonPressed == bt3) {
				text.setText("You hit green");
				text.setForeground(Color.green);
			}
			bt1.setText(this.textSize.gO1());
			bt2.setText(this.textSize.gO2());
			bt3.setText(this.textSize.gO3());
		}
		if (qnumber == 1) {
			if (buttonPressed == bt1) {
				text.setText("You hit Small");
				text.setFont(new Font("Calibri", 10, 10));
			}
			if (buttonPressed == bt2) {
				text.setText("You hit Medium");
				text.setFont(new Font("Calibri", 20, 20));
			}
			if (buttonPressed == bt3) {
				text.setText("You hit Large");
				text.setFont(new Font("Calibri", 30, 30));
			}
		}
		bt1.setText(this.backgroundColor.gO1());
		bt1.setText(this.backgroundColor.gO2());
		bt1.setText(this.backgroundColor.gO3());
		if (qnumber == 2) {
			if (buttonPressed == bt1) {
				text.setText("You hit Small");
				text.setFont(new Font("Calibri", 10, 10));
			}
			if (buttonPressed == bt2) {
				text.setText("You hit Medium");
				text.setFont(new Font("Calibri", 20, 20));
			}
			if (buttonPressed == bt3) {
				text.setText("You hit Large");
				text.setFont(new Font("Calibri", 30, 30));
			}
		}
		qnumber = qnumber + 1;
	}
}
