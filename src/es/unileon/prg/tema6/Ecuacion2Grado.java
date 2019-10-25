package es.unileon.prg.tema6;


public class Ecuacion2Grado {
	
	/**
	 * Valor de los coeficientes
	 */
	private double a;
	private double b;
	private double c;
	
	/**
	 * 	Constructor de la clase. Crea una ecuacion con los valores asignados
	 * @param a
	 * @param b
	 * @param c
	 */
	public Ecuacion2Grado(double a, double b, double c) {
		
		this.a= a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Metodo para obtener el valor de a
	 * @return 
	 * 		retorna el valor de a
	 */
	double getValorA() {
		return this.a;
	}
	
	/**
	 * Metodo para obtener el valor de b
	 * @return 
	 * 		retorna el valor de b
	 */
	double getValorB() {
		return this.b;
	}
	
	/**
	 * Metodo para obtener el valor de c
	 * @return 
	 * 		retorna el valor de c
	 */
	double getValorC() {
		return this.c;
	}
	
	int numeroDeSoluciones() {
		
		int valor;
			if( this.a!= 0)
				valor =2;
			else if ( (this.a==0) && (this.b!=0) )
				valor = 1;
			else {
				valor = 0;
			}	
		return valor;
	}
	
	double resultadoA() {
		double x1;
		
		x1= (-b + (Math.sqrt( (	Math.pow(b, 2)	-	4*a*c) ) ) )	/	(2*a);
		
		return x1;
		
	}
	
	double resultadoB() {
		
		double x2;
		
		x2 = (-b - (Math.sqrt( (Math.pow(b, 2)	-	4*a*c) ) ) )	/	(2*a);
		
		return x2;
	}
	
	
	public String toString() {
		StringBuffer salida= new StringBuffer();
		
		salida.append("(" +a +")"+"x^2 " + "+" + "("+b+")"+"x" + "+" + "(" +c + ")"+" = \n");
		salida.append("El número de soluciones es: "+ numeroDeSoluciones());
		salida.append( "\nx1= "+ resultadoA());
		salida.append("\nx2= "+resultadoB() );
		
		
		return salida.toString();
	}
		
			
	
	
}