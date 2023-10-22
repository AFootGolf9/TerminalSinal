package street.sinal.service;

import java.util.Scanner;

public class Terminal {

    private static final Scanner SC = new Scanner(System.in);

    public static String readColor(String label) {
        String timeRead = "";
        var invalid = false;
        do {
            try {
                System.out.print(label);
                timeRead = SC.nextLine();
                Integer.parseInt(timeRead);
                invalid = true;
                System.out.println("WARNING> THIS VALLUE IS INVALID!");
	        } catch (NumberFormatException ex) {
                invalid = false;
            }
        } while (invalid);
        return timeRead;
    }

    public static int readInt(String label, int x) {
        var valor = 0;
        var invalid = false;
        do {
            try {
                System.out.print(label);
                String readText = SC.nextLine();
                valor = Integer.parseInt(readText);
                invalid = false;
				if(valor <= x){
					invalid = true;
				}
            } catch (NumberFormatException ex) {
                System.out.println("WARNING> THIS VALLUE IS INVALID!");
                invalid = true;
            }
        } while (invalid);
        return valor;
    }
    
}
