package street.sinal.controller;

import java.util.Scanner;
import street.sinal.service.*;

public class CommandSinal {
	public static final Scanner SC = new Scanner(System.in);
	public static void command() {
		var invalid = false;
		int[] times = new int[5];
		String[] colors = new String[3];
		int alert;
		 
		
		for (int i = 0; i < 3; i++) {
			do{
				invalid = false;
				colors[i] = Terminal.readColor("\nPut the color of the " + (i+1) + "º sinal : ");	
				
				if(colors[i]==""){
					invalid = true;
					System.out.println("WARNING> THIS VALLUE IS INVALID!");
				}
				for (int j = i; j>0; j--){
					if (colors[i].equalsIgnoreCase(colors[j-1])) {
						invalid = true;
						System.out.println("WARNING> THIS VALLUE IS INVALID!");
					}
				}			
			}while(invalid);
		}
		
		
		
		// colors[0] = Terminal.readColor("\nPut the first color : ");

		// do{
		// 	invalid = false;
		// 	colors[1] = Terminal.readColor("\nPut the second color : ");
		// 	if (colors[1].equalsIgnoreCase(colors[0])) {
		// 		invalid = true;
		// 		System.out.println("WARNING> THIS VALLUE IS INVALID!");
		// 	}
		// }while(invalid);

		// do{
		// 	invalid = false;
		// 	colors[2] = Terminal.readColor("\nPut the third color : ");
		// 	if (colors[2].equalsIgnoreCase(colors[0]) || colors[2].equalsIgnoreCase(colors[1])) {
		// 		invalid = true;
		// 		System.out.println("WARNING> THIS VALLUE IS INVALID!");
		// 	}
		// }while(invalid);
		
		times[0] = Terminal.readInt("\nPut the time of the first color : ",0);
		times[1] = Terminal.readInt("\nPut the time of the second color : ",0);
		times[2] = Terminal.readInt("\nPut the time of the third color : ",0);
		
		do{
			invalid = false;
			alert = Terminal.readInt("\nTell the alert color [1,2,3] : ",0);
			if (alert > 3) invalid = true;
		}while (invalid);

		times[3] = Terminal.readInt("\nPut how many rounds should it operate normally : ",-1);
		times[4] = Terminal.readInt("\nPut how many rounds should it operate in alert mode : ",-1);

		callSinal(colors,alert-1,times);
	}
	
	

	private static void callSinal(String[] colors, int alert, int[] times) {
		boolean going = true;
		String input = "";
		while(going) {
			System.out.println("\nStart Signal [y/n]");
			going = false;
			input = SC.next();
			input = String.valueOf(input.charAt(0));
			if (input.equalsIgnoreCase("y")) {
				System.out.println();
				StartSinal.startSinal(colors, alert, times);
			}
			if (input.equalsIgnoreCase("n")) {
				System.exit(-1);
			}
			going = true;
		}
	}
	 
}

