package programacionOrientadaAObjetos;

import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ingresar");
        System.out.println("1. Empleado");
        System.out.println("2. Vehiculo");
        System.out.print("Ingresar opcion: ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
        	claseEmpleado();
        }else if (opcion == 2) {
        	claseVehiculo();
        }else{
        	System.out.println("opcion incorrecta");
        }
        scanner.close(); 
    }
	public static void claseEmpleado() {
		Empleado empleado1 = new EmpleadoTiempoCompleto("Jose Cardenas", 1800.00, 200.00);
        Empleado empleado2 = new EmpleadoPorHoras("Antonio Muñoz", 0.00, 160, 15.00);

        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
	}
	public static void claseVehiculo() {
		Vehiculo vehiculo1 = new Automovil("Toyota", "Corolla", 2020, 15000, true);
		Vehiculo vehiculo2 = new Automovil("Ford", "Focus", 2019, 18000, true);
        Vehiculo vehiculo3 = new Motocicleta("Honda", "CBR", 2019, 600);

        System.out.println("Costo de mantenimiento del Automóvil: " + vehiculo1.calcularCostoMantenimiento());
        System.out.println("Costo de mantenimiento de la Motocicleta: " + vehiculo2.calcularCostoMantenimiento());
        System.out.println("Costo de mantenimiento de la Motocicleta: " + vehiculo3.calcularCostoMantenimiento());

        compararCostoMantenimiento(vehiculo1, vehiculo3);
	}
	public static void compararCostoMantenimiento(Vehiculo v1, Vehiculo v2) {
        double costoV1 = v1.calcularCostoMantenimiento();
        double costoV2 = v2.calcularCostoMantenimiento();

        if (costoV1 > costoV2) {
            System.out.println("El vehículo " + v1.getMarca() + " " + v1.getModelo() + " tiene un mayor costo de mantenimiento.");
        } else if (costoV1 < costoV2) {
            System.out.println("El vehículo " + v2.getMarca() + " " + v2.getModelo() + " tiene un mayor costo de mantenimiento.");
        } else {
            System.out.println("Ambos vehículos tienen el mismo costo de mantenimiento.");
        }
    }
}
