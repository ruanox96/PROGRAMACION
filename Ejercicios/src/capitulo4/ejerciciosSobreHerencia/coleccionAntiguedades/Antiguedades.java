package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedades {
protected int aņoFabrica;
protected String origen;
protected int precio;

public Antiguedades() {
	super();
}

public Antiguedades(int aņoFabrica, String origen, int precio) {
	super();
	this.aņoFabrica = aņoFabrica;
	this.origen = origen;
	this.precio = precio;
}
@Override
public String toString() {
	return "Antiguedades [aņoFabrica=" + aņoFabrica + ", origen=" + origen + ", precio=" + precio + "]";
}
public int getAņoFabrica() {
	return aņoFabrica;
}
public void setAņoFabrica(int aņoFabrica) {
	this.aņoFabrica = aņoFabrica;
}
public String getOrigen() {
	return origen;
}
public void setOrigen(String origen) {
	this.origen = origen;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}

}
