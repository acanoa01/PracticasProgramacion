package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instruccion "if".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030101 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion if";
	}

	/**
	 * Instruccion if - Ejercicio1.
	 *
	 * </br>
	 *
	 * Realizar las modificaciones necesarias para que al ejecutar el metodo se muestren
	 * los datos del alumno por pantalla y  si la nota que tiene es menor que cinco 
	 * que a continuacion se muestre el mensaje: El alumno debe recuperar
	 * 
	 * Ejemplo de ejecucion 1
	 * 
	 * <pre>	NIU: 1000011111 Nombre: Juan Nota: 6</pre>           
	 * 
	 * Ejemplo de ejecucion 2;
	 * 
	 * <pre>	NIU: 1000011111 Nombre: Juan Nota: 3.2</pre>
	 * <pre>	El alumno debe recuperar</pre>
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","sentencia if");

		//Cambiar el valor de la nota para hacer pruebas
		float nota=(float) 3.2;
			
		Alumno alumno =new Alumno("1000011111","Juan");
		alumno.asignarNota(nota);
		System.out.println(alumno);
		//Inicio modificacion
		if(nota<5)
			System.out.println("El alumno debe recuperar");
		
		// Fin modificacion
	}

	/**
	 * Instruccion if - Ejercicio2.
	 *
	 * </br>
	 *
	 * Basandose en el  ejercicio1 realizar las modificaciones oportunas incluyendolas 
	 * es este metodo de forma  que al ejecutarlo se pida al usuario del programa que introduzca 
	 * la nota del alumno.
	 */
	public void ejercicio02() {
		cabecera("02", "modificacion ejercicio 1");

		// Inicio modificacion
		float nota;
		Alumno alumno =new Alumno("1000011111","Juan");
		System.out.println("Introduzca la nota del alumno: ");
		nota=Teclado.readFloat();
		alumno.asignarNota(nota);
		System.out.println(alumno);
		
		if(nota<5)
			System.out.println("El alumno debe recuperar");
		// Fin modificacion
	}

	/**
	 * Instruccion if - Ejercicio3.
	 *
	 * </br>
	 *
	 * Basandose en el  ejercicio2 y en la documentacion de la clase Teclado, 
	 * realizar las modificaciones oportunas incluyendolas es este metodo de forma  que si el 
	 * usuario introduce un valor que no es un float el programa muestre el siguiente 
	 * mensaje: Los datos que se muestran a continuacion no son correctos
	 */
	public void ejercicio03() {
		cabecera("03", "modificación 02");

		// Inicio modificacion
		float nota;
		Alumno alumno =new Alumno("1000011111","Juan");
		
		System.out.println("Introduzca la nota del alumno: ");
		nota=Teclado.readFloat();
		
			if(nota!=Teclado.readFloat() ) {
				System.out.println("Los datos que se muestran a continuacion no son correctos");
			}
			else if( nota<5) {
				System.out.println("El alumno debe recuperar");
			}
			alumno.asignarNota(nota);
			System.out.println(alumno);
			
		// Fin modificacion
		System.out.println("Fin del ejercicio03");
	}

	/**
	 * Instruccion if - Ejercicio4.
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.txt como se evaluan las expresiones condicionales y 
	 * 		el porque de los resultados
	 * </ul>
	 */
	public void ejercicio04() {
		cabecera("04", "analisis de condiciones");

		boolean a = true;
		boolean b = false;
		int n1=5, n2=8;
	
		if ((!a && b) || !(n2>n1))
			System.out.println("Resultado 1");

		if ((!a || b) || !(n1>n2))
			System.out.println("Resultado 2");

		if ((n1>=n2) && (a || b))
			System.out.println("Resultado 3");
		
		System.out.println("Fin del ejercicio04");
	}

	/**
	 * Instruccion if - Ejercicio5.
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Quitar los comentarios indicados
	 * <li> Compilar 
	 * <li> Identificar los errores de compilacion y modificar el codigo  para resolverlos.
	 * </ul>
	 * 	
	 */
	public void ejercicio05() {
		cabecera("05","Media alumno sin excepciones");

		Alumno alumno =new Alumno("1000011111","Juan");
		int nota1=0, nota2=0, nota3=0, sumaNotas=0;
		float media=0;
       
		System.out.println("Introduce la nota del primer examen:");
		nota1=Teclado.readInteger();

		System.out.println("Introduce la nota del segundo examen:");
		nota2=Teclado.readInteger();

		System.out.println("Introduce la nota del tercer examen:");
		nota3=Teclado.readInteger();


		// Inicio modificacion
		
		if (nota1>=0)
           sumaNotas=nota1;
           if (nota2>=0)
             sumaNotas=sumaNotas + nota2;
             if (nota3>=0) {
                sumaNotas=sumaNotas + nota3;
                media=sumaNotas/3;
             }
               
       
	   // Fin modificacion
		
       alumno.asignarNota(media);
       System.out.println(alumno);
	}

	/**
	 * Instruccion if - Ejercicio6.
	 *
	 * Modificar el código del ejercicio 5 de forma que el resultado 
	 * sea la nota media de las tres notas solo si las 3 están aprobadas 
	 * y cero en caso contrario. Se debe resolver con una sola sentencia  if. 
	 * 
	 */
	public void ejercicio06() {
		cabecera("06", "unica sentencia");

		// Inicio modificacion
		Alumno alumno =new Alumno("1000011111","Juan");
		int nota1=0, nota2=0, nota3=0, sumaNotas=0;
		float media=0;
       
		System.out.println("Introduce la nota del primer examen:");
		nota1=Teclado.readInteger();

		System.out.println("Introduce la nota del segundo examen:");
		nota2=Teclado.readInteger();

		System.out.println("Introduce la nota del tercer examen:");
		nota3=Teclado.readInteger();
		
		if(nota1>=5 && nota2>=5 && nota3>=5) {
			sumaNotas=(nota1+nota2+nota3);
			media=sumaNotas/3;
		}
		
		alumno.asignarNota(media);
		
	       System.out.println(alumno);

		// Fin modificacion
	}

	/**
	 * Instruccion if - Ejercicio7.
	 *
	 * Modificar los siguientes metodos de la clase Rectangulo de forma que realicen el comportamiento explicado:
	 * 
	 *  
	 *  <ul>
	 *  <li>Rectangulo(int base, int altura)
	 *  	<ul>
	 *  	<li>Crea un rectangulo con la base y altura especificadas.
	 *  	<li>Si las dimensiones son menores que 0 crea un rectangulo sin dimensiones (base=0 y altura=0).
	 *  	</ul>
	 *  <li>setBase
	 *  	<ul>
	 *  	<li>Modifica la base del rectangulo solo si la base introducida  es mayor que 0.
	 *  	</ul>
	 *  <li>setAltura
	 *  	<ul>
	 *  	<li>Modifica la altura del rectangulo solo si la altura introducida  es mayor que 0.
	 *  	</ul>
	 *  <li>esUnCudrado
	 *  	<ul>
	 *  	<li>Retorna true si el rectangulo es un cuadrado y false si no lo es.
	 *  	<li>Un rectangulo sin dimensiones (base=0 y altura=0) no se considera un cuadrado.
	 *  	</ul>
	 *  <li>toString
	 *  	<ul>
	 *  	<li>Si el rectangulo es un cuadrado se indica con el texto: Es un cuadrado.
	 *  	<li>Nota: utilizar el metodo esUnCuadrado.
	 *  	</ul>
	 *  </ul>
	 *  Modificar el metodo ejercicio07() para probar la clase Rectangulo
	 *
	 */
	public void ejercicio07() {
		cabecera("07", "Clase rectángulo");
		
		int base=0, altura=0;
			
		System.out.println("Introduce la base del rectangulo:");
		base=Teclado.readInteger();

		System.out.println("Introduce la altura del rectangulo:");
		altura=Teclado.readInteger();

		Rectangulo rectangulo= new Rectangulo(base,altura);
		// Inicio modificacion
		
		System.out.println(rectangulo);
		// Fin modificacion
	}

	/**
	 * Instruccion if - Ejercicio8.
	 *
	 * Leer dos numeros introducidos por teclado. 
	 * Compararlos y si el primero es mayor que el segundo intercambiarlos. 
	 * Mostrar los numeros
	 *
	 */
	public void ejercicio08() {
		cabecera("08", "Intercambio de numeros");

		// Inicio modificacion
		int num1, num2,aux;
		aux=0;
		System.out.println("Introduzca un valor para num1: ");
		num1=Teclado.readInteger();
		System.out.println("Introduzca un valor para num2: ");
		num2=Teclado.readInteger();
		System.out.println("Situacion inicial: numero10= " + num1 + " num2= "+num2);
		if(num1>num2) {
			aux=num1;
			num1=num2;
			num2=aux;		
		}
		System.out.println("Situacion final: numero1= "  + num1 + " num2= "+num2);
		 
		// Fin modificacion
	}

	/**
	 * Instruccion if - Ejercicio9.
	 *
	 * Se pide:
	 * <ul>
	 * <li>Compilar y ejecutar el metodo.
	 * <li>Analizar los resultados obtenidos.
	 * <li>Explicar en el fichero LEEME.TXT los resultados obtenidos.
	 * </ul>
	 */
	public void ejercicio09() {
		cabecera("09", "comparacion de objetos");

        NumeroEntero n1 = new NumeroEntero(10);
        NumeroEntero n2 = new NumeroEntero(10);
        
        if (n1 == n2){
                System.out.println("N1 y N2 son iguales");
        }

        if (n1 != n2){
                System.out.println("N1 y N2 son distintos");
        }
	
	}

	/**
	 * Instruccion if - Ejercicio10.
	 *
	 * Se pide:
	 * <ul>
	 * <li>Compilar y ejecutar el metodo.
	 * <li>Analizar los resultados obtenidos.
	 * <li>Explicar en el fichero LEEME.TXT los resultados obtenidos.
	 * <li>Implementar el metodo equals de la clase NumeroEntero.Dos objetos de tipo
	 *     NumeroEntero son iguales si su valor es el mismo
	 * <li>Compilar y ejecutar el metodo.
	 * <li>Analizar los resultados obtenidos.
	 * <li>Explicar en el fichero LEEME.TXT los resultados obtenidos.
	 * </ul>
	 */
	public void ejercicio10() {
		cabecera("10", "Referencias a objetos");

        NumeroEntero n1 = new NumeroEntero(10);
        NumeroEntero n2 = new NumeroEntero(10);
        NumeroEntero aux=n1;
        
        if (n1.equals(n2)==true){
        	System.out.println("N1 y N2 son iguales");
        }

        if (n1.equals(n2)==false){
            System.out.println("N1 y N2 son distintos");
        }

        if (n1.equals(aux)==true){
            System.out.println("N1 y AUX son iguales");
        }

        if (n2.equals(aux)==true){
            System.out.println("N2 y AUX son iguales");
        }
		
	}
}
