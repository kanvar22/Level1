public class ChangeMaker {
	CoinChanger pennie = new CoinChanger(20, 1);
	CoinChanger nickle = new CoinChanger(10, 5);
	CoinChanger dime = new CoinChanger(17, 10);
	CoinChanger quarter = new CoinChanger(9, 25);

	public ChangeMaker(int pennie, int nickle, int dime, int quarter) {

		this.pennie = new CoinChanger(pennie, 1);
		this.nickle = new CoinChanger(nickle, 5);
		this.dime = new CoinChanger(dime, 10);
		this.quarter = new CoinChanger(quarter, 25);
	}

	void makeChange(int totalMoney) {
		if (totalMoney >= quarter.getCoinDenomination()) {
		}
	}

	int giveOneCoin(int amount) {
		if (amount > 24) {
			amount -= quarter.getCoinDenomination();
		} else if (amount > 9 && amount < 25) {
			amount -= dime.getCoinDenomination();
		}
		if (amount > 9) {
			amount -= dime.getCoinDenomination();
		} else if (amount > 4 && amount < 10) {
			amount -= nickle.getCoinDenomination();
		}
		if (amount > 4) {
			amount -= nickle.getCoinDenomination();
		} else if (amount > 0 && amount < 5) {
			amount -= pennie.getCoinDenomination();
		}
		if (amount > 0) {
			amount -= pennie.getCoinDenomination();
		}
		return amount;
	}

	public static void main(String[] args) {
		ChangeMaker maker = new ChangeMaker(20, 10, 17, 9);
		System.out.println(maker.giveOneCoin());
	}
}
