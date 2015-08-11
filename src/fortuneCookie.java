import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class fortuneCookie implements ActionListener{
public static void main(String[] args) {
fortuneCookie fortunecookie = new fortuneCookie();
fortunecookie.showButton();
}
public void showButton(){
System.out.println("hi");
JFrame jframe = new JFrame();
jframe.setVisible(true);
JButton button = new JButton();
jframe.add(button);
button.addActionListener(this);
jframe.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
   int	random = new Random ().nextInt(5);
   if (random==0) {
	JOptionPane.showMessageDialog(null, "your name will change to my name");
}  
   if (random==1) {
	JOptionPane.showMessageDialog(null, "your ship will sink.");
}  
   if (random==2) {
	JOptionPane.showMessageDialog(null, "your computer will get hacked.");
}
   if (random==3) {
	JOptionPane.showMessageDialog(null, "hi");
}
   else {
	JOptionPane.showMessageDialog(null, "hi");
}
	JOptionPane.showMessageDialog(null, ""+random);
}
}
