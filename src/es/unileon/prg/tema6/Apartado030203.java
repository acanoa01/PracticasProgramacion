package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "do-while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030203 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion do-while";
	}

	/**
	 * Instruccion do-while - Ejercicio1.
	 *
	 * Programar el codigo que ofrezca un menu de opciones al usuario  hasta que seleccione la opcion salir.
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","menu repetitivo");

		// Inicio modificacion
		int option;
		do {
			
			System.out.println("Choose an option: 1:option1      2:option2      3:salir");
			option = Teclado.readInteger();
			
		} while(option!=3);
		
        // Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual a cero 
	 * o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 * 
	 * Similar al  ejercicio02() de la clase Apartado030202 pero empleando la sentencia do-while).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int num, numAnt=0;
		boolean repeat = false;
		do {
			System.out.println("Inserte un número: ");
			num = Teclado.readInteger();
				if(num == numAnt) 
					repeat= true;
				numAnt=num;
		}while( (!repeat) && (num!=0) );
		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio3.
	 *
	 * Programar el codigo que lea la base y la altura de un numero indeterminado de rectangulos y
	 * cree los correspondientes objetos de tipo Rectangulo. Para cada rectangulo el programa mostrara 
	 * por pantalla su area y si es un cuadrado o un rectangulo. El programa terminara cuando alguno 
	 * de los lados del cuadrilatero sea menor o igual que  0.
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "Rectangulos");

		// Inicio modificacion
		Rectangulo rectangulo = null;
		int base, altura;
		do {
			System.out.println("Introduce la base del rectangulo: ");
			base = Teclado.readInteger();
			System.out.println("Introduce la altura del rectangulo: ");
			altura = Teclado.readInteger();
			
				rectangulo = new Rectangulo(base, altura);
				System.out.println(rectangulo);
			
		}while(base>0 && altura>0);
	
		
		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio4.
	 *
	 * Programar el codigo que dado un numero entero introducido por teclado indique si es o no perfecto.
	 * Un numero entero es perfecto si es igual a la suma de los sus divisores positivos menores que el.
	 * Ejemplos
	 * <ul>
	 * <li>6 es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el  son 1, 2, 3  y
	 * <li> 1 + 2 + 3 = 6;
	 * </ul>
	 * <li> 8 no es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el son 1, 2,4  y
	 * <li> 1+2+4  !=  8
	 * </ul>
	 * </ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int num;
		int divisor =1;
		int sumaDivisores =0;
		System.out.println("Inserte un número: ");
		num = Teclado.readInteger();
		do {
			if( num % divisor == 0) {
				sumaDivisores= sumaDivisores+ divisor;
				
			}
			divisor++;
		}while(divisor < num);
		
		if(sumaDivisores == num) {
			System.out.println("Este número es perfecto");
		}else {
			System.out.println("Este numero no es perfecto");
		}
		// Fin modificacion
	}
}

