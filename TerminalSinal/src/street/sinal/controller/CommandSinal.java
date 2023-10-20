package street.sinal.controller;

import java.util.Scanner;
import street.sinal.service.StartSinal;

public class CommandSinal {
	public static final Scanner SC = new Scanner(System.in);
	public static void Command() {
		 var invalid = false;
		 int[] times = new int[5];
		 String[] colors = new String[3];
		 
		 var readColor = SC.nextLine();
	}
	
	static String corLida() {
		var same = false;
		do {
		
		//TODO
			
			
		}while (same);
			
		return "";
	}
	
		 static double readInt(String label) {
	            var valor = 0.0;
	            var invalid = false;
	            do {
	                try {
	                    System.out.print(label);
	                    String timeRead = SC.nextLine();
	                    valor = Integer.parseInt(timeRead);
	                    invalid = false;
	                } catch (NumberFormatException ex) {
	                    System.out.println("WARNING> THIS VALLUE IF INVALID!");
	                    invalid = true;
	                }
	            } while (invalid);
	            return valor;
	        }
	}
	
	private static void callSinal(String[] cores, int alerta, int[] tempos) {
		System.out.println("Start Signal [y/n]");
		boolean going = true;
		String input = "";
		while(going) {
			going = false;
			input = SC.next();
			input = String.valueOf(input.charAt(0));
			if (input.equalsIgnoreCase("y")) {
				StartSinal.startSinal(cores, alerta, tempos);
			}
			if (input.equalsIgnoreCase("n")) {
				System.exit(-1);
			}
		}
	}
}

