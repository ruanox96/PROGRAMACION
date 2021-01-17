package capitulo4.ejerciciosSobreHerencia.articulosComestibles;

public class Producto {
protected int codigo;
protected String nombre;
protected int precio;

public Producto() {
	super();
}


public Producto(int codigo, String nombre, int precio) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.precio = precio;
}

@Override
public String toString() {
	return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

}
