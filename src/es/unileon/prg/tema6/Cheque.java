package es.unileon.prg.tema6;

/**
 * Clase que representa un cheque definido con un numero y los digitos que tiene
 * el mismo Impementa un metodo para comprobar que un cheque es falso
 * 
 * @author PRG
 * @version (1.0)
 */

public class Cheque {
	/**
	 * Digitos del cheque
	 * 
	 */
	private int DIGITOS = 10;
	/**
	 * Numero que identifica al cheqte
	 * 
	 */
	private String numeroDeCheque;

	/**
	 * Constructor de la clase Cheque. Recibe un String con el numero de Cheque
	 * 
	 * @param numero
	 *            Numero del cheque
	 */
	public Cheque(String numero) {
		this.numeroDeCheque = numero;
	}

	/**
	 * Devuelve true si el numero de cheque es falso y false si es correcto
	 * 
	 * @return true si el cheque es falso, false en caso contrario
	 */
	
	public boolean esFalso() {
	
		boolean esFalso = false;
		// Inicio modificacion - ejercicio02() de la clase Apartado030204 -.
		int nCeros = 0;
		int nNumeros = 0;
		int i;
		char digit;
		//Recorremos el cheque
		i=0;
		while( !esFalso && i< this.DIGITOS) 
		{
			digit = this.numeroDeCheque.charAt(i);
			//Comparamos las posiciones del cheque
			if(digit=='0') 
			{
				nCeros++;
				nNumeros =0;
				if(nCeros>=3) 
				{
					esFalso = true;
				}
			}
			else 
			{
				nCeros = 0;
				nNumeros++;
				if(nNumeros>=4) 
				{
					esFalso = true;
				}
			}
			i++;
		}
		
			
		// Fin modificacion - ejercicio02() de la clase Apartado030204 -.
		return esFalso;
	}
	
	
}
