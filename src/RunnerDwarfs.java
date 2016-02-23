
public class RunnerDwarfs {

	public static void main(String[] args) {
		// Sleepy
		Dwarf sleepy = new Dwarf("Sleepy");
		sleepy.eat();
		sleepy.getName();
		String name = sleepy.getName();
		System.out.println(name);
		// Dopey
		Dwarf dopey = new Dwarf("dopey");
		String name2 = dopey.getName();
		System.out.println(name2);
		System.out.println(dopey.getBeard());
		System.out.println(dopey.hasGlasses());
		// Doc
		Dwarf doc = new Dwarf("doc");
		String name3 = doc.getName();
		System.out.println(name3);
		System.out.println(doc.hasGlasses());
		System.out.println(doc.getBeard());
	}
}
