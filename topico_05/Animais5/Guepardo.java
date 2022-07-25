public class Guepardo extends Animal implements Conversacao {
    private static final int VELOCIDADE_KMH = 130;

    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            somaMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
            System.out.printf("O guepardo correu %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }

    @Override
    public void falar() {
	System.out.println("Muito prazer! Eu sou um guepardo!");
    }
} // fim da classe Guepardo
