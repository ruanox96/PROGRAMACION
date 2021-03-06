package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedades {

	public String autor;
	public String titulo;
	
	public Libro() {
	}

	public Libro(int aņoFabrica, String origen, int precio, String autor, String titulo) {
		super(aņoFabrica, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", aņoFabrica=" + aņoFabrica + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}
	
}
