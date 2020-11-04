package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		
		
		String str;
        int n1, n2, n3, cien, cincuenta, veinticinco, cinco, uno;
        
        
        str = JOptionPane.showInputDialog("Introduce el importe de la compra");
        n1 = Integer.parseInt(str);

     
        str = JOptionPane.showInputDialog("Introduce la cantidad recibida");
        n2 = Integer.parseInt(str);

    
        n3 = n2 - n1;
        System.out.println("El cambio es: " + n3);

        if (n3 % 100 == 0) {
            cien = (n3 / 100);
            n3 = ((cien * 100) - n3);
            System.out.println(cien + " monedas de: 100");

        }
        else if (n3 % 50 == 0) {
            cincuenta = (n3 / 50);
            n3 = ((cincuenta * 50) - n3);
            System.out.println(cincuenta + " monesdas de: 50");

        }
        else if (n3 % 25 == 0) {
            veinticinco = (n3 / 25);
            n3 = ((veinticinco * 25) - n3);
            System.out.println(veinticinco + " monedas de: 25");
        }
        else if (n3 % 5 == 0) {
            cinco = (n3 / 5);
            n3 = ((cinco * 5) - n3);
            System.out.println(cinco + " monedas de: 5");
        }
        else if (n3 % 1 == 0) {
            uno = (n3 / 1);
            if (uno != 0) {
                System.out.println(uno + " monedas de: 1");
            }

        }
	}
}