package street.sinal.controller;

import java.util.Scanner;

public class Terminal {

    private static final Scanner SC = new Scanner(System.in);

    public static String readColor(String label) {
        String valor = "";
        var invalid = false;
        do {
            try {
                System.out.print(label);
                String timeRead = SC.nextLine();
                Integer.parseInt(timeRead);
                invalid = true;
                System.out.println("WARNING> THIS VALLUE IS INVALID!");
	        } catch (NumberFormatException ex) {
                invalid = false;
            }
        } while (invalid);
        return valor;
    }
    
}
