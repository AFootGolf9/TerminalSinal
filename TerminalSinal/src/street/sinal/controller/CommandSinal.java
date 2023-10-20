package street.sinal.controller;

import java.util.Scanner;
import street.sinal.service.StartSinal;
import Terminal;

public class CommandSinal {
	public static final Scanner SC = new Scanner(System.in);
	public static void command() {
		var invalid = false;
		int[] times = new int[5];
		String[] colors = new String[3];
		int alert;
		 
		colors[0] = Terminal.readColor("Put the first color !!!");

		do{
			invalid = false
			colors[1] = Terminal.readColor("Put the second color !!!");
			if (colors[1] == colors[0]) invalid = true
		}while(invalid)

		do{
			invalid = false
			colors[2] = Terminal.readColor("Put the third color !!!");
			if (colors[2] == colors[0] || colors[2] == colors[1]) invalid = true
		}while(invalid)
		
		times[0] = Terminal.readInt("Put the time of the first color !!!",0);
		times[1] = Terminal.readInt("Put the time of the second color !!!",0);
		times[2] = Terminal.readInt("Put the time of the third color !!!",0);
		
		do{
			invalid = false
			alert = Terminal.readInt("Tell the alert color [1,2,3]!!!",0)	
			if (alert > 3) invalid = true
		}while (invalid)
		alert = Terminal.readInt("Tell the alert color [1,2,3]!!!")

		times[3] = Terminal.readInt("Put how many rounds should it operate normally !!!",-1);
		times[4] = Terminal.readInt("Put how many rounds should it operate in alert mode !!!",-1);

		callSinal(colors,alert,times);
	}
	
	

	private static void callSinal(String[] colors, int alert, int[] times) {
		System.out.println("Start Signal [y/n]");
		boolean going = true;
		String input = "";
		while(going) {
			going = false;
			input = SC.next();
			input = String.valueOf(input.charAt(0));
			if (input.equalsIgnoreCase("y")) {
				StartSinal.startSinal(colors, alert, times);
			}
			if (input.equalsIgnoreCase("n")) {
				System.exit(-1);
			}
		}
	}
	 
}

