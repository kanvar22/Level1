
public class SeaCreatureRunner {
	public static void main(String[] args) {
		// spongebob
		SeaCreature spoungeBob = new SeaCreature("spongebob");
		System.out.println(spoungeBob.getName());
		spoungeBob.eat();
		spoungeBob.laugh();
		// Patrick
		SeaCreature patrick = new SeaCreature("patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		// squidward
		SeaCreature squidward = new SeaCreature("squidward");
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
		// sandy
		SeaCreature sandy = new SeaCreature("sandy");
		System.out.println(sandy.getName());
		sandy.eat();
		// Mr.Crabs
		SeaCreature crabs = new SeaCreature("crabs");
		System.out.println(crabs.getName());
		crabs.eat();
	}
}
