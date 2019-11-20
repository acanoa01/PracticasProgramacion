package es.unileon.prg.tema7;
/**
 * Clase con los ejercicios correspondientes a arrays: gestion de memoria.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030101 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Gestion de memoria";
	}

    private String[] _matrizCadenas;;
	private String[] _otraMatriz;
	private String[][] _tablaCadenas;

	/**
	 * Gestion de memoria - Ejercicio1.
	 *
	 * Se pide completar el metodo para que, una vez ejecutado, la situacion
	 * en memoria sea igual a la representada en la figura.
	 */
	public void ejercicio01() {
		// Inicio modificacion
		String[] _matrizCadenas;
		_matrizCadenas = new String[1];
        // Fin modificacion

        System.out.println("_matrizCadenas => "+_matrizCadenas);
		System.out.println("_matrizCadenas[0] => "+_matrizCadenas[0]);
	}

	/**
	 * Gestion de memoria - Ejercicio2.
	 *
	 * Se pide completar el metodo para que, una vez ejecutado, la situacion
	 * en memoria sea igual a la representada en la figura.
	 */
	public void ejercicio02() {
		ejercicio01();

		// Inicio modificacion
		_matrizCadenas = new String[4];
		_matrizCadenas[0] = "HOLA";
        // Fin modificacion

        System.out.println("_matrizCadenas => "+_matrizCadenas);
		System.out.println("_matrizCadenas[0] => "+_matrizCadenas[0]);
		System.out.println("_matrizCadenas[1] => "+_matrizCadenas[1]);
		System.out.println("_matrizCadenas[2] => "+_matrizCadenas[2]);
		System.out.println("_matrizCadenas[3] => "+_matrizCadenas[3]);
	}

	/**
	 * Gestion de memoria - Ejercicio3.
	 *
	 * Se pide completar el metodo para que, una vez ejecutado, la situacion
	 * en memoria sea igual a la representada en la figura.
	 */
	public void ejercicio03() {
		ejercicio02();

		// Inicio modificacion
		
		String [] _otraMatriz = new String[3];
		
		_otraMatriz[0]= "PRACTICA";
		_otraMatriz[1]= "DE";
		_otraMatriz[2]= "MATRICES";
		String temporal = _otraMatriz[0];
		
		// Fin modificacion

		System.out.println("_otraMatriz => "+_otraMatriz);
		System.out.println("_otraMatriz[0] =>"+_otraMatriz[0]);
		System.out.println("_otraMatriz[1] =>"+_otraMatriz[1]);
		System.out.println("_otraMatriz[2] =>"+_otraMatriz[2]);
		// DESCOMENTAR
		System.out.println("temporal => " + temporal);
	}

	/**
	 * Gestion de memoria - Ejercicio4.
	 *
	 * Se pide completar el metodo para que, una vez ejecutado, la situacion
	 * en memoria sea igual a la representada en la figura.
	 */
	public void ejercicio04() {
		ejercicio03();

		// Inicio modificacion
		String[] _tablaCadenas;
		_tablaCadenas = new String[3];
		_tablaCadenas[0] = _matrizCadenas[0];
		_tablaCadenas[1] = _otraMatriz[0];
		// Fin modificacion

        System.out.println("_tablaCadenas    => "+_tablaCadenas);
        System.out.println("_tablaCadenas[0] => "+_tablaCadenas[0]);
        System.out.println("_tablaCadenas[1] => "+_tablaCadenas[1]);
        System.out.println("_tablaCadenas[2] => "+_tablaCadenas[2]);
	}

	/**
	 * Gestion de memoria - Ejercicio5.
	 *
	 * Se pide completar el metodo para que, una vez ejecutado, la situacion
	 * en memoria sea igual a la representada en la figura.
	 */
	public void ejercicio05() {
		ejercicio04();

		// Inicio modificacion
        // Fin modificacion

        System.out.println("_tablaCadenas[0][0] => "+_tablaCadenas[0][0]);
        System.out.println("_tablaCadenas[0][1] => "+_tablaCadenas[0][1]);
        System.out.println("_tablaCadenas[1][0] => "+_tablaCadenas[1][0]);
        System.out.println("_tablaCadenas[1][1] => "+_tablaCadenas[1][1]);
        System.out.println("_tablaCadenas[1][2] => "+_tablaCadenas[1][2]);
	}
}
