/* Argumentos.java
   Classe para demonstrar a passagem de argumentos pela linha de comando. */

public class Argumentos {
    public static void main(String[] args) {
	int len = args.length;

	if (len >= 2) {
	    System.out.println("Argumentos passados pela linha de comando:");
	    for (int i = 0; i < len; i++) {
		System.out.printf("%s%n", args[i]);
	    }
	} else {
	    System.out.println("Precisa passar pelo menos 2 argumentos!");
	}
    } // fim do método main
} // fim da classe Argumentos
