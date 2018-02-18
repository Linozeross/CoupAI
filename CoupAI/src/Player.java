
public class Player {
	int money;
	String[] cards = new String[2];
	
	public Player(int money) {
		this.money = money;
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

	public void setCard1(String card1) {
		this.cards[0] = card1;
	}
	
	public void setCard2(String card2) {
		this.cards[1] = card2;
	}
	
	

}
