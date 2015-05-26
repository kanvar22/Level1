import javax.swing.JOptionPane;


public class Cat {
public static void main(String[] args) {
	String p = JOptionPane.showInputDialog("How manny cats do you have?");
	int a = Integer.parseInt(p);
	if (a <= 3) {
		System.out.println("Get a dog!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	else {
		System.out.println("Get rid of some of them!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	
}
}
}

