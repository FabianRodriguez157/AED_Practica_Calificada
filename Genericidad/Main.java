package Genericidad;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el ejercicio que desea ingresar");
	    System.out.println("1. Contenedor");
	    System.out.println("2. Par");
	    System.out.print("Ingresar opcion: ");
	    int opcion = scanner.nextInt();
	    if (opcion == 1) {
	    	claseContenedor();
	    }else if (opcion == 2) {
	    	clasePar();
	    }else{
	    	System.out.println("opcion incorrecta");
	    }
	    scanner.close(); 
	}
	public static void claseContenedor() {
		Contenedor<String> contenedorStrings = new Contenedor<>();
        contenedorStrings.agregar("Hola");
        contenedorStrings.agregar("Como");
        contenedorStrings.agregar("Adios");
        contenedorStrings.agregar("Arriba");
        contenedorStrings.agregar("Centro");
        

        System.out.println("Contenedor de Strings:");
        System.out.println("Total de elementos: " + contenedorStrings.contar());
        System.out.println("Está vacío: " + contenedorStrings.estaVacio());
        System.out.println("Elemento en índice 1: " + contenedorStrings.obtener(1));

        Contenedor<Producto> contenedorProductos = new Contenedor<>();
        contenedorProductos.agregar(new Producto("Laptop", 1200.00));
        contenedorProductos.agregar(new Producto("Laptop gamer", 2800.00));
        contenedorProductos.agregar(new Producto("Refrigerador", 5000.00));
        
        System.out.println("\nContenedor de Productos:");
        System.out.println("Total de elementos: " + contenedorProductos.contar());
        System.out.println("Está vacío: " + contenedorProductos.estaVacio());
        System.out.println("Elemento en índice 0: " + contenedorProductos.obtener(0));
	}
	public static void clasePar() {
		Par<String, Integer> par1 = new Par<>("Edad", 25);
        System.out.println("Par 1: " + par1);

        Empleado empleado = new Empleado("Ricardo Emiliano Nuñez", 3500.50);
        Par<Empleado, String> par2 = new Par<>(empleado, "Empleado de RRHH");
        System.out.println("Par 2: " + par2);

        Par<Double, Boolean> par3 = new Par<>(3.14, true);
        System.out.println("Par 3: " + par3);
	}
	
}
