package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "for".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030201 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion for";
	}

	/**
	 * Instruccion for - Ejercicio1.
	 *
	 * Programar el codigo que muestre la suma de los numeros comprendidos del 1 al 100
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","suma de los 100 primeros números");

		// Inicio modificacion 
		int suma = 0;
		
		for(int i =0; i<=100; i++) {
			suma = suma+i;
		}
		System.out.println(suma);
        // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio2.
	 *
	 * Programar el codigo  que calcule la media de los numeros impares menores que 1000.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "Media de los numeros impares menores que 100");

		// Inicio modificacion
		int suma =0;
		int media = 0;
		int totalImpares= 0;
		for ( int i=0; i<=100; i++) {
			
			if(i%2!=0) {
				totalImpares = totalImpares + 1; 
				suma = suma + i;
				media = suma/totalImpares;
			}
			
		}
		System.out.println("La media es: "+ media);	
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio3.
	 *
	 * Programar el codigo que calcule la suma de todos los numeros comprendidos entre 
	 * dos numeros n1 y n2 que introduzca el usuario.
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "suma comprendida");

		// Inicio modificacion
		int num1, num2;
		int suma = 0;
		System.out.println("Num1: ");
		num1= Teclado.readInteger();
		
		System.out.println("Num2: ");
		num2= Teclado.readInteger();
		
		
		for( int i= num1; i<=num2; i++) {
			suma= suma + i;
			
		}
		System.out.println("\nLA suma es: "+ suma);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio4.
	 *
	 * Programar el codigo  para que se lean 10 numeros enteros  del teclado y  se indique cuantas 
	 * veces aparece el 3, cuantas el 5 y cuantas el 7.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "numeros 3,5,7");

		// Inicio modificacion
		int num;
		int cont3= 0;
		int cont5=0;
		int cont7 = 0;
		for(int i=0; i<10; i++) {
			System.out.println("Introduzca un numero: ");
			num = Teclado.readInteger();
			
			if(num==3) {
				cont3= cont3+1;	
			}
			else if(num==5) {
				cont5= cont5+1;		
			}
			else if(num==7) {
				cont7= cont7+1;					
			}
		}
		System.out.println("El numero 3 aparace " + cont3 + " veces, " +"El numero 5 aparace " + cont5 + " veces, "+ "El numero 7 aparace " + cont7 + " veces");
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio5.
	 *
	 * Programar el codigo que lea 10 numeros enteros por teclado y diga cual es el mayor y
	 * el menor de todos ellos.
	 * 
	 */
	public void ejercicio05() {
		cabecera("05","mayor y menor de 10 numeros introducidos por teclado");

		// Inicio modificacion
		int max =0;
		int min =0;
		int num;
		for( int i=0; i<10 ;i++) {
			System.out.println("Inserta el número: ");
			num = Teclado.readInteger();
				if(i==0) {
					max = num;
					min = num;
				}else {
					if (num>max) {
						max = num;
					}
					else if( num<min) {
						min = num;
					}
				}		
		}
		System.out.println("El mayor es: "+max+" y el menor es: "+min);
        // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio6.
	 *
	 * Programar el codigo  que sume los numeros pares por un lado y los impares por otro  entre dos numeros enteros 
	 * introducidos por el usuario. Suponer que el primer numero es siempre par. 
	 * <ul>
	 * <li>Nota 1: Solo se debe utilizar un unico  bucle for.
	 * </ul>
	 *
	 * [Falta enunciado]
	 */
	public void ejercicio06() {
		cabecera("06", "Suma de pares e impares");

		// Inicio modificacion
		int n1,n2;
		int pares, impares;
		pares=0;
		impares = 0;
		
		System.out.println("Inserte el 1 número: ");
		n1= Teclado.readInteger();
		System.out.println("Inserte el 2 número: ");
		n2 = Teclado.readInteger();
		
		for( int i =n1; i<=n2; i++) {
			if(i%2==0) {
				pares= pares+i;
			}else {
				impares =impares +i;
			}
		}
		System.out.println("LA SUMA DE LOS NUMEROS PARES ES: "+pares);
		System.out.println("LA SUMA DE LOS NUMEROS IMPARES ES: "+ impares);
		
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio7.
	 *
	 * Consultar las clases String, StringBuffer y Character del API de java y escribir un codigo 
	 * que pida una cadena en minusculas y obtenga dos a partir de ella, una solo con vocales y 
	 * la otra el resto de caracteres. Posteriormente deberan convertir todos los caracteres de las 
	 * dos cadenas de minusculas a mayusculas. 
	 *
	 */
	public void ejercicio07() {
		cabecera("07", "subcadenas");

		// Inicio modificacion
		String cadena;
		StringBuffer vocales = new StringBuffer();
		StringBuffer caracteres = new StringBuffer();
		
		System.out.println("Inserte una cadena:");
		cadena = Teclado.readString();
		cadena.toLowerCase();
		for(int i=0; i<cadena.length(); i++) {
			if( (cadena.charAt(i)=='a')|| (cadena.charAt(i)=='e')||(cadena.charAt(i)=='i')||(cadena.charAt(i)=='o')||(cadena.charAt(i)=='u') ) {
				vocales.append(cadena.charAt(i) );
			}else
				caracteres.append(cadena.charAt(i));
			}
			System.out.println("Vocales de la cadena introducida: "+vocales);
			System.out.println("cadena vocales en mayusculas: "+vocales.toString().toUpperCase());
			System.out.println("cadena caracteres en mayusculas: "+caracteres.toString().toUpperCase());
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio8.
	 *
	 * Programar el codigo que  muestre la cadena con mayor numero de caracteres de un conjunto de 
	 * cadenas introducidas por el usuario (Si hay dos cadenas de igual tamanio se mostrara la primera 
	 * que se ha introducido). Previamente se le pedira al usuario el numero de cadenas que 
	 * desea introducir
	 * 
	 * <pre>Ejemplo de ejecucion
	 *  Introduce el numero de cadenas a leer: 4
	 *  
	 *  Cadena 1: hola que tal
	 *  Cadena 2: ayer fui
	 *  Cadena 3: en un lugar de la mancha
	 *  Cadena 4: la casa esta vacia
	 *  
	 *  Cadena mas larga: en un lugar de la mancha
	 *  </pre>
	 *
	 */
	public void ejercicio08() {
		cabecera("08", "comparacion de cadenas");

		// Inicio modificacion
		int numero;
		String cadena, cadenaMayor= " ";
		System.out.println("Cuantas cadenas desea introducir?");
		numero = Teclado.readInteger();
		
		for(int i=1;i<=numero;i++) {
			System.out.println("Inserte la "+i+"º cadena: ");
			cadena = Teclado.readString();
			if(cadena.length()>cadenaMayor.length() ) {
				cadenaMayor = cadena;
			}
		}
		System.out.println("La cadena mas larga es: "+cadenaMayor);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio9.
	 *
	 * Se pide
	 * <ul>
	 * <li>Quitar los comentarios indicados y compilar  el metodo ejercicio03() de la clase Apartado030102.
	 * <li>Modificar la clase Rectangulo
	 * <ul>
	 * <li>	Implementar el metodo: int compareTo(Rectangulo rectangulo) para que
	 * <ul>
	 * <li>	retorne -1 si el area del Rectangulo sobre el que se ejecuta el metodo  es menor que  
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * <li> retorne 0 si el area de los dos rectangulos es igual.
	 * <li> retorne 1 si el area del Rectangulo sobre el que se ejecuta el metodo  es mayor que 
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * </ul>
	 * </ul>
	 * <li>Modificar el metodo ejercicio09() de la clase Apartado030201 para que al ejecutarlo se muestre la 
	 *     informacion del rectangulo con mayor area.
	 * </ul>
	 *     
	 */
	public void ejercicio09() {
		cabecera("09", "comparacion de rectangulos");

		// Inicio modificacion
		
		
	    int n=4; //Numero de rectangulos a leer
		 Rectangulo rectanguloMaximo = new Rectangulo();
		 Rectangulo rectangulo = null;
		 int base, altura;
		
		for (int i=0; i<=n;i++)
		{
			System.out.println("Introduce la base del rectangulo "+i+" :");
			base=Teclado.readInteger();
			System.out.println("Introduce la altura del rectangulo "+i+" :");
			altura=Teclado.readInteger();
			rectangulo=new Rectangulo(base,altura);
			if(rectangulo.compareTo(rectanguloMaximo)== 1) {
				rectanguloMaximo = rectangulo;
			}
		}
		System.out.println("El rectangulo con mayor area es "+ rectanguloMaximo);
		// Fin modificacion
	}
			
	

	/**
	 * Instruccion for - Ejercicio10.
	 *
	 * Modificar los metodos de la clase TablaConversion para que al ejecutar el metodo ejercicio010()
	 * de la clase Apartado030201 se muestre una tabla de conversion con el siguiente formato.
	 *
	 * Ejemplo
	 * 
	 * C	F	C	F	C	F	C	F	C	F	
	 * 0	32	1	33	2	35	3	37	4	39
	 * 5	41	6	42	7	44	8	46	9	48
	 * 10	50	11	51	12	53	13	55	14	57
	 * 15	59	16	60	17	62	18	64	19	66
	 * 20	68	21	69	22	71	23	73	24	75
	 * 25	77	26	78	27	80	28	82	29	84
	 * 30	86	31	87	32	89	33	91	34	93
	 * 35	95	36	96	37	98	38	100	39	102
	 * 40	104	41	105	42	107	43	109	44	111
	 * 45	113	46	114	47	116	48	118	49	120	
	 */
	public void ejercicio10() {
		cabecera("10", "Tabla de conversión");

		TablaConversion tabla=new TablaConversion(5,10);
		tabla.imprimir();
	}
}
