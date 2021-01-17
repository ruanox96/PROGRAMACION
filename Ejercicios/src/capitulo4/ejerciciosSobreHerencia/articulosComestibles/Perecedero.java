package capitulo4.ejerciciosSobreHerencia.articulosComestibles;

public class Perecedero extends Producto{
protected String fechaCadu;

public Perecedero() {
	super();
}

public Perecedero(int codigo, String nombre, int precio, String fechaCadu) {
	super(codigo, nombre, precio);
	this.fechaCadu = fechaCadu;
}

@Override
public String toString() {
	return "Perecedero [codigo= " + codigo + " nombre= " + nombre + " precio= " + precio + " fechaCadu= " + fechaCadu + "]";
}

public String getFechaCadu() {
	return fechaCadu;
}

public void setFechaCadu(String fechaCadu) {
	this.fechaCadu = fechaCadu;
}

}
