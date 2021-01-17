package capitulo4.ejerciciosSobreHerencia.articulosComestibles;

public class Tienda {

	public static void main(String[] args) {
		Perecedero producto1 = new Perecedero (135, "Manzana", 1, "20-10-2021");
		NoPerecedero producto2 = new NoPerecedero (250, "Miel", 2);
		Perecedero producto3 = new Perecedero (93, "Ketchup", 1, "15-08-2021");
		Perecedero producto4 = new Perecedero (42, "Naranja", 4, "11-03-2021");
		
		
		System.out.println(producto1.toString());
		System.out.println(producto2.toString());
		System.out.println(producto3.toString());
		System.out.println(producto4.toString());

	}

}
