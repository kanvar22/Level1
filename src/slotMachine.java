import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class slotMachine implements ActionListener {
	static JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static JButton button = new JButton();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3 = new JTextField();

	public static void main(String[] args) {
		slotMachine machine = new slotMachine();
		machine.machine();
	}

	public void machine() {
		frame.add(panel);
		panel.add(button);
		panel.add(text1);
		panel.add(text2);
		panel.add(text3);
		frame.pack();
		frame.setVisible(true);
		button.setText("Spin");
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int rand = r.nextInt(2);
		rand = rand + 1;
		Random r2 = new Random();
		int rand2 = r2.nextInt(2);
		rand = rand + 1;
		Random r3 = new Random();
		int rand3 = r3.nextInt(2);
		rand = rand + 1;
		text1.setText("" + rand);
		text2.setText("" + rand2);
		text3.setText("" + rand3);
	}
}
