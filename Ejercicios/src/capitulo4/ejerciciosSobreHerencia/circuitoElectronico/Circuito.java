package capitulo4.ejerciciosSobreHerencia.circuitoElectronico;

public class Circuito {

	public static void main(String[] args) {
		Bateria bateria = new Bateria ("Bateria", "Interruptor", "Resistencia", 1500);
		bateria.toString();
		
		Resistencia resistencia = new Resistencia("Resistencia", "Bateria", "Bombilla", 3);
		resistencia.toString();
		
		Led led = new Led("Led", "Resistencia", "Interruptor", "Bajo consumo");
		led.toString();
		
		Interruptor interruptor = new Interruptor("Boton", "Led", "Bateria", "Interruptor simple");
		interruptor.toString();
	}

}
