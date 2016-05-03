import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Unicorn implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bt1 = new JButton("blue");
	JButton bt2 = new JButton("red");
	JButton bt3 = new JButton("green");
	JLabel text = new JLabel();
	String color;
	int textSize;
	String font;
	String backgroungColor;

	public static void main(String[] args) {
		Unicorn corn = new Unicorn("blue", 21, "Arial", "Red");

	}

	public Unicorn(String color, int textSize, String font, String backgroungColor) {
		frame.add(panel);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(text);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		this.color = color;
		this.textSize = textSize;
		this.font = font;
		this.backgroungColor = backgroungColor;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
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
	}
}
