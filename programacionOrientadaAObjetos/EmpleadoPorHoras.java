package programacionOrientadaAObjetos;

public class EmpleadoPorHoras extends Empleado {
	 private int horasTrabajadas; 
	 private double pagoPorHora;  

	 public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double pagoPorHora) {
	     super(nombre, salarioBase); 
	     this.horasTrabajadas = horasTrabajadas;
	     this.pagoPorHora = pagoPorHora;
	 }

	 @Override
	 public double calcularSalarioFinal() {
	     return horasTrabajadas * pagoPorHora;
	 }
	 
	 @Override
	 public void mostrarInformacion() {
	     System.out.println("Empleado por Horas: " + nombre);
	     System.out.println("Salario Final: " + calcularSalarioFinal());
	 }
}
