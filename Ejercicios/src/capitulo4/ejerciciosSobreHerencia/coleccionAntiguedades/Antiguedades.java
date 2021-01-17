package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedades {
protected int añoFabrica;
protected String origen;
protected int precio;

public Antiguedades() {
	super();
}

public Antiguedades(int añoFabrica, String origen, int precio) {
	super();
	this.añoFabrica = añoFabrica;
	this.origen = origen;
	this.precio = precio;
}
@Override
public String toString() {
	return "Antiguedades [añoFabrica=" + añoFabrica + ", origen=" + origen + ", precio=" + precio + "]";
}
public int getAñoFabrica() {
	return añoFabrica;
}
public void setAñoFabrica(int añoFabrica) {
	this.añoFabrica = añoFabrica;
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
