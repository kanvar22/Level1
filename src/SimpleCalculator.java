import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	int text;
	int text1;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField text = new JTextField();
		JTextField text1 = new JTextField();
		JButton bt1 = new JButton();
		JButton bt2 = new JButton();
		JButton bt3 = new JButton();
		JButton bt4 = new JButton();
		JLabel label = new JLabel();
		frame.add(panel);
		panel.add(text);
		panel.add(text1);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		panel.add(label);
		bt1.setText("add");
		bt2.setText("sub");
		bt3.setText("mul");
		bt4.setText("div");
		text.setColumns(4);
		text1.setColumns(4);
		frame.setVisible(true);
		frame.pack();
	}

	public int add(int text, int text1) {
		return text + text1;
	}

	public int sub(int text, int text1) {
		return text - text1;
	}

	public int mul(int text, int text1) {
		return text * text1;
	}

	public int div(int text, int text1) {
		return text / text1;
	}
}
