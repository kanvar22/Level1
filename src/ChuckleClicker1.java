import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker1 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();

	public static void main(String[] args) {
		ChuckleClicker1 cc = new ChuckleClicker1();
		cc.makeButtons();
	}

	void makeButtons() {
		bt1.setText("Joke");
		bt2.setText("Punchline");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		frame.add(panel);
		panel.add(bt1);
		panel.add(bt2);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (bt1 == e.getSource()) {

			JOptionPane.showMessageDialog(null, "What dop you call a security gaurd that gaurds Samsaung");
		} else if (bt2 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Gaurdians of the galaxy");
		}
	}
}
