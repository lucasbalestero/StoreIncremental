package baleden;

import java.util.Scanner;

import baleden.UI.Display;
import baleden.models.Player;
import baleden.utils.PlayerUtils;

public class Test {

	public static void main(String[] args) {
		
		Player player;
		Float initialCash = 2000f;
		String lastStore;
		
		Scanner reader = new Scanner(System.in);

		System.out.print("Hello! To start a new store input your name: ");
		
		player = new Player(reader.next(), initialCash);
		
		System.out.println("Greetings " + player.getName() +"!");
		System.out.println("We're giving you an initial money of "+initialCash+"$ to start a new business.");
		System.out.print("Tell me what is going to be the name of your store: ");
		
		lastStore = reader.next();
		player.addStore(lastStore, 2000f);
		
		System.out.println("\nAwesome! You own "+lastStore+"!");
		
		System.out.println("\nHere is is your current status: ");
		
		System.out.println(PlayerUtils.printStatus(player));
		
		System.out.println("\nIf you wish, you can type \"status\" at any time to see your status.");
		
		Display.options(Display.PRINT);
		
		while(true) {
			String option = reader.next();
			if(option.equals("quit")) {
				break;
			}else if(option.equals("status")) {
				Display.options(Display.PRINT);
			}else if(option.equals("end day")){
				//TODO sell products from store and make money
			}else {
				System.out.println("Option does not match.");
				Display.options(Display.PRINT);
			}
		}
		
		System.out.println("Bye");
		

	}

}
