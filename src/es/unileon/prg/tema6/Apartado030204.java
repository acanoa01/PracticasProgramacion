package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales
 * y de repeticion anidadas.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030204 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Sentencias anidadas";
	}

	/**
	 * Sentencias anidadas - Ejercicio1.
	 *
	 * Programar el codigo que muestre todos los numeros perfectos comprendidos 
	 * entre dos numeros n1 y n2 introducidos por teclado
	 */
	public void ejercicio01() {
		cabecera("01","Números perfectos");

		// Inicio modificacion
		int n1,n2;
		int suma;
		int divisor;
		int perfecto;
		System.out.println("Inserte valor para n1: ");
		n1 = Teclado.readInteger();
		System.out.println("Iserte valor para n2: ");
		n2 = Teclado.readInteger();
		
		for(perfecto=n1; perfecto<=n2; perfecto++) {		//Bucle para leer los números comprendidos entre n1 y n2
			suma = 0;					// Inicializamos las variables suma y divisor
			divisor=1;
			do {						//Mientras el divisor sea menor que el numero hacemos la sentencia if
				if(perfecto % divisor==0)
					suma = suma + divisor;
				divisor++;
			}while( divisor < perfecto);
			
			if( perfecto == suma)		//Si elnumero es igual a la suma de sus divisores menores que el,el numero es pefecto
				System.out.println("El número "+perfecto+ " es perfecto");
				
		}
        // Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio2.
	 *
	 * Un banco quiere implementar una aplicacion para detectar cheques falsificados. 
	 * Un cheque es falso si en su numero (compuesto por 10 digitos) hay: 3 o mas ceros seguidos 
	 * y/o cuatro o mas numeros distintos de cero seguidos.
	 * 
	 * Completar la clase Cheque para que detecte los cheques falsos.
	 * 
	 * Probar la clase Cheque  sobre el metodo ejercicio02() de la clase Apartado030204.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "Veracidad de cheques");

		Cheque cheque=null;
		
		//Modificar el numero de cheque para probar
		//cheque=new Cheque("1000988887");    
        cheque=new Cheque("1010098888");
        //cheque=new Cheque("1009808880");   
        
       
         if (cheque.esFalso()==true)
        	 System.out.println("El cheque es falso");
         else
             System.out.println("El cheque no es falso");
	}

	/**
	 * Sentencias anidadas  - Ejercicio3.
	 *
	 * Programar el codigo que genere dado un tamanio (entero) introducido por teclado los siguientes dibujos:
	 * 
	 * Ejemplo de ejecucion  
	 * 
	 * Introduce el tamanio: 4
	 * 	Triangulo
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	Cuadrado Relleno
	 * 	****
	 * 	****
	 * 	****
	 *  ****
	 *  
	 *  Cuadrado vacio
	 *  ****
	 *  *  *
	 *  *  *
	 *  ****
	 * 
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "figuras");

		// Inicio modificacion
		int n;
		System.out.println("Introduce un tamanio: ");
		n=Teclado.readInteger();
		
		//Triangulo
		System.out.println("Triangulo");
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//Cuadrado
		System.out.println("\nCuadrado");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) { 
				System.out.print("*");	
			}
			System.out.println();
		}
		//Cuadrado vacio
		System.out.println("\nCuadrado Vacio");
		
		//Linea superior
		for(int i=0;i<n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//Cuadrado intermedio
		 for(int i = 0; i < n-2; i++) {
             System.out.print("*");
             for(int j = 0; j < n-2; j++) {
                 System.out.print(" ");
             }
             System.out.println("*");
         }
		 //Linea inferior
		 for(int i=0;i<n; i++) {
				System.out.print('*');
			}
			System.out.println();
		// Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio4.
	 *
	 * 
	 * Programar el codigo que plantee un pequenio juego al usuario.
	 * <ul>
	 * <li>	El ordenador pensara un numero entre 1 y 100 (generar un numero aleatorio)
	 * <li>	El usuario dispondra de 5 intentos para acertar el numero.
	 * <li>	Por cada intento el ordenador indicara si el numero buscado es menor o mayor 
	 * 		 al introducido y se el usuario ha acertado.
	 * <li> Cuando se acierte el numero correcto debera mostrarse cuantos ensayos han sido 
	 * 		necesarios hasta llegar a la solucion.
	 * <li>	Una vez hecho esto debera preguntar si se desea empezar de nuevo con otro numero o 
	 * 		si desea terminar el juego.
	 *</ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "juego");

		// Inicio modificacion
		double random =Math.random()*100;
		double num;
		int option;
		int tries = 0;
			do{
				System.out.println("Vamos a jugar a un juego");
				System.out.println("Yo pienso en un numero y tu tienes 5 intentos para adivinarlo!!");
				
				//Contador de intentos
				for(int i=1; i<=5; i++) {
					System.out.println("Intento "+i+" : ");
					System.out.println("¿Qué número estoy pensando?");
					num = Teclado.readInteger();
					if(num>random) {
						System.out.println("El número " + num + " introducido es mayor");
						
					}
					else if(num<random) {
						System.out.println("El numero introducido es menor");
						tries= tries+1;
					}
					else if(num==random) {
						System.out.println("Enhorabuena, has acertado");
						System.out.println("Número de intentos: "+i);
						i=5;
					}
					//else if(num!=Teclado.readDouble()) {
						//System.out.println("Eso no es un número, acabas de perder un intento");
						//tries= tries+1;
					//}
					tries=tries+1;
				if(tries==5){
					System.out.println("Oh,lo siento, no has acertado");
					System.out.println("El numero era: " + random);
				}
					
			}
				
				System.out.println("¡Quieres volver a retarme?");
				System.out.println("1:Si, por supuesto      2:Tu ganas, me retiro");
				option=Teclado.readInteger();
			}while(option!=2);
		// Fin modificacion
	}
}
