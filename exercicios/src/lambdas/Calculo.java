package lambdas;

@FunctionalInterface // Interface que implementa um unico metodo.
public interface Calculo {
	// só é possivel ter um metodo abstract dentro de uma interface
	public abstract double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal.";
	}

}
