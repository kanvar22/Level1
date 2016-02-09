
public class Month {
	String aMonth;
	int numberOfDays;
	Month nextMonth;

	public static void main(String[] args) {
		Month january = new Month("January", 31);
		Month febuary = new Month("Febuary", 29);
		Month march = new Month("March", 31);
		Month april = new Month("April", 30);
		Month may = new Month("May", 31);
		Month june = new Month("June", 30);
		Month july = new Month("July", 31);
		Month august = new Month("August", 31);
		Month september = new Month("September", 30);
		Month october = new Month("October", 31);
		Month november = new Month("November", 30);
		Month december = new Month("December", 31);
		january.setNextMonth(febuary);
		febuary.setNextMonth(march);
		march.setNextMonth(april);
		april.setNextMonth(may);
		may.setNextMonth(june);
		june.setNextMonth(july);
		july.setNextMonth(august);
		august.setNextMonth(september);
		september.setNextMonth(october);
		october.setNextMonth(november);
		november.setNextMonth(december);

	}

	public Month(String aMonth, int numberOfDays) {
		this.aMonth = aMonth;
		this.numberOfDays = numberOfDays;
	}

	public Month getNextMonth() {
		return nextMonth;
	}

	public void setNextMonth(Month nextMonth) {
		this.nextMonth = nextMonth;
	}
}
