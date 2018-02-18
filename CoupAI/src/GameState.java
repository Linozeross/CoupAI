import java.util.Collections;
import java.util.Stack;

public class GameState {
	Player p1; 
	Player p2; 
	Stack<String> court;
	Player currentPlayer;
	
	public GameState(){
		p1 = new Player(1);
		p2 = new Player(2);
		court = startingCards(p1,p2);
		currentPlayer = p1;
	}
	
	
	private Stack<String> startingCards(Player p1, Player p2) {
		/** creates the court Stack and gives the starting cards out to players.
		 * 
		 **/
		
		// TODO Auto-generated method stub
			Stack<String> court = new Stack<String>();
			for (int i=0; i<=2; i++) {
				court.push("Duke");
				court.push("Assasin");
				court.push("Ambassador");
				court.push("Captain");
				court.push("Contessa");
			}
		Collections.shuffle(court);
		
		p1.setCard1(court.pop());
		p1.setCard2(court.pop());
		p2.setCard1(court.pop());
		p2.setCard2(court.pop());
	
		return court;
	}


	public Player getP1() {
		return p1;
	}


	public void setP1(Player p1) {
		this.p1 = p1;
	}


	public Player getP2() {
		return p2;
	}


	public void setP2(Player p2) {
		this.p2 = p2;
	}


	public Stack<String> getCourt() {
		return court;
	}


	public void setCourt(Stack<String> court) {
		this.court = court;
	}


	public Player getCurrentPlayer() {
		return currentPlayer;
	}


	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	

}
