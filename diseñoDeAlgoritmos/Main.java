package diseñoDeAlgoritmos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el ejercicio que desea ingresar");
	    System.out.println("1. Suma objetivo en un arreglo");
	    System.out.println("2. Subarreglo con suma maxima");
	    System.out.print("Ingresar opcion: ");
	    int opcion = scanner.nextInt();
	    if (opcion == 1) {
	    	claseFibonacci();
	    }else if (opcion == 2) {
	    	claseMergeSort();
	    }else{
	    	System.out.println("opcion incorrecta");
	    }
	    scanner.close(); 
	}
	public static void claseFibonacci() {
		 SucesionFibonacci prueba = new SucesionFibonacci();
	     System.out.println(prueba.fibonacciSimple(20));
	     System.out.println(prueba.fibonacciMemo(20));  
	}
	public static void claseMergeSort() {
		MergeSort prueba = new MergeSort();

        int[] ejemplo1 = {5, 2, 9, 1, 5, 6};
        prueba.mergeSort(ejemplo1);
        for (int num : ejemplo1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] ejemplo2 = {3, -1, 0, 8, 7, 2};
        prueba.mergeSort(ejemplo2);
        for (int num : ejemplo2) {
            System.out.print(num + " ");
        }
	}
}
