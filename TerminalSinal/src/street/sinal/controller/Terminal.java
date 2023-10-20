package street.sinal.controller;

import java.util.Scanner;

public class CommandSinal {
	public static final Scanner SC = new Scanner(System.in);
    	private static double readInt(String label) {
        var valor = 0.0;
        var invalid = false;
        do {
            try {
                System.out.print(label);
                String timeRead = SC.nextLine();
                valor = Integer.parseInt(timeRead);
                invalid = false;
                if(valor <= 0){
                    invalid = true;
                }
	        } catch (NumberFormatException ex) {
                System.out.println("WARNING> THIS VALLUE IF INVALID!");
                invalid = true;
            }
        } while (invalid);
        return valor;
    }
}
