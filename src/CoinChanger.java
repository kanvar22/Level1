public class CoinChanger {
	int numberOfCoins;
	int coinDenomination;
	int moneyGiven;

	public static void main(String[] args) {
		CoinChanger coinChanger = new CoinChanger(100, 50);
		coinChanger.addCoin(5);
		coinChanger.dispenseCoin(3);
		coinChanger.totalMoney();
	}

	int dispenseCoin(int moneyGiven) {
		System.out.println("Clink, here is your money.");
		numberOfCoins -= moneyGiven;
		return coinDenomination;
	}

	void addCoin(int moneyGiven) {
		numberOfCoins += moneyGiven;
	}

	void addDollar() {
		int dollar = 100 / coinDenomination;
		numberOfCoins += dollar;
	}

	void totalMoney() {
		int money = coinDenomination * numberOfCoins;
		System.out.println("Your money amount is " + money);
	}

	boolean hasCoins(){
		if (numberOfCoins<0) {
			System.out.println("NO MORE COINS!!");
		}
		return
	}

	int getCoinDenomination() {
		return this.getCoinDenomination();
	}

	CoinChanger(int numberOfCoins, int coinDenomination) {
		this.numberOfCoins = numberOfCoins;
		this.coinDenomination = coinDenomination;
	}
}
