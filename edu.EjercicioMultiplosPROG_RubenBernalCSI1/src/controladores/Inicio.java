/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 031024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 031024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero, total = 0, contador = 0, i = 1;
		boolean esDosCifras = false;
		double media;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Realizo el bucle hasta que se ha verificado que el número introducido tiene dos cifras
		do {
			//Pido al usuario el número y lo guardo en su correspondiente variable
			System.out.println("Introduzca un número entero de dos cifras: ");
			numero = sc.nextInt();

			//Controlo que el número introducido por el usuario en consola tenga dos cifras
			if(numero > 9 && numero < 100) {
				System.out.println("El número es válido, tiene dos cifras. ");
				esDosCifras = true;
			}else{
				System.err.println("El número no es válido. Introduzca uno de nuevo que tenga dos cifras...");
				esDosCifras = false;
			}
		}while(esDosCifras==false);
		
		//Calculo todos los multiplos del numero introducido y los muestro por pantalla mientras sean menores que 500
		System.out.println("Los múltiplos de " + numero + " hasta 500 son: ");
		do {
			total = total + (i * numero);
			System.out.println(i * numero);
			contador++;
			i++;
		}while(i * numero <= 500);
		
		//Muestro por pantalla el total de la suma de todos los múltiplos
		System.out.println("La suma de todos los múltiplos es: " + total);
		
		//Calculo la media
		media = total / contador;
		
		//Verifico que si la media tiene como decimal 0 y si es asi le quito la parte decimal
		if((Math.round(media) - media) == 0) {
			//Muestro el resultado por consola sin decimales
			System.out.println("La media de la suma de todos los múltiplos es: " + Math.round(media));
		}else {
			//Muestro el resultado por consola con decimales
			System.out.println("La media de la suma de todos los múltiplos es: " + media);
		}
		
				

	}

}
