
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
	
	public void income() {
		this.money++;
	}
	
	public void foreignAid(){
		this.money += 2;
	}
	
	public void coup(Player player) {
		//TODO preconditions?
		//
		this.money -= 7;
		// target player must choose a card to lose
	}
	
	public void tax() {
		this.money += 3;
	}
	
	public void assassinate(Player player) {
		this.money -= 3;
		//target player must choose a card to lose
	}
	
	public void exchange() {
		assert false;
	}
	
	public void steal(Player other) {
		this.money += 2;
		other.money -= 2;
	}
	
	
}
