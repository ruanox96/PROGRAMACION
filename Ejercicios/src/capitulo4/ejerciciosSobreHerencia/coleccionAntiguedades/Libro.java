package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedades {

	public String autor;
	public String titulo;
	
	public Libro() {
	}

	public Libro(int añoFabrica, String origen, int precio, String autor, String titulo) {
		super(añoFabrica, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", añoFabrica=" + añoFabrica + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}
	
}
