package bloque05_Metodos_y_Arrays;

import metodos.Utils;

public class Metodo5 {
/**
 * 5.- Realiza un método llamado "removeInteger", que reciba:
   - Un array de números enteros.
   - Un valor entero.
   - Si el valor entero recibido como segundo parámetro existe dentro del array recibido como primer parámetro, debes conseguir que ese valor desaparezca del array. Puedes seguir la siguiente guía:
   - Utiliza el método del ejercicio 4 para saber cuántas veces aparece el valor entero (segundo parámetro) dentro del array (primer parámetro).
   - Crea un nuevo array, que tenga la dimensión del array recibido como primer parámetro menos la cantidad de veces que el valor entero del segundo parámetro aparezca en dicho array.
   - Copia todos los elementos del array recibido como primer parámetro, dentro del nuevo array creado por ti en el método. Lógicamente no debes copiar en el array los valores del primer array que coincidan con el valor introducido como segundo parámetro.
   - Devuelve el nuevo array.
		El método debe devolver "int[]". El método main debe recoger el nuevo array creado e imprimir en consola.
 * @param args
 */
	public static void main(String[] args) {
		int array[] = new int[5]; 		//recibe un array
		int num = 3;			//recibe un valor entero
		
		for (int i = 0; i < array.length; i++) {	
			array[i]=Utils.obtenerNumeroAzar10();
		}
		Utils.mostrarArrayInt(array);
		int corto[] = removeInteger(array, num);
		System.out.println(" ");
		Utils.mostrarArrayInt(corto);
	}
	
	
	
	public static int[] removeInteger(int array[], int num) {
		int contador = 0;	//creo un contador para que cuente la cantidad de veces que el numero va a estar en el array
		
		//recorro la longitud del array, y SI el array[i] == al numero(3 en mi caso), el contador va a ir sumando las veces que aparezca el 3 
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {		
				contador ++;
			}
		}
		
		
		//creo un segundo array con la longitud del array1 - el contador (veces que se repite el numero)
		int array2[] = new int[array.length -contador];
		
		int j = 0;	//Creo la variable J para asignarsela al Segundo array(array2)
		
		for (int i = 0; i < array.length; i++) {	//Recorremos de nuevo el primer array
			if(array[i] != num) {			//Si el array[i] es distinto del numero 
				array2[j] = array[i];		// array2 es igual al array1
				j++;
			}
		}
		return array2;
	}
	
}
