
import javax.swing.JOptionPane;

public class BinaryBlaster {
	public static void main(String[] args) {
		String Input = JOptionPane.showInputDialog("What would you like me to convert from binary?");
		// char
		char no0 = Input.charAt(0);
		char no1 = Input.charAt(1);
		char no2 = Input.charAt(2);
		char no3 = Input.charAt(3);

		int Sum = 0;

		// no0
		int no00 = Character.getNumericValue(no0);
		if (no00 == 1) {
			System.out.println("1");
			Sum = Sum + 8;
		} else {
			System.out.println("0");
		}

		// no1
		int no10 = Character.getNumericValue(no1);
		if (no10 == 1) {
			System.out.println("1");
			Sum = Sum + 4;
		} else {
			System.out.println("0");
		}

		// no2
		int no4 = Character.getNumericValue(no2);
		if (no4 == 1) {
			System.out.println("1");
			Sum = Sum + 2;
		}

		else {
			System.out.println("0");
		}

		// no3
		int no6 = Character.getNumericValue(no3);
		if (no6 == 1) {
			System.out.println("1");
			Sum = Sum + 1;
		}

		else {
			System.out.println("0");
		}

		System.out.println(Sum);
	}
}
