
public class Snake {
	int age;
	String color;
	String type;

	public Snake(String color, int age, String type) {
		this.age = age;
		this.color = color;
		this.type = type;
	}

	void slither() {
		System.out.println("slither, slither");
	}

	void choke() {
		System.out.println("I can't breathe");
	}
}
