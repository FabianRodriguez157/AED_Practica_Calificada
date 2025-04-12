package complejidadaAlgoritmica;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el ejercicio que desea ingresar");
	    System.out.println("1. Suma objetivo en un arreglo");
	    System.out.println("2. Subarreglo con suma maxima");
	    System.out.print("Ingresar opcion: ");
	    int opcion = scanner.nextInt();
	    if (opcion == 1) {
	    	claseSumaObjeto();
	    }else if (opcion == 2) {
	    	claseSumaMaxima();
	    }else{
	    	System.out.println("opcion incorrecta");
	    }
	    scanner.close(); 
	}
	public static void claseSumaObjeto() {
		 SumaObjetivo prueba = new SumaObjetivo();
	     int[] ejemplo1 = {3, 5, 1, 7, 9};
	     int objetivo1 = 10;
	     System.out.println(prueba.existeSumaObjetivo(ejemplo1, objetivo1));int[] ejemplo2 = {2, 4, 6};
	     int objetivo2 = 11;      
	     System.out.println(prueba.existeSumaObjetivo(ejemplo2, objetivo2));
	}
	public static void claseSumaMaxima() {
		SumaMaximaSubarreglo prueba = new SumaMaximaSubarreglo();
        int[] ejemplo = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(prueba.maxSubarraySum(ejemplo)); 
	}
}
