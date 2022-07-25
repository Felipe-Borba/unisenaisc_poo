/* Maximo.java
   Classe que retorna o valor máximo de uma lista de números. */
public class Maximo {
    public static int max(int... numeros) {
	int max = Integer.MIN_VALUE;
	for (int num : numeros)
	    max = (num > max) ? num : max;
	return max;
    }

    public static double max(double... numeros) {
	double max = Double.MIN_VALUE;
	for (double num : numeros)
	    max = (num > max) ? num : max;
	return max;
    }
} // fim da classe Maximo
