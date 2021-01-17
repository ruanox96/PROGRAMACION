package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		Joya pulsera = new Joya(1700, "Inglaterra", 10000, "oro");
		System.out.println(pulsera.toString());
		
		Libro libro = new Libro(1605, "España", 3000, "Cervantes", "Dont Quijote");
		System.out.println(libro.toString());
		
		Jarron jarron = new Jarron(1342, "Japon", 15000, "Ceramica", "Marron");
		System.out.println(jarron.toString());
		
		Cuadro cuadro = new Cuadro(1523, "Italia", 42000, "Leonardo da Vinci", 2, 2);
		System.out.println(cuadro.toString());
	}

}
