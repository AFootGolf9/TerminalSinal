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

    static double lerInt(String label) {
        var valor = 0.0;
        var invalid = false;
        do {
            try {
                System.out.print(label);
                String textoLido = SC.nextLine();
                valor = Double.parseDouble(textoLido);
                invalido = false;
				if(valor <= 0){
					invalid = true;
				}
            } catch (NumberFormatException ex) {
                System.out.println("ATENCAO> Valor informado é inválido!");
                invalido = true;
            }
        } while (invalido);
        return valor;
    }
    
}
