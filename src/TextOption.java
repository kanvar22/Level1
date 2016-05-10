public class TextOption {
	private String op1;
	private String op2;
	private String op3;
	private String type;

	public TextOption(String op1, String op2, String op3, String type) {
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.type = type;
	}

	String gO1() {
		return op1;
	}

	String gO2() {
		return op2;
	}

	String gO3() {
		return op3;
	}
}
