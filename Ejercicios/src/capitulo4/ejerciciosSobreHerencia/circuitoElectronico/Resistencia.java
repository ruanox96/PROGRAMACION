package capitulo4.ejerciciosSobreHerencia.circuitoElectronico;

public class Resistencia extends Componente {
	
	
	int valorResistencia;

	public Resistencia(String nombre, String circuitoAnterior, String circuitoSiguiente, int valorResistencia) {
		super(nombre, circuitoAnterior, circuitoSiguiente);
		this.valorResistencia = valorResistencia;
	}

	@Override
	public String toString() {
		return "Resistencia [valorResistencia=" + valorResistencia + ", nombre=" + nombre + ", circuitoAnterior="
				+ circuitoAnterior + ", circuitoSiguiente=" + circuitoSiguiente + "]";
	}


	
}
