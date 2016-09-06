import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements ActionListener {

	public static void main(String[] args) {
		Test colorTeacher = new Test();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();
	JButton bt3 = new JButton();
	JButton bt4 = new JButton();

	public Test() {

		frame.add(panel);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		bt1.setBackground(Color.RED);
		bt1.setOpaque(true);
		bt1.addActionListener(this);
		bt2.setBackground(Color.BLUE);
		bt2.setOpaque(true);
		bt3.setBackground(Color.GREEN);
		bt3.setOpaque(true);
		bt4.setBackground(Color.YELLOW);
		bt4.setOpaque(true);
		frame.setSize(30, 30);
		frame.setTitle("Color Teacher");
		frame.pack();
		frame.setVisible(true);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt1) {
			speak("Red");
		}
		if (e.getSource() == bt2) {
			speak("Blue");
		}
		if (e.getSource() == bt3) {
			speak("Green");
		}
		if (e.getSource() == bt4) {
			speak("Yellow");
			System.out.println("hello");
		}
	}
}
