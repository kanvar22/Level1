import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class chuckel {
public static void main(String[] args) {
chuckel s = new chuckel();
s.showButton();
}
public void showButton(){
JFrame frame = new JFrame();	
JPanel panel = new JPanel();	
JButton Joke = new JButton();
JButton Punchline = new JButton();
frame.setVisible(true);
frame.add(panel);
panel.add(Joke);
panel.add(Punchline);
Joke.setText("Joke");
Punchline.setText("Punchline");
frame.pack();
}
}
