package capitulo2.bloque2;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio02 {

	public static void main(String[] args) {
		
		int numnegativo = 0, Numbajo = 0, Nummedio = 0, Numgrande = 0;
		
		
		String str = JOptionPane.showInputDialog("Introduce un numero bajo (entre 0 y 25)");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero medio (entre 26 y 250)");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero grande (mayor de 250)");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero al azar");
		int num5 = Integer.parseInt(str);
		
		
		if (num2 < 0 ) {
			System.exit(0);
						}
						
		if (num2 < 0 ) {
			numnegativo = numnegativo + num2;
			System.out.println("El " + num2 + " es negativo");
						
			}else if (num2 >= 0 && num2 <= 25){
					Numbajo = Numbajo + num2;
					System.out.println("El " + num2 + " es un numero bajo");
										
					}if (num2 >= 26 && num2 <= 250){
						Nummedio = Nummedio + num2;
						System.out.println("El " + num2 + " es un numero medio");
											
						}if (num2 >250) {
							Numgrande = Numgrande + num2;
								System.out.println("El " + num2 + " es un numero grande");
										}
							
							
		if (num3 < 0 ) {
			numnegativo = numnegativo + num3;
			System.out.println("El " + num3 + " es negativo");
								
				}else if (num3 >= 0 && num3 <= 25){
						Numbajo = Numbajo + num3;
						System.out.println("El " + num3 + " es un numero bajo");
											
					}if (num3 >= 26 && num3 <= 250){
						Nummedio = Nummedio + num3;
						System.out.println("El " + num3 + " es un numero medio");
												
						}if (num3 >250) {
							Numgrande = Numgrande + num3;
							System.out.println("El " + num3 + " es un numero grande");
								}	
							
						
		if (num4 < 0 ) {
			numnegativo = numnegativo + num4;
			System.out.println("El " + num4 + " es negativo");
								
				}else if (num4 >= 0 && num4 <= 25){
						Numbajo = Numbajo + num4;
						System.out.println("El " + num4 + " es un numero bajo");
											
							}if (num4 >= 26 && num4 <= 250){
								Nummedio = Nummedio + num4;
								System.out.println("El " + num4 + " es un numero medio");
												
									}if (num4 > 250) {
										Numgrande = Numgrande + num4;
										System.out.println("El " + num4 + " es un numero grande");
											}
		if (num5 < 0 ) {
			numnegativo = numnegativo + num5;
			System.out.println("El " + num5 + " es negativo");
															
				}else if (num5 >= 0 && num5 <= 25){
						Numbajo = Numbajo + num5;
						System.out.println("El " + num5 + " es un numero bajo");
																		
							}if (num5 >= 26 && num5 <= 250){
								Nummedio = Nummedio + num5;
								System.out.println("El " + num5 + " es un numero medio");
																			
									}if (num5 > 250) {
										Numgrande = Numgrande + num5;
										System.out.println("El " + num5 + " es un numero grande");		
									}	

	}										
}
