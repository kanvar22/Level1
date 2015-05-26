// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class drumKit extends MouseAdapter {

    JLabel drumImage;
    JLabel cymbal;
    public static void main(String[] args) throws Exception {
   	 new drumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	  JFrame frame = new JFrame ();
   	 // 2. Make the frame visible
   	 frame.setVisible(true);
   	 // 3. Set the size of the frame
   	 frame.setSize(500,500);
   	 // 4. Set the title of the frame
   	 frame.setTitle("kanvar's band");
   	 // 5. Make a JPanel and initialize it.
   	 JPanel panel = new JPanel ();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
     frame.add(panel);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
     
   	 // 8. Put the name of your image in a String variable.
    String name = "398818RXBF.jpg";
   	 // 9. Use the "createImage()" method to initialize the drumImage variable.
   	 drumImage = createImage(name);
   	 // 10. Add the image to the panel
     panel.add(drumImage);
   	 // 11. Set the layout of the panel to "new GridLayout()"
     panel.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   	 
   	 // 13. add a mouse listener to your drumImage.
     drumImage.addMouseListener(this);
     //another one
      name = "cymbal.jpg";
     cymbal = createImage(name);
	 panel.add(cymbal);
	 cymbal.addMouseListener(this);
	 
		
    
	 frame.pack();
    
    }
    
    

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"
     System.out.println("Mouse Clcked master!");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". There are some sounds here: http://bit.ly/drum-sounds or you can also get them from freesound.org
   	 
   	 // 16. If they clicked on the drumImage...
     if (drumClicked == drumImage) {
		playSound("base (1).wav");
		
   		 // 17. ...use the playSound method to play a drum sound.
    	 
}
   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
     else {
    	 playSound("joke.wav");
	}
    } 
    

    private JLabel createImage(String fileName) throws MalformedURLException {
   	 URL imageURL = getClass().getResource(fileName);
   	 Icon icon = new ImageIcon(imageURL);
   	 JLabel imageLabel = new JLabel(icon);
   	 return imageLabel;
    }

    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}
