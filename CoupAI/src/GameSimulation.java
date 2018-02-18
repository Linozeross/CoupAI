
import java.util.Scanner;



public class GameSimulation {
	

	public static void main(String[] args) {
		
		GameState state = new GameState();
		Scanner sc = new Scanner(System.in);
		
		//give players cards
		//implemented randomly for now TODO: make it according to two player rules.
				
		//give players money
		
		
		//while game not over
		
		
		//currentPlayer  turn
		System.out.println("What is your action?");
		
		String action = sc.nextLine();
		
		
		if (action.equals("tax")) {
			System.out.println("Do you want to challenge this action?");
			if (sc.nextLine().equals("yes")) {
				state.challenge("tax");
			}
			
			
			state.foreignaid()
		}
		//check input
		
		state.assinate(p1,p2);
		
		//evaluate action
		
		
		//if action is challengable
		
		System.out.println("Do you want to challenge this action?");
		String challenge = sc.nextLine();
		//if yes:
		
		//if no
		
		System.out.println("Do you want to counteract?");
		
		//if yes
		
		//if no
		
		//resolve action
		//change currentplayer
		
		
		
		
		
		
		
		
		
		
		
	}

}
