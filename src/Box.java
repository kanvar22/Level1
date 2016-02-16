import java.applet.AudioClip;
import java.applet.AudioClip;
import java.io.File;
import java.io.File;
import java.net.MalformedURLException;
import java.net.MalformedURLException;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Box {

	private Present gift;

	public static void main(String[] args) {
		/* Your goal is to pick a gift and put it in a box */
		Box box = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		Present p = new Present("iphone4");
		Present p2 = new Present(" Ps4 ");
		Present p3 = new Present(" iphone7");
		box.putGift(p);
		box.openGift();
		box2.putGift(p2);
		box2.openGift();
		box3.putGift(p3);
		box3.openGift();
	}

	Box() {
		System.out.println("You Chose a Box!!");
	}

	public void putGift(Present present) {
		this.gift = present;
	}

	public void openGift() {
		if (gift == null) {
			JOptionPane.showMessageDialog(null, "There is no gift in the box");
		} else {
			gift.openGift();
		}
	}

}

class Present {

	private String name;

	public Present(String present) {
		this.name = present;
	}

	public void openGift() {
		AudioClip sound;
		try {
			sound = JApplet
					.newAudioClip(new File("/Users/League/Google Drive/league-sounds/me-gusta.wav").toURI().toURL());
			sound.play();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
