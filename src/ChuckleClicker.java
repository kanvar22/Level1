import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ChuckleClicker implements ActionListener {
	
public static void main(String[] args) {
ChuckleClicker ChuckleClicker1 = new ChuckleClicker();
ChuckleClicker1.makeButton();

}
JButton button1;
JButton button2;
	void makeButton(){
JFrame frame = new JFrame();	
frame.setVisible(true);
JPanel panel = new JPanel();
button1 = new JButton();
button2 = new JButton();
button1.addActionListener(this);
button2.addActionListener(this);
button1.setText("Joke");
button2.setText("punchline");
panel.add(button1);
panel.add(button2);
frame.add(panel);
frame.pack();
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == button1){
		System.out.println("Why did the chicken cross the road.");
		}
		if(arg0.getSource() == button2){
			System.out.println("`because he was to dumb to realize the grosrey store was the other way.");
			}
	}
}