package es.unileon.prg.tema7;
/**
 * Clase con los ejercicios correspondientes a arrays de tipos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Arrays de tipos basicos";
	}

	/**
	 * Arrays de tipos basicos - Ejercicio1.
	 *
	 * Completar el metodo para crear y rellenar un vector de cien posiciones
	 * que contenga los primeros cien numeros pares. Una vez creada, se debera
	 * mostrar el contenido del vector por pantalla.
	 */
	public void ejercicio01() {
		cabecera("01", "Generar vector con los 100 primeros numeros pares");

		// Inicio modificacion
		int [] array = new int [100];
		int i;
		for (i=1; i<=100;i++) {
			array[i]=2*i;
			System.out.print(array[i]+",");
		}
		
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio2.
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.TXT el porque de los resultados
	 * <li> Modificar el odigo a fin de evitar la excepcion producida
	 * </ul>
	 */
	public void ejercicio02() {
		cabecera("02","Mostrar vector por pantalla");

		// Inicio modificacion
		int[] arrayEnteros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(" { ");
		for(int i=0 ; i <arrayEnteros.length ; i++) {
			System.out.print(" "+arrayEnteros[i]+",");
		}
		System.out.println(" } ");
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio3.
	 *
	 * Completar el metodo para crear una matriz que contenga la tabla de
	 * multiplicar del numero 8. Una vez creada, se debera mostrar el
	 * contenido del vector por pantalla.
	 */
	public void ejercicio03() {
		cabecera("03", "Tabla de multiplicar del ocho");

		// Inicio modificacion
		int [][] array = new int[3][11];
		for(int i=0; i<3;i++) {
			for(int j=0;j<11;j++) {
				array[0][j] = j;
				array[1][j]= 8;
				array[2][j]= array[0][j] * array[1][j];
				System.out.print("["+array[i][j]+"]");	
			}
			System.out.println();
		}
		
		
		
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio4.
	 *
	 * Se pide completar el metodo para mostrar por pantalla el tablero
	 * indicado en el enunciado de la practica.
	 */
	public void ejercicio04() {
		cabecera("04", "BonoLotoADA");

		// Inicio modificacion
		int [][] array = new int[5][10];
		
		for (int a=1;a<=3;a++) {
		System.out.println("Apuesta: "+a);
		System.out.println();
			for(int i=0; i<5;i++) {
				for(int j=0;j<10;j++) {
					array[0][j] = j;
					array[1][j]=10+j;
					array[2][j]=20+j;
					array[3][j]=30+j;
					array[4][j]=40+j;
					
					System.out.print("[ "+array[i][j]+" ]");
				}
				System.out.println();
			}
			System.out.println();
		
		}
	}
}
