import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpamALot {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();
	JTextField jtf = new JTextField();

	public static void main(String[] args) {
		SpamALot spamlot = new SpamALot();

	}

	public SpamALot() {
		frame.add(panel);
		panel.add(jtf);
		panel.add(bt1);
		panel.add(bt2);
		frame.setVisible(true);
		frame.pack();
	}

}
