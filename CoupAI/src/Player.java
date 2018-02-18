
public class Player {
	int money;
	String[] cards = new String[2];
	
	public Player(int money, String card1, String card2) {
		money = money;
		cards[0] = card1;
		cards[1] = card2;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String[] getCards() {
		return cards;
	}

	public void setCards(String[] cards) {
		this.cards = cards;
	}
	
	

}
