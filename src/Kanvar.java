
import javax.swing.JOptionPane;


public class Kanvar {
public static void main(String[] args) {
	String hi = JOptionPane.showInputDialog("How old are you?");
	int A = Integer.parseInt(hi);
	if (A >= 18) {
	JOptionPane.showInputDialog("Who do you think is going to be the next president?");	
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
}
}
