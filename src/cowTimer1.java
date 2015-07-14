import java.applet.AudioClip;
import java.io.IOException;

import javax.swing.JApplet;

public class cowTimer1 {
public static void main(String[] args) throws InterruptedException {
	cowTimer1 cowtimer = new cowTimer1();
	cowtimer.setTime(5);
	cowtimer.start();
		
	}



private int seconds;

public void setTime(int time) {
	this.seconds = time;
	System.out.println("Cow set to " + seconds + " seconds.");

}
public void start() throws InterruptedException {
	/*
	 * 2. Count down the minutes, print the current minute then sleep for 60
	 * seconds using Thread.sleep(int milliseconds).
	 */
      for (int i = 0; i < seconds; i--) {
	  System.out.println("" +seconds ); 
	  
      }
	/*
	 * 3. When the timer is finished, use the playSound method to play a moo
	 * sound. You can download one from freesound.org, then drag it into
	 * your default package. Tell the students (by speaking) it's time to walk.
	 */

}

private void playSound(String fileName) {
	AudioClip sound = JApplet
			.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

private void speak(String stuffToSay) {
	try {
		Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


}


