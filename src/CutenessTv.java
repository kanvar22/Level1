import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();
	JButton bt3 = new JButton();
	JButton bt4 = new JButton();

	CutenessTv() {
		bt1.setText("Cute Ducks");
		bt2.setText("Frogs");
		bt3.setText("Unicorns");
		bt4.setText("Random");
		frame.add(panel);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		CutenessTv ct = new CutenessTv();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		if (e.getSource() == bt4) {
			Random rand = new Random();

			int n = rand.nextInt(3) + 1;
			System.out.println(n);
			// if statments
			if (n == 1) {
				showDucks();
			} else if (n == 2) {
				showFrog();
			} else {
				showFluffyUnicorns();
			}

		} else if (e.getSource() == bt1) {
			showDucks();
		} else if (e.getSource() == bt2) {
			showFrog();
		} else {
			showFluffyUnicorns();
		}
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
