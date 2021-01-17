package capitulo4.ejerciciosSobreHerencia.circuitoElectronico;

public class Interruptor extends Componente {

	String tipoInterruptor;

	public Interruptor(String nombre, String circuitoAnterior, String circuitoSiguiente, String tipoInterruptor) {
		super(nombre, circuitoAnterior, circuitoSiguiente);
		this.tipoInterruptor = tipoInterruptor;
	}

	@Override
	public String toString() {
		return "Interruptor [tipoInterruptor=" + tipoInterruptor + ", nombre=" + nombre + ", circuitoAnterior="
				+ circuitoAnterior + ", circuitoSiguiente=" + circuitoSiguiente + "]";
	}
	
	

}
