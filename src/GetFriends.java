import javax.swing.JOptionPane;

public class GetFriends {

	public static void main(String[] args) {
		// 3. Create an instance of Classmate for each person in your class.
		Classmate Joey = new Classmate();
		Classmate Toby = new Classmate();
		Classmate Milessa = new Classmate();
		Classmate Sherlin = new Classmate();
		Classmate Drew = new Classmate();
		Classmate Keith = new Classmate();
		// 4. set descriptions for each Classmate
		Joey.setDescription("This test subject is a annoying person. Also he is in my class and my level astonishingly");
		Toby.setDescription("Toby's gender is a boy. His mponday colothes are a bunmny that says vegan, Metairian, and vegitairian.");
		Milessa.setDescription("Melessa, a person she has hair. She also loves music.");
		Sherlin.setDescription("Has a bun. Has a water bottle. Has a peice of paper by her.");
		Drew.setDescription("He is going to the University of Michigan.");
		Keith.setDescription("He got a new car today and lost a ballon.");
		// 5. Use your getter to print out each description
		JOptionPane.showMessageDialog(null, Joey.getDescription());
		JOptionPane.showMessageDialog(null, Toby.getDescription());
		JOptionPane.showMessageDialog(null, Milessa.getDescription());
		JOptionPane.showMessageDialog(null, Sherlin.getDescription());
		JOptionPane.showMessageDialog(null, Drew.getDescription());
		JOptionPane.showMessageDialog(null, Keith.getDescription());
	}

}

class Classmate {
	String description;

	// 1. create a setter that sets a description for this person
	void setDescription(String description) {
		this.description = description;

	}

	// 2. create a getter that gets a description of this person
	String getDescription() {
		return description;
	}
}
