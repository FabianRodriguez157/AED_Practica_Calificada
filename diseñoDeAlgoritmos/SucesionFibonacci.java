package diseñoDeAlgoritmos;

import java.util.HashMap;
import java.util.Map;

public class SucesionFibonacci {
    public int fibonacciSimple(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciSimple(n - 1) + fibonacciSimple(n - 2);
    }
    public int fibonacciMemo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        Map<Integer, Integer> memo = new HashMap<>();
        return fibonacciMemoH(n, memo);
    }
    private int fibonacciMemoH(int n, Map<Integer, Integer> memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        int resultado = fibonacciMemoH(n - 1, memo) + fibonacciMemoH(n - 2, memo);
        memo.put(n, resultado);
        return resultado;
    }
}