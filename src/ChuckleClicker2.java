import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker2 implements ActionListener {
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();

	public static void main(String[] args) {
		ChuckleClicker2 chuckle = new ChuckleClicker2();
		chuckle.makeButtons();
	}

	private void makeButtons() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(bt1);
		panel.add(bt2);
		frame.setVisible(true);
		bt1.setText("Joke");
		bt2.setText("punchline");
		frame.pack();
		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent argO) {
		// TODO Auto-generated method stub
		System.out.println("sal;djflksjf;lskadf");
		if (argO.getSource() == bt1) {
			System.out.println("Why did the chicken cross the road.");
		}
		if (argO.getSource() == bt2) {
			System.out.println("`because he was to dumb to realize the grosrey store was the other way.");
		}
	}
}
