package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Cuadro extends Antiguedades{
String pintor;
int altura;
int anchura;

public Cuadro(int aņoFabrica, String origen, int precio, String pintor, int altura, int anchura) {
	super(aņoFabrica, origen, precio);
	this.pintor = pintor;
	this.altura = altura;
	this.anchura = anchura;
}

@Override
public String toString() {
	return "Cuadro [pintor=" + pintor + ", altura=" + altura + ", anchura=" + anchura + ", aņoFabrica=" + aņoFabrica
			+ ", origen=" + origen + ", precio=" + precio + "]";
}
}
