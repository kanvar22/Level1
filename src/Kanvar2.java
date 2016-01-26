import javax.swing.JOptionPane;

public class Kanvar2 {
	int age = 11;
	String myBirthMonth = we;
	String name = "Kanvar";

	public static void main(String[] args) {
		Kanvar2 k = new Kanvar2();
		int hi = k.compareAge(40);
		System.out.println(hi);
		boolean me = k.isMyBirthMonth();
		System.out.println(me);
		String my = k.getName();
		System.out.println(my);
		JOptionPane.showMessageDialog(null, "Hi I am " + my);
		String we = JOptionPane.showInputDialog("How old are you?");
	}

	public int compareAge(int anotherAge) {
		return (age - anotherAge);
	}

	public boolean isMyBirthMonth(int month) {
		if (myBirthMonth == month) {
			return (true);
		} else {
			return (false);
		}
	}

	public String getName() {
		return name;
	}

}
