/*
* 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and print his name
*
* 4. Make 2 more characters from the spongebob world and print their name, job, and house shape
*/

public class SeaCreature {
	public static void main(String[] args) {
		// spounge bob
		SeaCreature SpoungeBob = new SeaCreature("Spounge");
		System.out.println(SpoungeBob.getName());
		SpoungeBob.eat();
		// sandy
		SeaCreature Sandy = new SeaCreature("Sandy");
		System.out.println(Sandy.getJob());
		System.out.println(Sandy.getHouseShape());
		System.out.println(Sandy.getName());

	}

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public String getJob() {
		// 2. Fill in this method
		if (this.name.equals("Sandy")) {
			return "Texas";
		} else {
			return "Cook";
		}
	}

	public String getHouseShape() {
		// 3. Fill in this method
		if (this.name.equals("Sandy")) {
			return "dome";
		} else {
			return "pinaple";
		}
	}

}
