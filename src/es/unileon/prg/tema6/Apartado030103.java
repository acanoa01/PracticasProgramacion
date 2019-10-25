package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","Calificaciones");

		// Inicio modificacion
		int cal;
		System.out.println("Inserte la califacion: ");
		cal= Teclado.readInteger();
		
		switch(cal) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficente");
			break;
		case 6:
			System.out.println("Bien");
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
		case 10:
			System.out.println("Matricula");
		}
		
        // Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int num;
		System.out.println("Introduzca un número entero: ");
		num= Teclado.readInteger();
		switch(num) {
		case 0:
			if(num==0)
				System.out.println("El número tiene 1 anillo");
				break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("El número tiene 0 anillo");
				break;
		case 6:
			if(num==6)
				System.out.println("El dígito tiene 1 anillo");
				break;
		case 7:
			System.out.println("El número tiene 0 anillo");
				break;
		case 8:
			if(num==8)
				System.out.println("El número tiene dos anillos");
				break;
		case 9:
			if( num==9)
				System.out.println("El dígito tiene 1 anillos");
				break;
		default:
			System.out.println("Introduzca un número");
		}
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "menu con switch");

		// Inicio modificacion
		int num1, num2,option;
		int suma, mul;
		//Introduccion de numeros
		System.out.println("Introduzc el 1 numero: ");
		num1=Teclado.readInteger();
		System.out.println("Introduzc el 2 numero: ");
		num2=Teclado.readInteger();
		//seleccion de opcion
		System.out.println("Choose an option: -1:Suma    -2:Multiplicacion      -3:Divisores");
		option=Teclado.readInteger();
		
			switch(option) {
			case 1:
				suma = num1 + num2;
				System.out.println("El resultado es: "+ suma);
				break;
			case 2:
				mul = num1 * num2;
				System.out.println("El resultado es: "+mul);
				break;
			case 3:
				if(num1%num2==0)
					System.out.println("El num2 es divisor del num1");
				else if( num2%num1==0)
					System.out.println("El num1 es divisor del num2");
				else
					System.out.println("No son divisores entre si");
			}
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		
		// Fin modificacion
	}
}
