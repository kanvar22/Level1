
// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon:\ http://www.youtube.com/watch?v=drf4t7wBTsA
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.

 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if (this.name .equals("Papa")) {
			return "red";
		}
		else {
			return "white";
		}
		// 3. Fill in this method
		
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if (this.name .equals("Smurfette")) {
			return "girl";
		}
		else {
			return "boy";
		}
		// 4. Fill in this method
		
		
		
	}
}

