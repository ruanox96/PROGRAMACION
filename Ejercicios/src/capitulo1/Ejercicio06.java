package capitulo1;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int euribor=10000, diferencial=5000 , capital=500;
		int interesanual;
		int interesmensual;
		int cuotamensual;
		int n1, n2;
		
		
		interesanual = euribor + diferencial;
		interesmensual = interesanual / 12 / 100;
		n1 = ((interesmensual) * (1 + interesmensual));
		n2 = ((1 + interesmensual) - 1);
		cuotamensual = (capital * (n1 / n2));
		
		
		System.out.println("El importe de la cuota mensual es " + cuotamensual);
	}
		
}
