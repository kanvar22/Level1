public class Vault {
	int specialCode = 9182736;

	public static void main(String[] args) {
		Vault vault = new Vault();
		if (vault.tryCode(300)) {
			System.out.println("The vault is now open.");
		} else {
			System.out.println("The security is now on you.");
		}
	}

	public boolean tryCode(int code) {
		if (code == specialCode) {
			return true;
		} else {
			return false;
		}
	}
}
