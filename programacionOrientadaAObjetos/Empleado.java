package programacionOrientadaAObjetos;

public abstract class Empleado {
	protected String nombre; 
	protected double salarioBase;

	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}
	
	public abstract double calcularSalarioFinal();
	public abstract void mostrarInformacion();
}
 


