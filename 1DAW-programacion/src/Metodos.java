

public class Metodos {

	public static void main(String[] args){;
	int numero = Utils.obtenerNumeroAzar();
	
	if (numero > 30) {
		System.out.println("El numero es mayor de 30");
	}else {
		if (numero == 30) {
			System.out.println("El numero es igual a 30");
		}else {
			System.out.println("El numero es menor de 30");
		}
	}
	}

}
