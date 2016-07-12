public class TeaParty {
	String lastName;
	boolean isWoman;
	boolean isKnighted;

	public static void main(String[] args) {
		TeaParty tp = new TeaParty();
		String hello1 = tp.welcome("Heenan", true, false);
		String hello2 = tp.welcome("Marty", false, true);
		String hello3 = tp.welcome("Crtuz", true, true);
		String hello4 = tp.welcome("Cherchil", false, false);
		String hello5 = tp.welcome("Hawking", true, true);
		System.out.println("" + hello1);
		System.out.println("" + hello2);
		System.out.println("" + hello3);
		System.out.println("" + hello4);
		System.out.println("" + hello5);
	}

	public String welcome(String lastName, boolean isWoman, boolean isKnighted) {
		this.lastName = lastName;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
		if (isKnighted && isWoman) {
			return "Dame. " + lastName
					+ " I hope yopu have enjoyed your knighted years and I hope you will have fun at my party.";
		} else if (!isKnighted && isWoman) {
			return "Ms. " + lastName + " I hope you have fun at my party.";
		}
		if (isKnighted && !isWoman) {
			return "Sir. " + lastName
					+ " I hope yopu have enjoyed your knighted years and I hope you will have fun at my party.";
		} else if (!isKnighted && !isWoman) {
			return "Mr. " + lastName + " I hope you have fun at my party.";
		}
		return "";
	}

}
