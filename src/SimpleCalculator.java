import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textf = new JTextField();
	JTextField textj = new JTextField();
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();
	JButton bt3 = new JButton();
	JButton bt4 = new JButton();
	JButton bt5 = new JButton();
	JLabel label = new JLabel();

	public SimpleCalculator() {
		frame.add(panel);
		panel.add(textf);
		panel.add(textj);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		panel.add(bt5);
		panel.add(label);
		bt1.setText("+");
		bt2.setText("-");
		bt3.setText("*");
		bt4.setText("/");
		bt5.setText(">");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		textf.setColumns(4);
		textj.setColumns(4);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();

	}

	public double add(double text, double text1) {
		return text + text1;
	}

	public double sub(double text, double text1) {
		return text - text1;
	}

	public double mul(double text, double text1) {
		return text * text1;
	}

	public double div(double text, double text1) {
		return text / text1;
	}

	public boolean grea(double text, double text1) {
		return text > text1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		double a = Double.parseDouble(textf.getText());
		double b = Double.parseDouble(textj.getText());
		if (e.getSource() == bt1) {
			double c = add(a, b);
			label.setText("" + c);
		}
		if (e.getSource() == bt2) {
			double d = sub(a, b);
			label.setText("" + d);
		}
		if (e.getSource() == bt3) {
			double f = mul(a, b);
			label.setText("" + f);
		}
		if (e.getSource() == bt4) {
			double g = div(a, b);
			label.setText("" + g);
		}
		if (e.getSource() == bt5) {
			boolean h = grea(a, b);
			label.setText("" + h);
		}

	}
}
