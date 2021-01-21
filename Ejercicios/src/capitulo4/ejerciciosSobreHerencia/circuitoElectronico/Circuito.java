package capitulo4.ejerciciosSobreHerencia.circuitoElectronico;

public class Circuito {

	public static void main(String[] args) {
		Bateria bateria = new Bateria ("Bateria", "Interruptor", "Resistencia", 1500);
		System.out.println(bateria);
		
		Resistencia resistencia = new Resistencia("Resistencia", "Bateria", "Bombilla", 3);
		System.out.println(resistencia);
		
		Led led = new Led("Led", "Resistencia", "Interruptor", "Bajo consumo");
		System.out.println(led);
		
		Interruptor interruptor = new Interruptor("Boton", "Led", "Bateria", "Interruptor simple");
		System.out.println(interruptor);
	}

}
