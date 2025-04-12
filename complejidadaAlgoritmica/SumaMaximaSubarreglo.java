package complejidadaAlgoritmica;

public class SumaMaximaSubarreglo {
	public int maxSubarraySum(int[] numeros) {
        int maxActual = numeros[0];
        int maxGlobal = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            maxActual = Math.max(numeros[i], maxActual + numeros[i]);
            if (maxActual > maxGlobal) {
                maxGlobal = maxActual;
            }
        }
        return maxGlobal;
    }
}
