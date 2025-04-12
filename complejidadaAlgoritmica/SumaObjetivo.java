package complejidadaAlgoritmica;

import java.util.HashSet;

public class SumaObjetivo {
	public boolean existeSumaObjetivo(int[] numeros, int objetivo) {
		HashSet<Integer> vistos = new HashSet<>();
	    for (int num : numeros) {
	    	int complemento = objetivo - num;
	        if (vistos.contains(complemento)) {
	        	return true;
	        }
	        vistos.add(num);
	    }	
	return false;	
	}
}
