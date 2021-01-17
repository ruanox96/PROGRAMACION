package capitulo4.ejerciciosSobreHerencia.circuitoElectronico;

public class Led extends Componente {


	String tipoBombilla;

	public Led(String nombre, String circuitoAnterior, String circuitoSiguiente, String tipoBombilla) {
		super(nombre, circuitoAnterior, circuitoSiguiente);
		this.tipoBombilla = tipoBombilla;
	}

	@Override
	public String toString() {
		return "Led [tipoBombilla=" + tipoBombilla + ", nombre=" + nombre + ", circuitoAnterior=" + circuitoAnterior
				+ ", circuitoSiguiente=" + circuitoSiguiente + "]";
	}
	

	
}
