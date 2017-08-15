package baleden.utils;

import baleden.models.Player;
import baleden.models.Store;

public class PlayerUtils {

	
	public static String printStatus(Player player) {	
		String status = "\t\tName: "+player.getName() +"\n\t\tMoney: "+player.getMoney();
		String stores = "\n";
		for(Store store : player.getStores()) {
			stores += "\t\t" + store.getName() + "\n\t\tCash: "+store.getCash() +"\n\n";
		}
		status += "\nYour Stores:\n" + stores+"\n";
		return status;
	}
	
}
