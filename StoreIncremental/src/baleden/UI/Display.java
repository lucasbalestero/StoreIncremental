package baleden.UI;

public class Display {
	
	public static final int RETURN = 0;
	public static final int PRINT = 1;

	/**
	 * Display the current options
	 * @param option use Display.RETURN as parameter or Display.PRINT
	 * @return
	 */
	public static String options(Integer option) {
		String options = "[status] for status - [quit] to close";
		if(option == 1)
			System.out.println(options);
		return options;
	}
}
