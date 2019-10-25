package es.unileon.prg.tema6;


public class Ecuacion2Grado {
	
	/**
	 * Valor de los coeficientes
	 */
	private double a;
	private double b;
	private double c;
	
	
	public Ecuacion2Grado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Método para obtener el valor de a
	 * @return 
	 * 		retorna el valor de a
	 */
	double getValorA() {
		return this.a;
	}
	
	/**
	 * Método para obtener el valor de b
	 * @return 
	 * 		retorna el valor de b
	 */
	double getValorB() {
		return this.b;
	}
	
	/**
	 * Método para obtener el valor de c
	 * @return 
	 * 		retorna el valor de c
	 */
	double getValorC() {
		return this.c;
	}
	
	int numeroDeSoluciones() {
		
		int valor;
			if(a=0) 
				valor=2;
			else if(b=0)
				valor=1;
			else
				valor=0;
			
			System.out.println("el numero de soluciones son: " + valor);
		return valor;
	}
	
	
	public String toString() {
		StringBuffer salida= new StringBuffer();
		
		salida.append(a +"x^2 " + "+" + b+"x" + "+" + c + " =0");
		salida.append(numeroDeSoluciones());
		//salida.append("El resultado es: "+ resultado);
		
		return salida.toString();
	}
		
			
	
	
}