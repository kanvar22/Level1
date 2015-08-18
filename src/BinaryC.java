import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryC{
public static void main(String[] args) {
	BinaryC Binary = new BinaryC();
}

BinaryC(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
    JButton button = new JButton();
    frame.add(panel);
    panel.add(button);
    frame.setVisible(true);
    frame.pack();
    button.setText("Convert");
    
    JTextField answer = new JTextField(20);
}

int convert(String binary) {
	if(binary.length() != 8){
		JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		return 0;
	}
	 if(!Pattern.matches("\2", binary)) {
		 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
	 }
	try {
		int asciiValue = Integer.parseInt(binary, 2);
		return asciiValue;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		//question.setText("");
		return 0;
	}
}

}
