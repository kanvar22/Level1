import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton bt1 = new JButton(":-/");
		JButton bt2 = new JButton();
		JButton bt3 = new JButton(":-)");
		frame.add(panel);
		frame.add(bt1);
		frame.add(bt2);
		frame.add(bt3);
		frame.setVisible(true);
		frame.pack();
	}
}
